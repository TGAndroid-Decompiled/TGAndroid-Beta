package e5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f10856c = new HashSet();
    public final String f10857a;
    public final String f10858b;

    public c(String str, String str2) {
        this.f10857a = str;
        this.f10858b = str2;
        f10856c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f10855a;
        String str = this.f10858b;
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
