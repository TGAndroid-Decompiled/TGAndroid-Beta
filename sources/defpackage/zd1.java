package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
public final class zd1 {
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

    public zd1(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.a = uwe.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.m = num;
        this.n = num2;
        this.b = uwe.e(str2);
        this.c = uwe.e(str3);
        this.d = uwe.e(str4);
        this.e = uwe.e(str5);
        this.f = uwe.e(str6);
        this.g = uwe.e(str7);
        this.h = uwe.e(str8);
        this.i = uwe.e(str9);
        this.k = uwe.a(str10) == null ? c() : str10;
        this.j = uwe.e(str11) == null ? d() : str11;
        uwe.e(str12);
        uwe.b(str13);
        uwe.e(str14);
        this.l = uwe.e(str15);
    }

    public final void a(ex8 ex8Var) {
        mx6.w();
        mx6.w();
        ((lx6) this.d).k();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                ((rk) this.i).a(new a32((byte) 27));
                ((nz2) this.f).i();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (ex8Var.c().b.a) {
                if (!((nz2) this.f).d(ex8Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                ((nz2) this.f).j(((TaskCompletionSource) ((AtomicReference) ex8Var.h).get()).getTask());
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

    public final void b(ex8 ex8Var) {
        Future<?> submit = ((a13) ((mx6) this.n).b).a.submit(new oz2(this, ex8Var, (byte) 1));
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
        if (uwe.d((String) this.k) && !uwe.d(str2)) {
            if (uwe.c(str2, o)) {
                str = "American Express";
            } else if (uwe.c(str2, p)) {
                str = "Discover";
            } else if (uwe.c(str2, q)) {
                str = "JCB";
            } else if (uwe.c(str2, r)) {
                str = "Diners Club";
            } else if (uwe.c(str2, s)) {
                str = "Visa";
            } else if (uwe.c(str2, t)) {
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
        if (!uwe.d((String) this.j)) {
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
        mx6.w();
        try {
            lx6 lx6Var = (lx6) this.d;
            if (!new File((File) ((jd4) lx6Var.c).c, (String) lx6Var.b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public zd1(li4 li4Var, vl5 vl5Var, qz2 qz2Var, i73 i73Var, rk rkVar, rk rkVar2, jd4 jd4Var, jz2 jz2Var, et8 et8Var, mx6 mx6Var) {
        this.b = i73Var;
        li4Var.a();
        this.a = li4Var.a;
        this.g = vl5Var;
        this.l = qz2Var;
        this.i = rkVar;
        this.j = rkVar2;
        this.h = jd4Var;
        this.k = jz2Var;
        this.m = et8Var;
        this.n = mx6Var;
        System.currentTimeMillis();
        this.c = new mj4((byte) 13);
    }
}
