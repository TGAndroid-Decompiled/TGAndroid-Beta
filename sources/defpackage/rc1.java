package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
public final class rc1 {
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

    public rc1(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.a = sue.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.m = num;
        this.n = num2;
        this.b = sue.e(str2);
        this.c = sue.e(str3);
        this.d = sue.e(str4);
        this.e = sue.e(str5);
        this.f = sue.e(str6);
        this.g = sue.e(str7);
        this.h = sue.e(str8);
        this.i = sue.e(str9);
        this.k = sue.a(str10) == null ? c() : str10;
        this.j = sue.e(str11) == null ? d() : str11;
        sue.e(str12);
        sue.b(str13);
        sue.e(str14);
        this.l = sue.e(str15);
    }

    public final void a(dv8 dv8Var) {
        mv6.s();
        mv6.s();
        ((tg2) this.d).r();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                ((rj) this.i).a(new k32((byte) 26));
                ((dy2) this.f).i();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (dv8Var.c().b.a) {
                if (!((dy2) this.f).d(dv8Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                ((dy2) this.f).j(((TaskCompletionSource) ((AtomicReference) dv8Var.h).get()).getTask());
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

    public final void b(dv8 dv8Var) {
        Future<?> submit = ((pz2) ((mv6) this.n).b).a.submit(new ey2(this, dv8Var, (byte) 1));
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
        if (sue.d((String) this.k) && !sue.d(str2)) {
            if (sue.c(str2, o)) {
                str = "American Express";
            } else if (sue.c(str2, p)) {
                str = "Discover";
            } else if (sue.c(str2, q)) {
                str = "JCB";
            } else if (sue.c(str2, r)) {
                str = "Diners Club";
            } else if (sue.c(str2, s)) {
                str = "Visa";
            } else if (sue.c(str2, t)) {
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
        if (!sue.d((String) this.j)) {
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
        mv6.s();
        try {
            tg2 tg2Var = (tg2) this.d;
            if (!new File((File) ((jb4) tg2Var.c).c, (String) tg2Var.b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public rc1(jg4 jg4Var, wj5 wj5Var, fy2 fy2Var, w53 w53Var, rj rjVar, rj rjVar2, jb4 jb4Var, zx2 zx2Var, g29 g29Var, mv6 mv6Var) {
        this.b = w53Var;
        jg4Var.a();
        this.a = jg4Var.a;
        this.g = wj5Var;
        this.l = fy2Var;
        this.i = rjVar;
        this.j = rjVar2;
        this.h = jb4Var;
        this.k = zx2Var;
        this.m = g29Var;
        this.n = mv6Var;
        System.currentTimeMillis();
        this.c = new sk4((byte) 11);
    }
}
