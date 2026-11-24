package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class uh0 {
    public final Long A;
    public final mad B;
    public final String c;
    public final String d;
    public volatile ei0 f;
    public final Context g;
    public final aec h;
    public volatile e8d i;
    public volatile ucd j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final c6e x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public uh0(c6e c6eVar, Context context, ci0 ci0Var, sj sjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = abd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        ale x = lle.x();
        x.b();
        lle.v((lle) x.b);
        if (v != null) {
            x.b();
            lle.w((lle) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        lle.t((lle) x.b, packageName);
        x.b();
        lle.q((lle) x.b, nextLong);
        x.b();
        lle.u((lle) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        lle.n((lle) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            lle.o((lle) x.b, i2);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new aec(this.g, (lle) x.a());
        if (ci0Var == null) {
            xgd.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new ei0(this.g, ci0Var, this.h);
        this.x = c6eVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new rld(submit, runnable, (byte) 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            xgd.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(uh0 uh0Var, int i) {
        ei0 ei0Var;
        if (i == 0) {
            synchronized (uh0Var.a) {
                if (uh0Var.b == 3) {
                    return;
                }
                uh0Var.k(2);
                if (uh0Var.f != null) {
                    ei0Var = uh0Var.f;
                } else {
                    ei0Var = null;
                }
                if (ei0Var != null) {
                    boolean z = uh0Var.u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    ei0Var.b = z;
                    Context context = (Context) ei0Var.a;
                    ((hbf) ei0Var.f).a(context, intentFilter2);
                    boolean z2 = ei0Var.b;
                    hbf hbfVar = (hbf) ei0Var.e;
                    if (z2) {
                        hbfVar.b(context, intentFilter);
                        return;
                    } else {
                        hbfVar.a(context, intentFilter);
                        return;
                    }
                }
                return;
            }
        }
        uh0Var.k(0);
    }

    public static boolean q(uh0 uh0Var) {
        boolean z;
        synchronized (uh0Var.a) {
            z = true;
            if (uh0Var.b != 1) {
                z = false;
            }
        }
        return z;
    }

    public static String v() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i, fi0 fi0Var, long j, boolean z) {
        try {
            int i2 = yid.a;
            this.h.m(yid.b(i, 2, fi0Var, null, dke.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void B(int i, fi0 fi0Var, String str, long j, boolean z) {
        try {
            int i2 = yid.a;
            this.h.m(yid.b(i, 2, fi0Var, str, dke.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void C(fi0 fi0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new tq4(this, fi0Var, (byte) 16));
    }

    public void a(ss2 ss2Var, ts2 ts2Var) {
        if (f(new p4d(this, ts2Var, ss2Var, (byte) 1), 30000L, new tq4(this, ts2Var, ss2Var), r(), e()) == null) {
            fi0 u = u();
            x(25, 4, u);
            ts2Var.d(u);
        }
    }

    public defpackage.fi0 b(android.app.Activity r30, final defpackage.ei0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh0.b(android.app.Activity, ei0):fi0");
    }

    public void c(z24 z24Var, sg0 sg0Var) {
        if (f(new p4d(this, sg0Var, z24Var, (byte) 2), 30000L, new rld(this, sg0Var, (byte) 15), r(), e()) == null) {
            fi0 u = u();
            x(25, 7, u);
            sed sedVar = efd.b;
            ((bi0) sg0Var.b).b(u, nhd.e);
        }
    }

    public void d(ci0 ci0Var) {
        l(ci0Var);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        executorService = this.z;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(xgd.a, new kn7(this));
            this.z = executorService;
        }
        return executorService;
    }

    public final void g(ts2 ts2Var, String str, fi0 fi0Var, int i, String str2, Exception exc) {
        xgd.i("BillingClient", str2, exc);
        z(i, 4, fi0Var, yid.a(exc));
        ts2Var.d(fi0Var);
    }

    public final void h(fhe fheVar) {
        try {
            aec aecVar = this.h;
            int i = this.l;
            aecVar.getClass();
            ale aleVar = (ale) ((lle) aecVar.b).g();
            aleVar.b();
            lle.p((lle) aleVar.b, i);
            aecVar.b = (lle) aleVar.a();
            aecVar.i(fheVar);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void i(fie fieVar) {
        try {
            aec aecVar = this.h;
            int i = this.l;
            aecVar.getClass();
            ale aleVar = (ale) ((lle) aecVar.b).g();
            aleVar.b();
            lle.p((lle) aleVar.b, i);
            lle lleVar = (lle) aleVar.a();
            aecVar.b = lleVar;
            aecVar.t(fieVar, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void j(int i, fi0 fi0Var) {
        try {
            int i2 = yid.a;
            tge tgeVar = (tge) yid.b(i, 6, fi0Var, null, dke.BROADCAST_ACTION_UNSPECIFIED).g();
            vqe r = dre.r();
            r.c(false);
            r.d();
            tgeVar.d(r);
            h((fhe) tgeVar.a());
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void k(int i) {
        String str;
        String str2;
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            byte b = this.b;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        str = "CLOSED";
                    } else {
                        str = "CONNECTED";
                    }
                } else {
                    str = "CONNECTING";
                }
            } else {
                str = "DISCONNECTED";
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        str2 = "CLOSED";
                    } else {
                        str2 = "CONNECTED";
                    }
                } else {
                    str2 = "CONNECTING";
                }
            } else {
                str2 = "DISCONNECTED";
            }
            xgd.g("BillingClient", "Setting clientState from " + str + " to " + str2);
            this.b = i;
        }
    }

    public final void l(vh0 vh0Var) {
        int i;
        fi0 fi0Var;
        fi0 fi0Var2;
        synchronized (this.a) {
            if (o()) {
                fi0Var = t();
            } else {
                if (this.b == 1) {
                    xgd.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fi0Var2 = qjd.c;
                    j(37, fi0Var2);
                } else if (this.b == 3) {
                    xgd.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fi0Var2 = qjd.h;
                    j(38, fi0Var2);
                } else {
                    k(1);
                    m();
                    xgd.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new ucd(this, vh0Var);
                    gdd gddVar = this.j.b;
                    gddVar.c = 0L;
                    gddVar.b = false;
                    gddVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        fi0Var = t();
                                    } else if (this.b != 1) {
                                        xgd.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        fi0Var2 = qjd.h;
                                        j(105, fi0Var2);
                                    } else {
                                        ucd ucdVar = this.j;
                                        if (this.g.bindService(intent2, ucdVar, 1)) {
                                            xgd.g("BillingClient", "Service was bonded successfully.");
                                            fi0Var = null;
                                        } else {
                                            xgd.h("BillingClient", "Connection to Billing service is blocked.");
                                            i = 39;
                                        }
                                    }
                                }
                            } else {
                                xgd.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            xgd.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    } else {
                        i = 41;
                    }
                    k(0);
                    xgd.g("BillingClient", "Billing service unavailable on device.");
                    fi0 fi0Var3 = qjd.a;
                    j(i, fi0Var3);
                    fi0Var = fi0Var3;
                }
                fi0Var = fi0Var2;
            }
        }
        if (fi0Var != null) {
            vh0Var.a(fi0Var);
        }
    }

    public final void m() {
        synchronized (this.a) {
            if (this.j != null) {
                this.g.unbindService(this.j);
                this.i = null;
                this.j = null;
            }
        }
    }

    public final boolean n() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mad madVar = this.B;
        if (madVar != null) {
            long a = madVar.a();
            long j = 30000;
            int i = 1;
            long j2 = 30000;
            while (i <= 3) {
                try {
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    xgd.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (Math.max(0L, j2) <= 0) {
                    xgd.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                xgd.g("BillingClient", "Already connected or not opted into auto reconnection.");
                fi0 fi0Var = qjd.g;
                timeUnit.getClass();
                int i2 = fi0Var.a;
                if (i2 == 0) {
                    xgd.g("BillingClient", "Reconnection succeeded with result: " + i2);
                    return o();
                }
                xgd.h("BillingClient", "Reconnection failed with result: " + i2);
                j2 = j - (((madVar.a() - a) + 0) / 1000000);
                long j3 = j;
                long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (j2 < pow) {
                    xgd.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j2 = j3 - (((madVar.a() - a) + 0) / 1000000);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        xgd.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                    }
                }
                i++;
                j = j3;
            }
            xgd.h("BillingClient", "Max retries reached.");
            return o();
        }
        fvc.f("ticker");
        return false;
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b == 2 && this.i != null && this.j != null) {
                z = true;
            }
        }
        return z;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.e;
        }
        return new Handler(Looper.myLooper());
    }

    public final kp s(fi0 fi0Var, int i, String str, Exception exc) {
        xgd.i("BillingClient", str, exc);
        z(i, 7, fi0Var, yid.a(exc));
        return new kp(fi0Var.a, fi0Var.c, new ArrayList(), new ArrayList());
    }

    public final fi0 t() {
        xgd.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        nhe s = fie.s();
        s.b();
        fie.r((fie) s.b, 6);
        vqe r = dre.r();
        r.b();
        dre.q((dre) r.b);
        r.c(false);
        r.d();
        s.b();
        fie.q((fie) s.b, (dre) r.a());
        i((fie) s.a());
        return qjd.g;
    }

    public final fi0 u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return qjd.h;
                }
            }
            return qjd.f;
        }
    }

    public final aec w(fi0 fi0Var, int i, String str, Exception exc) {
        z(i, 9, fi0Var, yid.a(exc));
        xgd.i("BillingClient", str, exc);
        return new aec(fi0Var, null, (byte) 14);
    }

    public final void x(int i, int i2, fi0 fi0Var) {
        try {
            int i3 = yid.a;
            h(yid.b(i, i2, fi0Var, null, dke.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(int i, fi0 fi0Var, long j) {
        try {
            int i2 = yid.a;
            this.h.j(yid.b(i, 2, fi0Var, null, dke.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(int i, int i2, fi0 fi0Var, String str) {
        try {
            int i3 = yid.a;
            h(yid.b(i, i2, fi0Var, str, dke.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public uh0(c6e c6eVar, Context context, sj sjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = abd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        ale x = lle.x();
        x.b();
        lle.v((lle) x.b);
        if (v != null) {
            x.b();
            lle.w((lle) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        lle.t((lle) x.b, packageName);
        x.b();
        lle.q((lle) x.b, nextLong);
        x.b();
        lle.u((lle) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        lle.n((lle) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            lle.o((lle) x.b, i2);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new aec(this.g, (lle) x.a());
        xgd.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new ei0(this.g, null, this.h);
        this.x = c6eVar;
        this.g.getPackageName();
    }
}
