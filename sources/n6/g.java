package n6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.biometric.t;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f21465b = false;
    public static boolean f21466c = false;
    public static final int f21467e = 0;
    public static final AtomicBoolean f21464a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        int i7;
        try {
            if (!f21466c) {
                try {
                    t a10 = z6.b.a(context);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = 134217792;
                    } else {
                        i7 = 64;
                    }
                    PackageInfo b10 = a10.b(i7, "com.google.android.gms");
                    h.a(context);
                    if (b10 != null && !h.b(b10, false) && h.b(b10, true)) {
                        f21465b = true;
                    } else {
                        f21465b = false;
                    }
                    f21466c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f21466c = true;
                }
            }
            if (!f21465b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f21466c = true;
            throw th2;
        }
    }

    public static int b(android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: n6.g.b(android.content.Context, int):int");
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
