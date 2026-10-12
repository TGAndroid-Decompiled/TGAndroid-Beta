package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f2580c = new HashSet();
    public final String f2581a;
    public final String f2582b;

    public c(String str, String str2) {
        this.f2581a = str;
        this.f2582b = str2;
        f2580c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2579a;
        String str = this.f2582b;
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
