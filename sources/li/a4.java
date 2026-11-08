package li;

import java.util.ArrayList;
import java.util.HashMap;
public final class a4 {
    public String f18420a;
    public boolean f18421b;
    public String f18422c;
    public HashMap d;
    public final ArrayList f18423e = new ArrayList();

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
