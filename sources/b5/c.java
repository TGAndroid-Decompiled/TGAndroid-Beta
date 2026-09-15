package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f3407c = new HashSet();
    public final String f3408a;
    public final String f3409b;

    public c(String str, String str2) {
        this.f3408a = str;
        this.f3409b = str2;
        f3407c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3406a;
        String str = this.f3409b;
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
