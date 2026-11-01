package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class v2 {
    public static boolean f18578a = true;
    public static final boolean f18579b;
    public static final String f18580c;
    public static final int d;
    public static final String e;
    public static final String f18581f;
    public static final String f18582g;
    public static String h;
    public static final boolean f18583i;
    public static Boolean f18584j;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f18579b = z10;
        f18580c = "13.2.0";
        d = 4;
        e = "014b35b6184100b085b0d0572f9b5103";
        f18581f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f18582g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f18583i = true;
        if (w0.f18945b != null) {
            w0.f18945b.getSharedPreferences("systemConfig", 0);
            f18578a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public final void uncaughtException(Thread thread, Throwable th2) {
                    f8.i(th2, false);
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
        if (f18584j == null) {
            if (w0.f18945b != null && "org.telegram.messenger.beta".equals(w0.f18945b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f18584j = Boolean.valueOf(z10);
        }
        return f18584j.booleanValue();
    }

    public static boolean b() {
        c5.m mVar;
        if (!u1.f18340n) {
            w0.u();
            a();
            w0.r();
            if (u1.i().k() && (mVar = u1.f18338l) != null) {
                ArrayList arrayList = mVar.h;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((c5.l) obj).f3798b.f3796a;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        c5.j jVar = (c5.j) obj2;
                        ArrayList arrayList3 = wp.r1(e20.f15506s0).f19181l7;
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj3 = arrayList3.get(i12);
                            i12++;
                            if (Objects.equals(jVar.f3795c, (String) obj3)) {
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
