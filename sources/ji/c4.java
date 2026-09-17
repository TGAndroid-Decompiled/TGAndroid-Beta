package ji;

import java.util.ArrayList;
import java.util.HashMap;
public final class c4 {
    public String f13869a;
    public boolean f13870b;
    public String f13871c;
    public HashMap d;
    public final ArrayList f13872e = new ArrayList();

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
