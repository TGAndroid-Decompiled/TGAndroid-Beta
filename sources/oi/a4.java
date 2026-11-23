package oi;

import java.util.ArrayList;
import java.util.HashMap;
public final class a4 {
    public String f22028a;
    public boolean f22029b;
    public String f22030c;
    public HashMap d;
    public final ArrayList f22031e = new ArrayList();

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
