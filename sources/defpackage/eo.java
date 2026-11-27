package defpackage;

import android.os.Build;
import java.util.HashSet;
public abstract class eo {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public eo(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public boolean b() {
        HashSet hashSet = bo.a;
        String str = this.b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
            return true;
        }
        return true;
    }
}
