package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
public abstract class j0 {
    public static Boolean f7655a;
    public static Boolean f7656b;
    public static Boolean f7657c;
    public static Boolean d;
    public static Boolean f7658e;
    public static Boolean f7659f;
    public static Boolean f7660g;

    public static boolean a(Context context) {
        boolean z10;
        PackageManager packageManager = context.getPackageManager();
        if (f7659f == null) {
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7659f = Boolean.valueOf(z10);
        }
        return f7659f.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            d = Boolean.valueOf(z10);
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f7656b == null) {
            f7656b = Boolean.valueOf(((resources.getConfiguration().screenLayout & 15) > 3 || b(resources)) ? true : true);
        }
        return f7656b.booleanValue();
    }

    public static boolean d(Context context) {
        boolean z10;
        PackageManager packageManager = context.getPackageManager();
        if (f7660g == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z10 = false;
            } else {
                z10 = true;
            }
            f7660g = Boolean.valueOf(z10);
        }
        return f7660g.booleanValue();
    }
}
