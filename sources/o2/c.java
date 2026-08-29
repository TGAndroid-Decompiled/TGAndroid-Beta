package o2;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f19055c = new HashSet();
    public final String f19056a;
    public final String f19057b;

    public c(String str, String str2) {
        this.f19056a = str;
        this.f19057b = str2;
        f19055c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f19054a;
        String str = this.f19057b;
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
