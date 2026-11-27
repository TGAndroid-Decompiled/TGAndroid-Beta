package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.a;
public abstract class ere {
    public static boolean a(g26 g26Var) {
        Context context = a.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(g26Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && g26Var == g26.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(g26 g26Var) {
        g26[] values;
        int i;
        Context context = a.b;
        PackageManager packageManager = context.getPackageManager();
        for (g26 g26Var2 : g26.values()) {
            ComponentName a = g26Var2.a(context);
            if (g26Var2 == g26Var) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(a, i, 1);
        }
    }
}
