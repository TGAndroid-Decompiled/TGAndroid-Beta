package e5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f10538c = new HashSet();
    public final String f10539a;
    public final String f10540b;

    public c(String str, String str2) {
        this.f10539a = str;
        this.f10540b = str2;
        f10538c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f10537a;
        String str = this.f10540b;
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
