package mi;

import java.util.ArrayList;
import java.util.HashMap;
public final class a4 {
    public String f19459a;
    public boolean f19460b;
    public String f19461c;
    public HashMap d;
    public final ArrayList f19462e = new ArrayList();

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
