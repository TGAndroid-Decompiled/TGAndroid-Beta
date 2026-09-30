package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f3404c = new HashSet();
    public final String f3405a;
    public final String f3406b;

    public c(String str, String str2) {
        this.f3405a = str;
        this.f3406b = str2;
        f3404c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3403a;
        String str = this.f3406b;
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
