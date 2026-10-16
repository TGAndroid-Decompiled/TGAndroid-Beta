package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f14175b = false;
    public static boolean f14176c = false;
    public static final int e = 0;
    public static final AtomicBoolean f14174a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f14176c) {
                try {
                    PackageInfo e7 = w6.b.a(context).e(64, "com.google.android.gms");
                    h.a(context);
                    if (e7 != null && !h.c(e7, false) && h.c(e7, true)) {
                        f14175b = true;
                    } else {
                        f14175b = false;
                    }
                    f14176c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f14176c = true;
                }
            }
            if (!f14175b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f14176c = true;
            throw th2;
        }
    }

    public static int b(android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: k6.g.b(android.content.Context, int):int");
    }

    public static boolean c(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
