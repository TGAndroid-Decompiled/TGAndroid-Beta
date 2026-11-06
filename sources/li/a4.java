package li;

import java.util.ArrayList;
import java.util.HashMap;
public final class a4 {
    public String f18417a;
    public boolean f18418b;
    public String f18419c;
    public HashMap d;
    public final ArrayList f18420e = new ArrayList();

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
