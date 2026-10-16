package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f2584c = new HashSet();
    public final String f2585a;
    public final String f2586b;

    public c(String str, String str2) {
        this.f2585a = str;
        this.f2586b = str2;
        f2584c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2583a;
        String str = this.f2586b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (!hashSet.contains(str + ":dev")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
