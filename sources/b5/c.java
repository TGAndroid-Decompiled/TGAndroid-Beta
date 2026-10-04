package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f3677c = new HashSet();
    public final String f3678a;
    public final String f3679b;

    public c(String str, String str2) {
        this.f3678a = str;
        this.f3679b = str2;
        f3677c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3676a;
        String str = this.f3679b;
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
