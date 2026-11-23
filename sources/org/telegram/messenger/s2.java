package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class s2 {
    public static boolean f26829a = true;
    public static final boolean f26830b;
    public static final String f26831c;
    public static final int d;
    public static final String f26832e;
    public static final String f26833f;
    public static final String f26834g;
    public static String h;
    public static final boolean f26835i;
    public static final boolean f26836j;
    public static Boolean f26837k;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f26830b = z10;
        f26831c = "13.3.2";
        d = 4;
        f26832e = "014b35b6184100b085b0d0572f9b5103";
        f26833f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f26834g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f26835i = true;
        f26836j = true;
        if (t0.f27013b != null) {
            t0.f27013b.getSharedPreferences("systemConfig", 0);
            f26829a = true;
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
        if (f26837k == null) {
            if (t0.f27013b != null && "org.telegram.messenger.beta".equals(t0.f27013b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f26837k = Boolean.valueOf(z10);
        }
        return f26837k.booleanValue();
    }

    public static boolean b() {
        f5.m mVar;
        if (!r1.f26624n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (mVar = r1.f26622l) != null) {
                ArrayList arrayList = mVar.h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f5.l) obj).f11292b.f11290a;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        f5.j jVar = (f5.j) obj2;
                        ArrayList arrayList3 = mp.u1(i10.f24637t0).f25811n7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(jVar.f11289c, (String) obj3)) {
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
