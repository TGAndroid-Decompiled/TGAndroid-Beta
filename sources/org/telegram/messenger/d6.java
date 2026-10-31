package org.telegram.messenger;

import android.app.AppOpsManager;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import javax.crypto.Cipher;
public abstract class d6 {
    public static double f15184a;
    public static long f15185b;
    public static final String[] f15186c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static KeyStore d;
    public static KeyPairGenerator e;
    public static Boolean f15187f;
    public static Boolean f15188g;
    public static int h;
    public static SharedPreferences f15189i;

    public static boolean a() {
        Boolean bool = f15187f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, d.getKey("tmessages_passcode", null));
            f15187f = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            f15187f = Boolean.TRUE;
            return true;
        } catch (Exception e7) {
            f8.g(e7, true);
            f15187f = Boolean.FALSE;
            return false;
        }
    }

    public static void b(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d6.b(boolean):void");
    }

    public static boolean c() {
        File file = new File("/proc/bus/input/devices");
        ArrayList arrayList = null;
        if (file.canRead()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.startsWith("N: Name=\"")) {
                        String substring = readLine.substring(9, readLine.length() - 1);
                        if (!TextUtils.isEmpty(substring)) {
                            arrayList2.add(substring);
                        }
                    }
                }
                bufferedReader.close();
                arrayList = arrayList2;
            } catch (IOException e7) {
                f8.g(e7, true);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                for (int i11 = 0; i11 < 3; i11++) {
                    if (str.toLowerCase().contains(f15186c[i11])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static synchronized long d() {
        synchronized (d6.class) {
            if (f15185b != 0 && SystemClock.elapsedRealtime() - f15185b <= 60000) {
                return (long) f15184a;
            }
            return y2.f.c(w0.f19025b).a();
        }
    }

    public static KeyStore e() {
        KeyStore keyStore = d;
        if (keyStore != null) {
            return keyStore;
        }
        try {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            d = keyStore2;
            keyStore2.load(null);
            return d;
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static boolean f() {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) w0.f19025b.getSystemService("appops"), 10020, Integer.valueOf(Process.myUid()), w0.f19025b.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e7) {
            f8.g(e7, true);
            return true;
        }
    }

    public static boolean g() {
        if (d() >= 3000000) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        try {
            return e().containsAlias("tmessages_passcode");
        } catch (KeyStoreException e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static boolean i() {
        return !TextUtils.isEmpty(i0.k1("ro.miui.ui.version.name"));
    }

    public static boolean j() {
        int intValue;
        Boolean bool = f15188g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            f15188g = Boolean.FALSE;
        }
        if (intValue < 100000) {
            return false;
        }
        h = intValue - 90000;
        f15188g = Boolean.TRUE;
        return f15188g.booleanValue();
    }
}
