package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class r2 {
    public static boolean f25191a = true;
    public static final boolean f25192b;
    public static final String f25193c;
    public static final int d;
    public static final String f25194e;
    public static final String f25195f;
    public static final String f25196g;
    public static String h;
    public static final boolean f25197i;
    public static final boolean f25198j;
    public static Boolean f25199k;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT <= 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        f25192b = z9;
        f25193c = "13.2.1";
        d = 4;
        f25194e = "014b35b6184100b085b0d0572f9b5103";
        f25195f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f25196g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f25197i = true;
        f25198j = true;
        if (t0.f25555b != null) {
            t0.f25555b.getSharedPreferences("systemConfig", 0);
            f25191a = true;
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
        if (f25199k == null) {
            if (t0.f25555b != null && "org.telegram.messenger.beta".equals(t0.f25555b.getPackageName())) {
                z9 = true;
            } else {
                z9 = false;
            }
            f25199k = Boolean.valueOf(z9);
        }
        return f25199k.booleanValue();
    }

    public static boolean b() {
        f5.l lVar;
        if (!r1.f25179n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (lVar = r1.f25177l) != null) {
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
                        ArrayList arrayList3 = qp.s1(p10.f24459s0).f24811k7;
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
