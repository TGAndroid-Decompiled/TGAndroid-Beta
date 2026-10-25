package c5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f6136c = new HashSet();
    public final String f6137a;
    public final String f6138b;

    public c(String str, String str2) {
        this.f6137a = str;
        this.f6138b = str2;
        f6136c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f6135a;
        String str = this.f6138b;
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
