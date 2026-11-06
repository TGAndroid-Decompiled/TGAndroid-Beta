package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class r2 {
    public static boolean f25199a = true;
    public static final boolean f25200b;
    public static final String f25201c;
    public static final int d;
    public static final String f25202e;
    public static final String f25203f;
    public static final String f25204g;
    public static String h;
    public static final boolean f25205i;
    public static final boolean f25206j;
    public static Boolean f25207k;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT <= 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        f25200b = z9;
        f25201c = "13.2.1";
        d = 4;
        f25202e = "014b35b6184100b085b0d0572f9b5103";
        f25203f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f25204g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f25205i = true;
        f25206j = true;
        if (t0.f25563b != null) {
            t0.f25563b.getSharedPreferences("systemConfig", 0);
            f25199a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public final void uncaughtException(Thread thread, Throwable th2) {
                    a8.i(th2, false);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                    }
                }
            });
        }
    }

    public static boolean a() {
        boolean z9;
        if (f25207k == null) {
            if (t0.f25563b != null && "org.telegram.messenger.beta".equals(t0.f25563b.getPackageName())) {
                z9 = true;
            } else {
                z9 = false;
            }
            f25207k = Boolean.valueOf(z9);
        }
        return f25207k.booleanValue();
    }

    public static boolean b() {
        f5.l lVar;
        if (!r1.f25187n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (lVar = r1.f25185l) != null) {
                ArrayList arrayList = lVar.h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f5.k) obj).f11165b.f11163a;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        f5.i iVar = (f5.i) obj2;
                        ArrayList arrayList3 = qp.s1(p10.f24467s0).f24819k7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(iVar.f11162c, (String) obj3)) {
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
