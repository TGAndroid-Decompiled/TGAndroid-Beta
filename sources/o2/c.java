package o2;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f16187c = new HashSet();
    public final String f16188a;
    public final String f16189b;

    public c(String str, String str2) {
        this.f16188a = str;
        this.f16189b = str2;
        f16187c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f16186a;
        String str = this.f16189b;
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
