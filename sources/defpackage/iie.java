package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
public abstract class iie {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;

    public static boolean a(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = f;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            f = bool;
        }
        return bool.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        Boolean bool = d;
        if (bool == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            d = bool;
        }
        return bool.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        boolean z = false;
        if (resources == null) {
            return false;
        }
        Boolean bool = b;
        if (bool == null) {
            bool = Boolean.valueOf(((resources.getConfiguration().screenLayout & 15) > 3 || b(resources)) ? true : true);
            b = bool;
        }
        return bool.booleanValue();
    }

    public static boolean d(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = g;
        if (bool == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            } else {
                z = true;
            }
            bool = Boolean.valueOf(z);
            g = bool;
        }
        return bool.booleanValue();
    }
}
