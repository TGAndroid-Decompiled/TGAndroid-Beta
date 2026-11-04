package m6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f19192b = false;
    public static boolean f19193c = false;
    public static final int f19194e = 0;
    public static final AtomicBoolean f19191a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        int i3;
        try {
            if (!f19193c) {
                try {
                    androidx.emoji2.text.n a10 = y6.b.a(context);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i3 = 134217792;
                    } else {
                        i3 = 64;
                    }
                    PackageInfo d10 = a10.d(i3, "com.google.android.gms");
                    h.a(context);
                    if (d10 != null && !h.b(d10, false) && h.b(d10, true)) {
                        f19192b = true;
                    } else {
                        f19192b = false;
                    }
                    f19193c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f19193c = true;
                }
            }
            if (!f19192b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f19193c = true;
            throw th2;
        }
    }

    public static int b(android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: m6.g.b(android.content.Context, int):int");
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
