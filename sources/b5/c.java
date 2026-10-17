package b5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements e {
    public static final HashSet f4196c = new HashSet();
    public final String f4197a;
    public final String f4198b;

    public c(String str, String str2) {
        this.f4197a = str;
        this.f4198b = str2;
        f4196c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f4195a;
        String str = this.f4198b;
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
