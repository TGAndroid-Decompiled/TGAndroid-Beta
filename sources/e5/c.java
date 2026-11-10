package e5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f10707c = new HashSet();
    public final String f10708a;
    public final String f10709b;

    public c(String str, String str2) {
        this.f10708a = str;
        this.f10709b = str2;
        f10707c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f10706a;
        String str = this.f10709b;
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
