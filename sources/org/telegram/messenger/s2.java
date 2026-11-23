package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class s2 {
    public static boolean f26694a = true;
    public static final boolean f26695b;
    public static final String f26696c;
    public static final int d;
    public static final String f26697e;
    public static final String f26698f;
    public static final String f26699g;
    public static String h;
    public static final boolean f26700i;
    public static final boolean f26701j;
    public static Boolean f26702k;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f26695b = z10;
        f26696c = "13.3.2";
        d = 4;
        f26697e = "014b35b6184100b085b0d0572f9b5103";
        f26698f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f26699g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f26700i = true;
        f26701j = true;
        if (t0.f26895b != null) {
            t0.f26895b.getSharedPreferences("systemConfig", 0);
            f26694a = true;
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
        if (f26702k == null) {
            if (t0.f26895b != null && "org.telegram.messenger.beta".equals(t0.f26895b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f26702k = Boolean.valueOf(z10);
        }
        return f26702k.booleanValue();
    }

    public static boolean b() {
        f5.m mVar;
        if (!r1.f26512n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (mVar = r1.f26510l) != null) {
                ArrayList arrayList = mVar.h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f5.l) obj).f11293b.f11291a;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        f5.j jVar = (f5.j) obj2;
                        ArrayList arrayList3 = np.u1(k10.f24932t0).f25879n7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(jVar.f11290c, (String) obj3)) {
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
