package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class v2 {
    public static boolean f18448a = true;
    public static final boolean f18449b;
    public static final String f18450c;
    public static final int d;
    public static final String e;
    public static final String f18451f;
    public static final String f18452g;
    public static String h;
    public static final boolean f18453i;
    public static Boolean f18454j;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f18449b = z10;
        f18450c = "13.2.0";
        d = 4;
        e = "014b35b6184100b085b0d0572f9b5103";
        f18451f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f18452g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f18453i = true;
        if (w0.f19025b != null) {
            w0.f19025b.getSharedPreferences("systemConfig", 0);
            f18448a = true;
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
        if (f18454j == null) {
            if (w0.f19025b != null && "org.telegram.messenger.beta".equals(w0.f19025b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f18454j = Boolean.valueOf(z10);
        }
        return f18454j.booleanValue();
    }

    public static boolean b() {
        c5.m mVar;
        if (!u1.f18212n) {
            w0.u();
            a();
            w0.r();
            if (u1.i().k() && (mVar = u1.f18210l) != null) {
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
                        ArrayList arrayList3 = vp.r1(d20.f15147s0).f18838l7;
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
