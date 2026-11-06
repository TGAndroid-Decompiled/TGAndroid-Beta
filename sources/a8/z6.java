package a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
public abstract class z6 {
    public static Boolean f742a;
    public static Boolean f743b;
    public static Boolean f744c;
    public static Boolean d;
    public static Boolean f745e;
    public static Boolean f746f;
    public static Boolean f747g;

    public static boolean a(Context context) {
        boolean z9;
        PackageManager packageManager = context.getPackageManager();
        if (f746f == null) {
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z9 = true;
            } else {
                z9 = false;
            }
            f746f = Boolean.valueOf(z9);
        }
        return f746f.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z9 = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z9 = true;
            }
            d = Boolean.valueOf(z9);
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        boolean z9 = false;
        if (resources == null) {
            return false;
        }
        if (f743b == null) {
            f743b = Boolean.valueOf(((resources.getConfiguration().screenLayout & 15) > 3 || b(resources)) ? true : true);
        }
        return f743b.booleanValue();
    }

    public static boolean d(Context context) {
        boolean z9;
        PackageManager packageManager = context.getPackageManager();
        if (f747g == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z9 = false;
            } else {
                z9 = true;
            }
            f747g = Boolean.valueOf(z9);
        }
        return f747g.booleanValue();
    }
}
