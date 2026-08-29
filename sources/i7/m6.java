package i7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.sa0;
public abstract class m6 {
    public static boolean a(sa0 sa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(sa0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && sa0Var == sa0.h)) {
            return true;
        }
        return false;
    }

    public static void b(sa0 sa0Var) {
        sa0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (sa0 sa0Var2 : sa0.values()) {
            ComponentName a2 = sa0Var2.a(context);
            if (sa0Var2 == sa0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
