package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f2105c = new HashSet();
    public final String f2106a;
    public final String f2107b;

    public c(String str, String str2) {
        this.f2106a = str;
        this.f2107b = str2;
        f2105c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f2104a;
        String str = this.f2107b;
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
