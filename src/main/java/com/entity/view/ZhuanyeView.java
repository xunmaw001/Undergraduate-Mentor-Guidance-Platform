package com.entity.view;

import com.entity.ZhuanyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 13:26:15
 */
@TableName("zhuanye")
public class ZhuanyeView  extends ZhuanyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyeView(){
	}
 
 	public ZhuanyeView(ZhuanyeEntity zhuanyeEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
