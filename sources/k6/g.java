package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f14678b = false;
    public static boolean f14679c = false;
    public static final int f14680e = 0;
    public static final AtomicBoolean f14677a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f14679c) {
                try {
                    PackageInfo b10 = w6.b.a(context).b(64, "com.google.android.gms");
                    h.b(context);
                    if (b10 != null && !h.d(b10, false) && h.d(b10, true)) {
                        f14678b = true;
                    } else {
                        f14678b = false;
                    }
                    f14679c = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    f14679c = true;
                }
            }
            if (!f14678b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f14679c = true;
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
