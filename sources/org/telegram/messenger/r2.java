package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public abstract class r2 {
    public static boolean f26206a = true;
    public static final boolean f26207b;
    public static final String f26208c;
    public static final int d;
    public static final String f26209e;
    public static final String f26210f;
    public static final String f26211g;
    public static String h;
    public static final boolean f26212i;
    public static final boolean f26213j;
    public static Boolean f26214k;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f26207b = z10;
        f26208c = "13.3.0";
        d = 4;
        f26209e = "014b35b6184100b085b0d0572f9b5103";
        f26210f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        f26211g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        f26212i = true;
        f26213j = true;
        if (t0.f26609b != null) {
            t0.f26609b.getSharedPreferences("systemConfig", 0);
            f26206a = true;
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
        if (f26214k == null) {
            if (t0.f26609b != null && "org.telegram.messenger.beta".equals(t0.f26609b.getPackageName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            f26214k = Boolean.valueOf(z10);
        }
        return f26214k.booleanValue();
    }

    public static boolean b() {
        f5.m mVar;
        if (!r1.f26196n) {
            t0.u();
            a();
            t0.r();
            if (r1.i().k() && (mVar = r1.f26194l) != null) {
                ArrayList arrayList = mVar.h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f5.l) obj).f10993b.f10991a;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        f5.j jVar = (f5.j) obj2;
                        ArrayList arrayList3 = np.s1(m10.f24940t0).f25333l7;
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            if (Objects.equals(jVar.f10990c, (String) obj3)) {
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
