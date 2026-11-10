package org.telegram.messenger;

import android.app.AppOpsManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Process;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.crypto.Cipher;
public abstract class as {
    public static volatile boolean f21513a = false;
    public static final StringBuilder f21514b = new StringBuilder();
    public static final byte[] f21515c = {-1, -40, -1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, -1, -37, 0, 67, 0, 40, 28, 30, 35, 30, 25, 40, 35, 33, 35, 45, 43, 40, 48, 60, 100, 65, 60, 55, 55, 60, 123, 88, 93, 73, 100, -111, Byte.MIN_VALUE, -103, -106, -113, Byte.MIN_VALUE, -116, -118, -96, -76, -26, -61, -96, -86, -38, -83, -118, -116, -56, -1, -53, -38, -18, -11, -1, -1, -1, -101, -63, -1, -1, -1, -6, -1, -26, -3, -1, -8, -1, -37, 0, 67, 1, 43, 45, 45, 60, 53, 60, 118, 65, 65, 118, -8, -91, -116, -91, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -1, -64, 0, 17, 8, 0, 30, 0, 40, 3, 1, 34, 0, 2, 17, 1, 3, 17, 1, -1, -60, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, 51, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0};
    public static final byte[] d = {-1, -39};
    public static KeyStore f21516e;
    public static KeyPairGenerator f21517f;
    public static Boolean f21518g;
    public static Boolean h;
    public static int f21519i;
    public static SharedPreferences f21520j;

    public static boolean a() {
        Boolean bool = f21518g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, f21516e.getKey("tmessages_passcode", null));
            f21518g = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            f21518g = Boolean.TRUE;
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            f21518g = Boolean.FALSE;
            return false;
        }
    }

    public static void b(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.as.b(boolean):void");
    }

    public static Bitmap c(int i7, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static String d() {
        String str = "mips";
        String str2 = "armeabi";
        try {
            String str3 = Build.CPU_ABI;
            if (str3.equalsIgnoreCase("x86_64")) {
                str = "x86_64";
            } else if (str3.equalsIgnoreCase("arm64-v8a")) {
                str = "arm64-v8a";
            } else if (str3.equalsIgnoreCase("armeabi-v7a")) {
                str = "armeabi-v7a";
            } else {
                if (!str3.equalsIgnoreCase("armeabi")) {
                    if (str3.equalsIgnoreCase("x86")) {
                        str = "x86";
                    } else if (!str3.equalsIgnoreCase("mips")) {
                        if (r2.f25216a) {
                            a8.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("686")) {
            return "x86";
        }
        return str2;
    }

    public static KeyStore e() {
        KeyStore keyStore = f21516e;
        if (keyStore != null) {
            return keyStore;
        }
        try {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            f21516e = keyStore2;
            keyStore2.load(null);
            return f21516e;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static synchronized void f(android.content.Context r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.as.f(android.content.Context):void");
    }

    public static boolean g() {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) t0.f25570b.getSystemService("appops"), 10020, Integer.valueOf(Process.myUid()), t0.f25570b.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    public static boolean h() {
        try {
            return e().containsAlias("tmessages_passcode");
        } catch (KeyStoreException e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean i() {
        return !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.name"));
    }

    public static boolean j() {
        int intValue;
        Boolean bool = h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            h = Boolean.FALSE;
        }
        if (intValue < 100000) {
            return false;
        }
        f21519i = intValue - 90000;
        h = Boolean.TRUE;
        return h.booleanValue();
    }

    public static boolean k(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.as.k(android.content.Context, java.io.File, java.io.File, java.lang.String):boolean");
    }
}
