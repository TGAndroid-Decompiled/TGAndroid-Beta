package k7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ab0;
public abstract class i6 {
    public static boolean a(ab0 ab0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ab0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ab0Var == ab0.h)) {
            return true;
        }
        return false;
    }

    public static void b(ab0 ab0Var) {
        ab0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (ab0 ab0Var2 : ab0.values()) {
            ComponentName a2 = ab0Var2.a(context);
            if (ab0Var2 == ab0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
