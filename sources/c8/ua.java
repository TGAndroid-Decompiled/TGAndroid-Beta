package c8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.y80;
public abstract class ua {
    public static boolean a(y80 y80Var) {
        Context context = org.telegram.messenger.t0.f25566b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(y80Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && y80Var == y80.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(y80 y80Var) {
        y80[] values;
        int i7;
        Context context = org.telegram.messenger.t0.f25566b;
        PackageManager packageManager = context.getPackageManager();
        for (y80 y80Var2 : y80.values()) {
            ComponentName a10 = y80Var2.a(context);
            if (y80Var2 == y80Var) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            packageManager.setComponentEnabledSetting(a10, i7, 1);
        }
    }
}
