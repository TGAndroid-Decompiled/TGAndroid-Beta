package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class axe {
    public static boolean a(Context context, int i) {
        if (b(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                cz4 a = cz4.a(context);
                if (packageInfo != null) {
                    if (!cz4.b(packageInfo, false)) {
                        if (cz4.b(packageInfo, true)) {
                            if (!yy4.b(a.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean b(int i, Context context, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ryc.a(context).a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
