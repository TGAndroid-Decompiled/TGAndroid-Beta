package b8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.t80;
public abstract class uf {
    public static boolean a(t80 t80Var) {
        Context context = org.telegram.messenger.t0.f25457b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(t80Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && t80Var == t80.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(t80 t80Var) {
        t80[] values;
        int i3;
        Context context = org.telegram.messenger.t0.f25457b;
        PackageManager packageManager = context.getPackageManager();
        for (t80 t80Var2 : t80.values()) {
            ComponentName a10 = t80Var2.a(context);
            if (t80Var2 == t80Var) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            packageManager.setComponentEnabledSetting(a10, i3, 1);
        }
    }
}
