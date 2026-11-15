package oi;

import java.util.ArrayList;
import java.util.HashMap;
public final class x3 {
    public String f22120a;
    public boolean f22121b;
    public String f22122c;
    public HashMap d;
    public final ArrayList f22123e = new ArrayList();

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
