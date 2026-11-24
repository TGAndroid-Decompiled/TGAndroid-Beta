package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.a;
public abstract class moe {
    public static boolean a(c26 c26Var) {
        Context context = a.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(c26Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && c26Var == c26.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(c26 c26Var) {
        c26[] values;
        int i;
        Context context = a.b;
        PackageManager packageManager = context.getPackageManager();
        for (c26 c26Var2 : c26.values()) {
            ComponentName a = c26Var2.a(context);
            if (c26Var2 == c26Var) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(a, i, 1);
        }
    }
}
