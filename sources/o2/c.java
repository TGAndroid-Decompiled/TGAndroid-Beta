package o2;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f16346c = new HashSet();
    public final String f16347a;
    public final String f16348b;

    public c(String str, String str2) {
        this.f16347a = str;
        this.f16348b = str2;
        f16346c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f16345a;
        String str = this.f16348b;
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
