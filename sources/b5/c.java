package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f2510c = new HashSet();
    public final String f2511a;
    public final String f2512b;

    public c(String str, String str2) {
        this.f2511a = str;
        this.f2512b = str2;
        f2510c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2509a;
        String str = this.f2512b;
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
