package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f3412c = new HashSet();
    public final String f3413a;
    public final String f3414b;

    public c(String str, String str2) {
        this.f3413a = str;
        this.f3414b = str2;
        f3412c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3411a;
        String str = this.f3414b;
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
