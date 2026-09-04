package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f2483c = new HashSet();
    public final String f2484a;
    public final String f2485b;

    public c(String str, String str2) {
        this.f2484a = str;
        this.f2485b = str2;
        f2483c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2482a;
        String str = this.f2485b;
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
