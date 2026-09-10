package hi;

import java.util.ArrayList;
import java.util.HashMap;
public final class f4 {
    public String f9569a;
    public boolean f9570b;
    public String f9571c;
    public HashMap d;
    public final ArrayList e = new ArrayList();

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
