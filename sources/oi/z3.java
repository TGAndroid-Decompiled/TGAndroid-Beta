package oi;

import java.util.ArrayList;
import java.util.HashMap;
public final class z3 {
    public String f22549a;
    public boolean f22550b;
    public String f22551c;
    public HashMap d;
    public final ArrayList f22552e = new ArrayList();

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
