package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f3406c = new HashSet();
    public final String f3407a;
    public final String f3408b;

    public c(String str, String str2) {
        this.f3407a = str;
        this.f3408b = str2;
        f3406c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3405a;
        String str = this.f3408b;
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
