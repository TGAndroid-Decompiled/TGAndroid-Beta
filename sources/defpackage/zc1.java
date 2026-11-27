package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
public final class zc1 {
    public static final String[] o = {"34", "37"};
    public static final String[] p = {"60", "62", "64", "65"};
    public static final String[] q = {"35"};
    public static final String[] r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] s = {"4"};
    public static final String[] t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public zc1(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.a = lze.e(replaceAll);
        this.m = num;
        this.n = num2;
        this.b = lze.e(str2);
        this.c = lze.e(str3);
        this.d = lze.e(str4);
        this.e = lze.e(str5);
        this.f = lze.e(str6);
        this.g = lze.e(str7);
        this.h = lze.e(str8);
        this.i = lze.e(str9);
        this.k = lze.a(str10) == null ? c() : str10;
        if (lze.e(str11) == null) {
            str16 = d();
        } else {
            str16 = str11;
        }
        this.j = str16;
        lze.e(str12);
        lze.b(str13);
        lze.e(str14);
        this.l = lze.e(str15);
    }

    public final void a(oy8 oy8Var) {
        rx6.v();
        rx6.v();
        ((lh2) this.d).i();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                ((sj) this.i).a(new uy2((byte) 1));
                ((yy2) this.f).i();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (oy8Var.c().b.a) {
                if (!((yy2) this.f).d(oy8Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                ((yy2) this.f).j(((TaskCompletionSource) ((AtomicReference) oy8Var.h).get()).getTask());
                return;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
            }
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } finally {
            e();
        }
    }

    public final void b(oy8 oy8Var) {
        Future<?> submit = ((i03) ((rx6) this.n).b).a.submit(new zy2(this, oy8Var, (byte) 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final String c() {
        String str;
        String str2 = (String) this.a;
        if (lze.d((String) this.k) && !lze.d(str2)) {
            if (lze.c(str2, o)) {
                str = "American Express";
            } else if (lze.c(str2, p)) {
                str = "Discover";
            } else if (lze.c(str2, q)) {
                str = "JCB";
            } else if (lze.c(str2, r)) {
                str = "Diners Club";
            } else if (lze.c(str2, s)) {
                str = "Visa";
            } else if (lze.c(str2, t)) {
                str = "MasterCard";
            } else {
                str = "Unknown";
            }
            this.k = str;
        }
        return (String) this.k;
    }

    public final String d() {
        String str = (String) this.a;
        if (!lze.d((String) this.j)) {
            return (String) this.j;
        }
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.j = substring;
            return substring;
        }
        return null;
    }

    public final void e() {
        rx6.v();
        try {
            lh2 lh2Var = (lh2) this.d;
            if (!new File((File) ((gd4) lh2Var.c).c, (String) lh2Var.b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public zc1(ji4 ji4Var, yl5 yl5Var, az2 az2Var, p63 p63Var, sj sjVar, sj sjVar2, gd4 gd4Var, ty2 ty2Var, pq8 pq8Var, rx6 rx6Var) {
        this.b = p63Var;
        ji4Var.a();
        this.a = ji4Var.a;
        this.g = yl5Var;
        this.l = az2Var;
        this.i = sjVar;
        this.j = sjVar2;
        this.h = gd4Var;
        this.k = ty2Var;
        this.m = pq8Var;
        this.n = rx6Var;
        System.currentTimeMillis();
        this.c = new ym4((byte) 11);
    }
}
