package g6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.biometric.t;
import java.io.Closeable;
import java.io.IOException;
import w5.h;
public abstract class b {
    public static final char[] f7110a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static Boolean f7111b;
    public static Boolean f7112c;
    public static Boolean d;
    public static Boolean f7113e;

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
                h b10 = h.b(context);
                b10.getClass();
                if (packageInfo != null) {
                    if (!h.d(packageInfo, false)) {
                        if (h.d(packageInfo, true)) {
                            if (!w5.g.a(b10.f49776a)) {
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
        if (f7111b == null) {
            f7111b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f7111b.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f7112c == null) {
                f7112c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f7112c.booleanValue()) {
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
        t a2 = i6.b.a(context);
        a2.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a2.f1053a.getSystemService("appops");
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
