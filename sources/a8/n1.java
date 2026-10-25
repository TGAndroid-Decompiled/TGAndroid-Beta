package a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
public abstract class n1 {
    public static Boolean f620a;
    public static Boolean f621b;
    public static Boolean f622c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f623f;
    public static Boolean f624g;

    public static boolean a(Context context) {
        boolean z10;
        PackageManager packageManager = context.getPackageManager();
        if (f623f == null) {
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            } else {
                z10 = false;
            }
            f623f = Boolean.valueOf(z10);
        }
        return f623f.booleanValue();
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
        if (f621b == null) {
            f621b = Boolean.valueOf(((resources.getConfiguration().screenLayout & 15) > 3 || b(resources)) ? true : true);
        }
        return f621b.booleanValue();
    }

    public static boolean d(Context context) {
        boolean z10;
        PackageManager packageManager = context.getPackageManager();
        if (f624g == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z10 = false;
            } else {
                z10 = true;
            }
            f624g = Boolean.valueOf(z10);
        }
        return f624g.booleanValue();
    }
}
