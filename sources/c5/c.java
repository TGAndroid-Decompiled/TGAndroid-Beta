package c5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.BillingController;
public class c extends b {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f4207c;
    public final String d;
    public volatile g f4209f;
    public final Context f4210g;
    public final pf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f4211i;
    public volatile y f4212j;
    public boolean f4213k;
    public boolean f4215m;
    public boolean f4216n;
    public boolean f4217o;
    public boolean f4218p;
    public boolean f4219q;
    public boolean f4220r;
    public boolean f4221s;
    public boolean f4222t;
    public boolean f4223u;
    public boolean v;
    public boolean f4224w;
    public final qb.b f4225x;
    public final boolean f4226y;
    public ExecutorService f4227z;
    public final Object f4205a = new Object();
    public volatile int f4206b = 0;
    public final Handler f4208e = new Handler(Looper.getMainLooper());
    public int f4214l = 0;

    public c(qb.b bVar, Context context, q qVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7373a;
        this.f4207c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f4210g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f7476b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f7476b, w10);
        }
        String packageName = this.f4210g.getPackageName();
        x10.c();
        p3.t((p3) x10.f7476b, packageName);
        x10.c();
        p3.q((p3) x10.f7476b, nextLong);
        x10.c();
        p3.u((p3) x10.f7476b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f7476b, i10);
        x10.d();
        try {
            int i11 = this.f4210g.getPackageManager().getPackageInfo(this.f4210g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f7476b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new pf.b(this.f4210g, (p3) x10.a());
        if (qVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f4209f = new g(this.f4210g, qVar, this.h);
        this.f4225x = bVar;
        this.f4226y = false;
        this.f4210g.getPackageName();
    }

    public static Future f(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new i9.s(5, submit, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e7);
            return null;
        }
    }

    public static void p(c cVar, int i10) {
        g gVar;
        if (i10 == 0) {
            synchronized (cVar.f4205a) {
                try {
                    if (cVar.f4206b == 3) {
                        return;
                    }
                    cVar.k(2);
                    if (cVar.f4209f != null) {
                        gVar = cVar.f4209f;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        boolean z10 = cVar.f4223u;
                        h0 h0Var = (h0) gVar.f4238e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        gVar.f4235a = z10;
                        Context context = (Context) gVar.f4236b;
                        ((h0) gVar.f4239f).a(context, intentFilter2);
                        if (gVar.f4235a) {
                            h0Var.b(context, intentFilter);
                            return;
                        } else {
                            h0Var.a(context, intentFilter);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        cVar.k(0);
    }

    public static boolean q(c cVar) {
        boolean z10;
        synchronized (cVar.f4205a) {
            z10 = true;
            if (cVar.f4206b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i10, int i11, h hVar, String str) {
        try {
            int i12 = e0.f4231a;
            h(e0.b(i10, i11, hVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, h hVar, long j3, boolean z10) {
        try {
            int i11 = e0.f4231a;
            this.h.Z(e0.b(i10, 2, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f4214l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, h hVar, String str, long j3, boolean z10) {
        try {
            int i11 = e0.f4231a;
            this.h.Z(e0.b(i10, 2, hVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f4214l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(h hVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f4208e.post(new i9.s(4, this, hVar));
    }

    @Override
    public void a(i iVar, j jVar) {
        if (f(new u(this, jVar, iVar, 0), 30000L, new v(this, jVar, iVar, 0), r(), e()) == null) {
            h u10 = u();
            y(25, 4, u10);
            jVar.a(u10, iVar.f4260a);
        }
    }

    @Override
    public c5.h b(android.app.Activity r32, final c5.g r33) {
        throw new UnsupportedOperationException("Method not decompiled: c5.c.b(android.app.Activity, c5.g):c5.h");
    }

    @Override
    public void c(a4.l lVar, org.telegram.messenger.d0 d0Var) {
        if (f(new u(this, d0Var, lVar, 1), 30000L, new i9.s(6, this, d0Var), r(), e()) == null) {
            h u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7451b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f7478e;
            d0Var.a(u10, new s(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f4227z == null) {
                this.f4227z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f7473a, new w(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f4227z;
    }

    public final void g(j jVar, String str, h hVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, hVar, e0.a(exc));
        jVar.a(hVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            pf.b bVar = this.h;
            int i10 = this.f4214l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f45556b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7476b, i10);
            bVar.f45556b = (p3) o3Var.a();
            bVar.W(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            pf.b bVar = this.h;
            int i10 = this.f4214l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f45556b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7476b, i10);
            p3 p3Var = (p3) o3Var.a();
            bVar.f45556b = p3Var;
            bVar.e0(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, h hVar) {
        try {
            int i11 = e0.f4231a;
            f3 f3Var = (f3) e0.b(i10, 6, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r10 = d4.r();
            r10.d(false);
            r10.e();
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i10) {
        String str;
        String str2;
        synchronized (this.f4205a) {
            try {
                if (this.f4206b == 3) {
                    return;
                }
                int i11 = this.f4206b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
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
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
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
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f4206b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(d dVar) {
        int i10;
        h hVar;
        synchronized (this.f4205a) {
            try {
                if (o()) {
                    hVar = t();
                } else if (this.f4206b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    hVar = g0.f4242c;
                    j(37, hVar);
                } else if (this.f4206b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    hVar = g0.h;
                    j(38, hVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f4212j = new y(this, dVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f4212j.f4303b;
                    mVar.f7409c = 0L;
                    mVar.f7408b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f4210g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f4207c);
                                synchronized (this.f4205a) {
                                    try {
                                        if (this.f4206b == 2) {
                                            hVar = t();
                                        } else if (this.f4206b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            hVar = g0.h;
                                            j(105, hVar);
                                        } else {
                                            y yVar = this.f4212j;
                                            if (this.f4210g.bindService(intent2, yVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                hVar = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    } else {
                        i10 = 41;
                    }
                    k(0);
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                    hVar = g0.f4240a;
                    j(i10, hVar);
                }
            } finally {
            }
        }
        if (hVar != null) {
            dVar.onBillingSetupFinished(hVar);
        }
    }

    public final void m() {
        synchronized (this.f4205a) {
            if (this.f4212j != null) {
                this.f4210g.unbindService(this.f4212j);
                this.f4211i = null;
                this.f4212j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a2 = hVar.a();
            long j3 = 30000;
            int i10 = 1;
            long j10 = 30000;
            while (i10 <= 3) {
                try {
                } catch (Exception e7) {
                    if (e7 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e7);
                }
                if (Math.max(0L, j10) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                h hVar2 = g0.f4245g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = hVar2.f4254a;
                if (i11 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                j10 = j3 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                long j11 = j3;
                long pow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (j10 < pow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i10 < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j10 = j11 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
                i10++;
                j3 = j11;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
            return o();
        }
        throw new NullPointerException("ticker");
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f4205a) {
            try {
                z10 = false;
                if (this.f4206b == 2 && this.f4211i != null && this.f4212j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f4208e;
        }
        return new Handler(Looper.myLooper());
    }

    public final j6.l s(h hVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, hVar, e0.a(exc));
        return new j6.l(hVar.f4254a, hVar.f4256c, new ArrayList(), new ArrayList());
    }

    public final h t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.f7476b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f7476b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.f7476b, (d4) r10.a());
        i((i3) s10.a());
        return g0.f4245g;
    }

    public final h u() {
        int[] iArr = {0, 3};
        synchronized (this.f4205a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f4206b == iArr[i10]) {
                    return g0.h;
                }
            }
            return g0.f4244f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f4210g.getPackageName();
    }

    public final n4.x x(h hVar, int i10, String str, Exception exc) {
        A(i10, 9, hVar, e0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.x(hVar, null, false, 7);
    }

    public final void y(int i10, int i11, h hVar) {
        try {
            int i12 = e0.f4231a;
            h(e0.b(i10, i11, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, h hVar, long j3) {
        try {
            int i11 = e0.f4231a;
            this.h.X(e0.b(i10, 2, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f4214l, j3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public c(qb.b bVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7373a;
        this.f4207c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f4210g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f7476b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f7476b, w10);
        }
        String packageName = this.f4210g.getPackageName();
        x10.c();
        p3.t((p3) x10.f7476b, packageName);
        x10.c();
        p3.q((p3) x10.f7476b, nextLong);
        x10.c();
        p3.u((p3) x10.f7476b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f7476b, i10);
        x10.d();
        try {
            int i11 = this.f4210g.getPackageManager().getPackageInfo(this.f4210g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f7476b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new pf.b(this.f4210g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f4209f = new g(this.f4210g, null, this.h);
        this.f4225x = bVar;
        this.f4210g.getPackageName();
    }
}
