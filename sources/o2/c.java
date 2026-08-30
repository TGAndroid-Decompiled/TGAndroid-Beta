package o2;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f16207c = new HashSet();
    public final String f16208a;
    public final String f16209b;

    public c(String str, String str2) {
        this.f16208a = str;
        this.f16209b = str2;
        f16207c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f16206a;
        String str = this.f16209b;
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
