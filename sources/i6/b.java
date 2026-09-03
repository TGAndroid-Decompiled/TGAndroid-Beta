package i6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import y5.h;
public abstract class b {
    public static final char[] f7903a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static Boolean f7904b;
    public static Boolean f7905c;
    public static Boolean d;
    public static Boolean f7906e;

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, int i10) {
        if (g(context, "com.google.android.gms", i10)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h m9 = h.m(context);
                m9.getClass();
                if (packageInfo != null) {
                    if (!h.w(packageInfo, false)) {
                        if (h.w(packageInfo, true)) {
                            if (!y5.g.a((Context) m9.f50813b)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f7904b == null) {
            f7904b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f7904b.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f7905c == null) {
                f7905c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f7905c.booleanValue()) {
                if (!d() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean g(Context context, String str, int i10) {
        k6.b a2 = k6.c.a(context);
        a2.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a2.f10475a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i10, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
