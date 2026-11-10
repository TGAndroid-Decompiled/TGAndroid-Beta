package c8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.z80;
public abstract class ua {
    public static boolean a(z80 z80Var) {
        Context context = org.telegram.messenger.t0.f25570b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(z80Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z80Var == z80.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(z80 z80Var) {
        z80[] values;
        int i7;
        Context context = org.telegram.messenger.t0.f25570b;
        PackageManager packageManager = context.getPackageManager();
        for (z80 z80Var2 : z80.values()) {
            ComponentName a10 = z80Var2.a(context);
            if (z80Var2 == z80Var) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            packageManager.setComponentEnabledSetting(a10, i7, 1);
        }
    }
}
