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
public class vh0 {
    public final Long A;
    public final ffd B;
    public final String c;
    public final String d;
    public volatile fi0 f;
    public final Context g;
    public final zhc h;
    public volatile xcd i;
    public volatile nhd j;
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
    public final sae x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public vh0(sae saeVar, Context context, di0 di0Var, tj tjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = tfd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        rpe x = cqe.x();
        x.b();
        cqe.v((cqe) x.b);
        if (v != null) {
            x.b();
            cqe.w((cqe) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        cqe.t((cqe) x.b, packageName);
        x.b();
        cqe.q((cqe) x.b, nextLong);
        x.b();
        cqe.u((cqe) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        cqe.n((cqe) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            cqe.o((cqe) x.b, i2);
        } catch (Throwable th) {
            old.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new zhc(this.g, (cqe) x.a());
        if (di0Var == null) {
            old.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new fi0(this.g, di0Var, this.h);
        this.x = saeVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new iqd(submit, runnable, (byte) 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            old.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(vh0 vh0Var, int i) {
        fi0 fi0Var;
        if (i == 0) {
            synchronized (vh0Var.a) {
                if (vh0Var.b == 3) {
                    return;
                }
                vh0Var.k(2);
                if (vh0Var.f != null) {
                    fi0Var = vh0Var.f;
                } else {
                    fi0Var = null;
                }
                if (fi0Var != null) {
                    boolean z = vh0Var.u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    fi0Var.b = z;
                    Context context = (Context) fi0Var.a;
                    ((xff) fi0Var.f).a(context, intentFilter2);
                    boolean z2 = fi0Var.b;
                    xff xffVar = (xff) fi0Var.e;
                    if (z2) {
                        xffVar.b(context, intentFilter);
                        return;
                    } else {
                        xffVar.a(context, intentFilter);
                        return;
                    }
                }
                return;
            }
        }
        vh0Var.k(0);
    }

    public static boolean q(vh0 vh0Var) {
        boolean z;
        synchronized (vh0Var.a) {
            z = true;
            if (vh0Var.b != 1) {
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

    public final void A(int i, gi0 gi0Var, long j, boolean z) {
        try {
            int i2 = pnd.a;
            this.h.m(pnd.b(i, 2, gi0Var, null, uoe.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void B(int i, gi0 gi0Var, String str, long j, boolean z) {
        try {
            int i2 = pnd.a;
            this.h.m(pnd.b(i, 2, gi0Var, str, uoe.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void C(gi0 gi0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new xs4(this, gi0Var, (byte) 16));
    }

    public void a(mt2 mt2Var, nt2 nt2Var) {
        if (f(new h9d(this, nt2Var, mt2Var, (byte) 1), 30000L, new xs4(this, nt2Var, mt2Var), r(), e()) == null) {
            gi0 u = u();
            x(25, 4, u);
            nt2Var.e(u);
        }
    }

    public defpackage.gi0 b(android.app.Activity r30, final defpackage.fi0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh0.b(android.app.Activity, fi0):gi0");
    }

    public void c(l09 l09Var, tg0 tg0Var) {
        if (f(new h9d(this, tg0Var, l09Var, (byte) 2), 30000L, new iqd(this, tg0Var, (byte) 15), r(), e()) == null) {
            gi0 u = u();
            x(25, 7, u);
            jjd jjdVar = vjd.b;
            ((ci0) tg0Var.b).c(u, emd.e);
        }
    }

    public void d(di0 di0Var) {
        l(di0Var);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        executorService = this.z;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(old.a, new kq7(this));
            this.z = executorService;
        }
        return executorService;
    }

    public final void g(nt2 nt2Var, String str, gi0 gi0Var, int i, String str2, Exception exc) {
        old.i("BillingClient", str2, exc);
        z(i, 4, gi0Var, pnd.a(exc));
        nt2Var.e(gi0Var);
    }

    public final void h(wle wleVar) {
        try {
            zhc zhcVar = this.h;
            int i = this.l;
            zhcVar.getClass();
            rpe rpeVar = (rpe) ((cqe) zhcVar.b).g();
            rpeVar.b();
            cqe.p((cqe) rpeVar.b, i);
            zhcVar.b = (cqe) rpeVar.a();
            zhcVar.h(wleVar);
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void i(wme wmeVar) {
        try {
            zhc zhcVar = this.h;
            int i = this.l;
            zhcVar.getClass();
            rpe rpeVar = (rpe) ((cqe) zhcVar.b).g();
            rpeVar.b();
            cqe.p((cqe) rpeVar.b, i);
            cqe cqeVar = (cqe) rpeVar.a();
            zhcVar.b = cqeVar;
            zhcVar.r(wmeVar, cqeVar);
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void j(int i, gi0 gi0Var) {
        try {
            int i2 = pnd.a;
            kle kleVar = (kle) pnd.b(i, 6, gi0Var, null, uoe.BROADCAST_ACTION_UNSPECIFIED).g();
            mve r = uve.r();
            r.c(false);
            r.d();
            kleVar.d(r);
            h((wle) kleVar.a());
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
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
            old.g("BillingClient", "Setting clientState from " + str + " to " + str2);
            this.b = i;
        }
    }

    public final void l(wh0 wh0Var) {
        int i;
        gi0 gi0Var;
        gi0 gi0Var2;
        synchronized (this.a) {
            if (o()) {
                gi0Var = t();
            } else {
                if (this.b == 1) {
                    old.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gi0Var2 = hod.c;
                    j(37, gi0Var2);
                } else if (this.b == 3) {
                    old.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gi0Var2 = hod.h;
                    j(38, gi0Var2);
                } else {
                    k(1);
                    m();
                    old.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new nhd(this, wh0Var);
                    zhd zhdVar = this.j.b;
                    zhdVar.c = 0L;
                    zhdVar.b = false;
                    zhdVar.a();
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
                                        gi0Var = t();
                                    } else if (this.b != 1) {
                                        old.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        gi0Var2 = hod.h;
                                        j(105, gi0Var2);
                                    } else {
                                        nhd nhdVar = this.j;
                                        if (this.g.bindService(intent2, nhdVar, 1)) {
                                            old.g("BillingClient", "Service was bonded successfully.");
                                            gi0Var = null;
                                        } else {
                                            old.h("BillingClient", "Connection to Billing service is blocked.");
                                            i = 39;
                                        }
                                    }
                                }
                            } else {
                                old.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            old.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    } else {
                        i = 41;
                    }
                    k(0);
                    old.g("BillingClient", "Billing service unavailable on device.");
                    gi0 gi0Var3 = hod.a;
                    j(i, gi0Var3);
                    gi0Var = gi0Var3;
                }
                gi0Var = gi0Var2;
            }
        }
        if (gi0Var != null) {
            wh0Var.a(gi0Var);
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
        ffd ffdVar = this.B;
        if (ffdVar != null) {
            long a = ffdVar.a();
            long j = 30000;
            int i = 1;
            long j2 = 30000;
            while (i <= 3) {
                try {
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    old.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (Math.max(0L, j2) <= 0) {
                    old.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                old.g("BillingClient", "Already connected or not opted into auto reconnection.");
                gi0 gi0Var = hod.g;
                timeUnit.getClass();
                int i2 = gi0Var.a;
                if (i2 == 0) {
                    old.g("BillingClient", "Reconnection succeeded with result: " + i2);
                    return o();
                }
                old.h("BillingClient", "Reconnection failed with result: " + i2);
                j2 = j - (((ffdVar.a() - a) + 0) / 1000000);
                long j3 = j;
                long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (j2 < pow) {
                    old.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j2 = j3 - (((ffdVar.a() - a) + 0) / 1000000);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        old.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                    }
                }
                i++;
                j = j3;
            }
            old.h("BillingClient", "Max retries reached.");
            return o();
        }
        p3d.h("ticker");
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

    public final lp s(gi0 gi0Var, int i, String str, Exception exc) {
        old.i("BillingClient", str, exc);
        z(i, 7, gi0Var, pnd.a(exc));
        return new lp(gi0Var.a, gi0Var.c, new ArrayList(), new ArrayList());
    }

    public final gi0 t() {
        old.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        eme s = wme.s();
        s.b();
        wme.r((wme) s.b, 6);
        mve r = uve.r();
        r.b();
        uve.q((uve) r.b);
        r.c(false);
        r.d();
        s.b();
        wme.q((wme) s.b, (uve) r.a());
        i((wme) s.a());
        return hod.g;
    }

    public final gi0 u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return hod.h;
                }
            }
            return hod.f;
        }
    }

    public final zhc w(gi0 gi0Var, int i, String str, Exception exc) {
        z(i, 9, gi0Var, pnd.a(exc));
        old.i("BillingClient", str, exc);
        return new zhc(gi0Var, null, (byte) 14);
    }

    public final void x(int i, int i2, gi0 gi0Var) {
        try {
            int i3 = pnd.a;
            h(pnd.b(i, i2, gi0Var, null, uoe.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(int i, gi0 gi0Var, long j) {
        try {
            int i2 = pnd.a;
            this.h.i(pnd.b(i, 2, gi0Var, null, uoe.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(int i, int i2, gi0 gi0Var, String str) {
        try {
            int i3 = pnd.a;
            h(pnd.b(i, i2, gi0Var, str, uoe.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public vh0(sae saeVar, Context context, tj tjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = tfd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        rpe x = cqe.x();
        x.b();
        cqe.v((cqe) x.b);
        if (v != null) {
            x.b();
            cqe.w((cqe) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        cqe.t((cqe) x.b, packageName);
        x.b();
        cqe.q((cqe) x.b, nextLong);
        x.b();
        cqe.u((cqe) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        cqe.n((cqe) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            cqe.o((cqe) x.b, i2);
        } catch (Throwable th) {
            old.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new zhc(this.g, (cqe) x.a());
        old.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new fi0(this.g, null, this.h);
        this.x = saeVar;
        this.g.getPackageName();
    }
}
