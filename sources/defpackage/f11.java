package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
import org.telegram.messenger.a;
public abstract class f11 {
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
        c = "13.4.1";
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
                    cc4.i(th, false);
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
        wo8 wo8Var;
        if (!di0.n) {
            a.t();
            a();
            a.q();
            if (di0.h().j() && (wo8Var = di0.l) != null) {
                ArrayList arrayList = wo8Var.h;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ArrayList arrayList2 = ((vo8) obj).b.a;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        uo8 uo8Var = (uo8) obj2;
                        for (String str : uc7.s1(yac.t0).l4.I3.f) {
                            if (Objects.equals(uo8Var.c, str)) {
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
