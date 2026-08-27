package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ta0;

public abstract class g6 {
    public static boolean a(ta0 ta0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ta0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ta0Var == ta0.h);
    }

    public static void b(ta0 ta0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ta0[] ta0VarArrValues = ta0.values();
        int length = ta0VarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            ta0 ta0Var2 = ta0VarArrValues[i10];
            packageManager.setComponentEnabledSetting(ta0Var2.a(context), ta0Var2 == ta0Var ? 1 : 2, 1);
        }
    }
}
