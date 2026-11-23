package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class s2 {
    public static boolean f26730a = true;
    public static final boolean f26731b;
    public static final String f26732c;
    public static final int d;
    public static final String f26733e;
    public static final String f26734f;
    public static final String f26735g;
    public static String h;
    public static final boolean f26736i;
    public static final boolean f26737j;
    public static Boolean f26738k;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f26731b = z10;
        f26732c = "13.3.2";
        d = 4;
        f26733e = "014b35b6184100b085b0d0572f9b5103";
        f26734f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f26735g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f26736i = true;
        f26737j = true;
        if (t0.f26931b != null) {
            t0.f26931b.getSharedPreferences("systemConfig", 0);
            f26730a = true;
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
        boolean z10;
        if (f26738k == null) {
            if (t0.f26931b != null && "org.telegram.messenger.beta".equals(t0.f26931b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f26738k = Boolean.valueOf(z10);
        }
        return f26738k.booleanValue();
    }

    public static boolean b() {
        f5.m mVar;
        if (!r1.f26548n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (mVar = r1.f26546l) != null) {
                ArrayList arrayList = mVar.h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f5.l) obj).f11330b.f11328a;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        f5.j jVar = (f5.j) obj2;
                        ArrayList arrayList3 = np.u1(k10.f24968t0).f25915n7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(jVar.f11327c, (String) obj3)) {
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
