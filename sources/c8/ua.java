package c8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.w80;
public abstract class ua {
    public static boolean a(w80 w80Var) {
        Context context = org.telegram.messenger.t0.f25563b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(w80Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && w80Var == w80.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(w80 w80Var) {
        w80[] values;
        int i7;
        Context context = org.telegram.messenger.t0.f25563b;
        PackageManager packageManager = context.getPackageManager();
        for (w80 w80Var2 : w80.values()) {
            ComponentName a10 = w80Var2.a(context);
            if (w80Var2 == w80Var) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            packageManager.setComponentEnabledSetting(a10, i7, 1);
        }
    }
}
