package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.a;
public abstract class jme {
    public static boolean a(c06 c06Var) {
        Context context = a.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(c06Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && c06Var == c06.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(c06 c06Var) {
        c06[] values;
        int i;
        Context context = a.b;
        PackageManager packageManager = context.getPackageManager();
        for (c06 c06Var2 : c06.values()) {
            ComponentName a = c06Var2.a(context);
            if (c06Var2 == c06Var) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(a, i, 1);
        }
    }
}
