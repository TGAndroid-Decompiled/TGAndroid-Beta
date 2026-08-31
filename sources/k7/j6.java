package k7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.bb0;
public abstract class j6 {
    public static boolean a(bb0 bb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(bb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && bb0Var == bb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(bb0 bb0Var) {
        bb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (bb0 bb0Var2 : bb0.values()) {
            ComponentName a2 = bb0Var2.a(context);
            if (bb0Var2 == bb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
