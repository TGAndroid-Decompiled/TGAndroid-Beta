package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f2485c = new HashSet();
    public final String f2486a;
    public final String f2487b;

    public c(String str, String str2) {
        this.f2486a = str;
        this.f2487b = str2;
        f2485c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2484a;
        String str = this.f2487b;
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
