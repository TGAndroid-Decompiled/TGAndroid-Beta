package j7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
public abstract class y {
    public static Boolean f9803a;
    public static Boolean f9804b;
    public static Boolean f9805c;
    public static Boolean d;
    public static Boolean f9806e;
    public static Boolean f9807f;
    public static Boolean f9808g;

    public static boolean a(Context context) {
        boolean z4;
        PackageManager packageManager = context.getPackageManager();
        if (f9807f == null) {
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z4 = true;
            } else {
                z4 = false;
            }
            f9807f = Boolean.valueOf(z4);
        }
        return f9807f.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z4 = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z4 = true;
            }
            d = Boolean.valueOf(z4);
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        boolean z4 = false;
        if (resources == null) {
            return false;
        }
        if (f9804b == null) {
            f9804b = Boolean.valueOf(((resources.getConfiguration().screenLayout & 15) > 3 || b(resources)) ? true : true);
        }
        return f9804b.booleanValue();
    }

    public static boolean d(Context context) {
        boolean z4;
        PackageManager packageManager = context.getPackageManager();
        if (f9808g == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z4 = false;
            } else {
                z4 = true;
            }
            f9808g = Boolean.valueOf(z4);
        }
        return f9808g.booleanValue();
    }
}
