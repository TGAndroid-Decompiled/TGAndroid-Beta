package ii;

import java.util.ArrayList;
import java.util.HashMap;
public final class e4 {
    public String f12395a;
    public boolean f12396b;
    public String f12397c;
    public HashMap d;
    public final ArrayList f12398e = new ArrayList();

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
