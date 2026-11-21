package e5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f10882c = new HashSet();
    public final String f10883a;
    public final String f10884b;

    public c(String str, String str2) {
        this.f10883a = str;
        this.f10884b = str2;
        f10882c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f10881a;
        String str = this.f10884b;
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
