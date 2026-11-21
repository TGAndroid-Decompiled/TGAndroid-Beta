package oi;

import java.util.ArrayList;
import java.util.HashMap;
public final class a4 {
    public String f21959a;
    public boolean f21960b;
    public String f21961c;
    public HashMap d;
    public final ArrayList f21962e = new ArrayList();

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
