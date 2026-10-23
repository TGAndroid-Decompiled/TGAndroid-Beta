package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f4200c = new HashSet();
    public final String f4201a;
    public final String f4202b;

    public c(String str, String str2) {
        this.f4201a = str;
        this.f4202b = str2;
        f4200c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f4199a;
        String str = this.f4202b;
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
