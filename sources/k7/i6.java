package k7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.cb0;
public abstract class i6 {
    public static boolean a(cb0 cb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(cb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && cb0Var == cb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(cb0 cb0Var) {
        cb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (cb0 cb0Var2 : cb0.values()) {
            ComponentName a2 = cb0Var2.a(context);
            if (cb0Var2 == cb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
