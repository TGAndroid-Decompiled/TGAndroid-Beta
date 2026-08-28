package g7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.pa0;
public abstract class l6 {
    public static boolean a(pa0 pa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(pa0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && pa0Var == pa0.h)) {
            return true;
        }
        return false;
    }

    public static void b(pa0 pa0Var) {
        pa0[] values;
        int i9;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (pa0 pa0Var2 : pa0.values()) {
            ComponentName a2 = pa0Var2.a(context);
            if (pa0Var2 == pa0Var) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i9, 1);
        }
    }
}
