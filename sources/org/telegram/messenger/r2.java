package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class r2 {
    public static boolean f25216a = true;
    public static final boolean f25217b;
    public static final String f25218c;
    public static final int d;
    public static final String f25219e;
    public static final String f25220f;
    public static final String f25221g;
    public static String h;
    public static final boolean f25222i;
    public static final boolean f25223j;
    public static Boolean f25224k;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT <= 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        f25217b = z9;
        f25218c = "13.2.2";
        d = 4;
        f25219e = "014b35b6184100b085b0d0572f9b5103";
        f25220f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f25221g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f25222i = true;
        f25223j = true;
        if (t0.f25570b != null) {
            t0.f25570b.getSharedPreferences("systemConfig", 0);
            f25216a = true;
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
        if (f25224k == null) {
            if (t0.f25570b != null && "org.telegram.messenger.beta".equals(t0.f25570b.getPackageName())) {
                z9 = true;
            } else {
                z9 = false;
            }
            f25224k = Boolean.valueOf(z9);
        }
        return f25224k.booleanValue();
    }

    public static boolean b() {
        f5.l lVar;
        if (!r1.f25204n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (lVar = r1.f25202l) != null) {
                ArrayList arrayList = lVar.h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f5.k) obj).f11170b.f11168a;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        f5.i iVar = (f5.i) obj2;
                        ArrayList arrayList3 = qp.s1(p10.f24474s0).f24830k7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(iVar.f11167c, (String) obj3)) {
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
