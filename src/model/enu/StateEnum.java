/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.enu;

/**
 *
 * @author HP 240 G6
 */
public enum StateEnum {
    
    INACTIVE ("Inactive"),
    ACTIVE ("Active");
    
    private String stateName;
    
    private StateEnum(String name){
        this.stateName = name;
    }
    
    public String getStateName(){
        return stateName;
    }
}
