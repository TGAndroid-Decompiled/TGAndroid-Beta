package oi;

import java.util.ArrayList;
import java.util.HashMap;
public final class z3 {
    public String f22544a;
    public boolean f22545b;
    public String f22546c;
    public HashMap d;
    public final ArrayList f22547e = new ArrayList();

    public final String a(String str) {
        HashMap hashMap = this.d;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get(str);
    }

    public final boolean b(String str) {
        HashMap hashMap = this.d;
        if (hashMap != null && hashMap.containsKey(str)) {
            return true;
        }
        return false;
    }
}
