package ii;

import java.util.ArrayList;
import java.util.HashMap;
public final class d4 {
    public String f12300a;
    public boolean f12301b;
    public String f12302c;
    public HashMap d;
    public final ArrayList f12303e = new ArrayList();

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
