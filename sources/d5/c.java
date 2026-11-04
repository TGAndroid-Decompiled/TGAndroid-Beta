package d5;

import android.os.Build;
import java.util.HashSet;
public abstract class c implements d {
    public static final HashSet f8568c = new HashSet();
    public final String f8569a;
    public final String f8570b;

    public c(String str, String str2) {
        this.f8569a = str;
        this.f8570b = str2;
        f8568c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f8567a;
        String str = this.f8570b;
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
