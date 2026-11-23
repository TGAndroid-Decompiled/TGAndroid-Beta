package e5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f10846c = new HashSet();
    public final String f10847a;
    public final String f10848b;

    public c(String str, String str2) {
        this.f10847a = str;
        this.f10848b = str2;
        f10846c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f10845a;
        String str = this.f10848b;
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
