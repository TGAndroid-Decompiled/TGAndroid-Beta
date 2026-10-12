package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f3754c = new HashSet();
    public final String f3755a;
    public final String f3756b;

    public c(String str, String str2) {
        this.f3755a = str;
        this.f3756b = str2;
        f3754c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3753a;
        String str = this.f3756b;
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
