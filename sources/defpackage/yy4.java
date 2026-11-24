package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class yy4 {
    public static boolean b = false;
    public static boolean c = false;
    public static final int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static boolean b(Context context) {
        int i;
        try {
            if (!c) {
                p13 a2 = ryc.a(context);
                if (Build.VERSION.SDK_INT >= 28) {
                    i = 134217792;
                } else {
                    i = 64;
                }
                PackageInfo e2 = a2.e(i, "com.google.android.gms");
                cz4.a(context);
                if (e2 != null && !cz4.b(e2, false) && cz4.b(e2, true)) {
                    b = true;
                } else {
                    b = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
        } finally {
            c = true;
        }
        if (!b && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    public static int c(android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy4.c(android.content.Context, int):int");
    }

    public static boolean d(Context context) {
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
