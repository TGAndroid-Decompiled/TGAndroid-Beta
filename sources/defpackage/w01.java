package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
import org.telegram.messenger.a;
public abstract class w01 {
    public static boolean a = true;
    public static final boolean b;
    public static final String c;
    public static final byte d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static String h;
    public static final boolean i;
    public static final boolean j;
    public static Boolean k;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT <= 29) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        c = "13.3.2";
        d = (byte) 4;
        e = "014b35b6184100b085b0d0572f9b5103";
        f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        i = true;
        j = true;
        if (a.b != null) {
            a.b.getSharedPreferences("systemConfig", 0);
            a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public final void uncaughtException(Thread thread, Throwable th) {
                    fa4.i(th, false);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
    }

    public static boolean a() {
        boolean z;
        Boolean bool = k;
        if (bool == null) {
            if (a.b != null && "org.telegram.messenger.beta".equals(a.b.getPackageName())) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            k = bool;
        }
        return bool.booleanValue();
    }

    public static boolean b() {
        kl8 kl8Var;
        if (!ci0.n) {
            a.t();
            a();
            a.q();
            if (ci0.h().j() && (kl8Var = ci0.l) != null) {
                ArrayList arrayList = kl8Var.h;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ArrayList arrayList2 = ((jl8) obj).b.a;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        hl8 hl8Var = (hl8) obj2;
                        for (String str : na7.q1(y6c.t0).k4.A3.f) {
                            if (Objects.equals(hl8Var.c, str)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
