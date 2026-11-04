package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class r2 {
    public static boolean f25040a = true;
    public static final boolean f25041b;
    public static final String f25042c;
    public static final int d;
    public static final String f25043e;
    public static final String f25044f;
    public static final String f25045g;
    public static String h;
    public static final boolean f25046i;
    public static Boolean f25047j;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f25041b = z10;
        f25042c = "13.2.0";
        d = 4;
        f25043e = "014b35b6184100b085b0d0572f9b5103";
        f25044f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f25045g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f25046i = true;
        if (t0.f25457b != null) {
            t0.f25457b.getSharedPreferences("systemConfig", 0);
            f25040a = true;
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
        if (f25047j == null) {
            if (t0.f25457b != null && "org.telegram.messenger.beta".equals(t0.f25457b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f25047j = Boolean.valueOf(z10);
        }
        return f25047j.booleanValue();
    }

    public static boolean b() {
        e5.l lVar;
        if (!r1.f25030n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (lVar = r1.f25028l) != null) {
                ArrayList arrayList = lVar.h;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ArrayList arrayList2 = ((e5.k) obj).f9608b.f9606b;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        e5.i iVar = (e5.i) obj2;
                        ArrayList arrayList3 = hp.s1(h10.f22829t0).f23050k7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(iVar.f9604c, (String) obj3)) {
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
