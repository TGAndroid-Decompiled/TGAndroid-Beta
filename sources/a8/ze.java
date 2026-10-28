package a8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ua0;
public abstract class ze {
    public static boolean a(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ua0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ua0Var == ua0.h)) {
            return true;
        }
        return false;
    }

    public static void b(ua0 ua0Var) {
        ua0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (ua0 ua0Var2 : ua0.values()) {
            ComponentName a2 = ua0Var2.a(context);
            if (ua0Var2 == ua0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
