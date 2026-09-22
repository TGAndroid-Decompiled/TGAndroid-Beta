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
    public final String f3849c;
    public final String d;
    public volatile g f3850f;
    public final Context f3851g;
    public final of.b h;
    public volatile com.google.android.gms.internal.play_billing.c f3852i;
    public volatile x f3853j;
    public boolean f3854k;
    public boolean f3856m;
    public boolean f3857n;
    public boolean f3858o;
    public boolean f3859p;
    public boolean f3860q;
    public boolean f3861r;
    public boolean f3862s;
    public boolean f3863t;
    public boolean f3864u;
    public boolean v;
    public boolean f3865w;
    public final qb.b f3866x;
    public final boolean f3867y;
    public ExecutorService f3868z;
    public final Object f3847a = new Object();
    public volatile int f3848b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int f3855l = 0;

    public c(qb.b bVar, Context context, p pVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f6802a;
        this.f3849c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f3851g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f6896b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f6896b, w10);
        }
        String packageName = this.f3851g.getPackageName();
        x10.c();
        p3.t((p3) x10.f6896b, packageName);
        x10.c();
        p3.q((p3) x10.f6896b, nextLong);
        x10.c();
        p3.u((p3) x10.f6896b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f6896b, i10);
        x10.d();
        try {
            int i11 = this.f3851g.getPackageManager().getPackageInfo(this.f3851g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f6896b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new of.b(this.f3851g, (p3) x10.a());
        if (pVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3850f = new g(this.f3851g, pVar, this.h);
        this.f3866x = bVar;
        this.f3867y = false;
        this.f3851g.getPackageName();
    }

    public static Future f(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new i9.s(4, submit, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(c cVar, int i10) {
        g gVar;
        if (i10 == 0) {
            synchronized (cVar.f3847a) {
                try {
                    if (cVar.f3848b == 3) {
                        return;
                    }
                    cVar.k(2);
                    if (cVar.f3850f != null) {
                        gVar = cVar.f3850f;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        boolean z10 = cVar.f3864u;
                        g0 g0Var = (g0) gVar.e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        gVar.f3888a = z10;
                        Context context = (Context) gVar.f3889b;
                        ((g0) gVar.f3891f).a(context, intentFilter2);
                        if (gVar.f3888a) {
                            g0Var.b(context, intentFilter);
                            return;
                        } else {
                            g0Var.a(context, intentFilter);
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
        synchronized (cVar.f3847a) {
            z10 = true;
            if (cVar.f3848b != 1) {
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
            int i12 = d0.f3869a;
            h(d0.b(i10, i11, hVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, h hVar, long j3, boolean z10) {
        try {
            int i11 = d0.f3869a;
            this.h.e0(d0.b(i10, 2, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f3855l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, h hVar, String str, long j3, boolean z10) {
        try {
            int i11 = d0.f3869a;
            this.h.e0(d0.b(i10, 2, hVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f3855l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(h hVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new i9.s(3, this, hVar));
    }

    @Override
    public void a(i iVar, j jVar) {
        if (f(new t(this, jVar, iVar, 0), 30000L, new u(this, jVar, iVar, 0), r(), e()) == null) {
            h u10 = u();
            y(25, 4, u10);
            jVar.a(u10, iVar.f3901a);
        }
    }

    @Override
    public c5.h b(android.app.Activity r32, final c5.g r33) {
        throw new UnsupportedOperationException("Method not decompiled: c5.c.b(android.app.Activity, c5.g):c5.h");
    }

    @Override
    public void c(android.support.v4.media.c cVar, org.telegram.messenger.c0 c0Var) {
        if (f(new t(this, c0Var, cVar, 1), 30000L, new i9.s(5, this, c0Var), r(), e()) == null) {
            h u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f6873b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            c0Var.a(u10, new r(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f3868z == null) {
                this.f3868z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f6893a, new v(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3868z;
    }

    public final void g(j jVar, String str, h hVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, hVar, d0.a(exc));
        jVar.a(hVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            of.b bVar = this.h;
            int i10 = this.f3855l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f15697b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6896b, i10);
            bVar.f15697b = (p3) o3Var.a();
            bVar.a0(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            of.b bVar = this.h;
            int i10 = this.f3855l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f15697b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6896b, i10);
            p3 p3Var = (p3) o3Var.a();
            bVar.f15697b = p3Var;
            bVar.j0(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, h hVar) {
        try {
            int i11 = d0.f3869a;
            f3 f3Var = (f3) d0.b(i10, 6, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
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
        synchronized (this.f3847a) {
            try {
                if (this.f3848b == 3) {
                    return;
                }
                int i11 = this.f3848b;
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
                this.f3848b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(d dVar) {
        int i10;
        h hVar;
        synchronized (this.f3847a) {
            try {
                if (o()) {
                    hVar = t();
                } else if (this.f3848b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    hVar = f0.f3877c;
                    j(37, hVar);
                } else if (this.f3848b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    hVar = f0.h;
                    j(38, hVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f3853j = new x(this, dVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f3853j.f3937b;
                    mVar.f6836c = 0L;
                    mVar.f6835b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f3851g.getPackageManager().queryIntentServices(intent, 0);
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
                                intent2.putExtra("playBillingLibraryVersion", this.f3849c);
                                synchronized (this.f3847a) {
                                    try {
                                        if (this.f3848b == 2) {
                                            hVar = t();
                                        } else if (this.f3848b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            hVar = f0.h;
                                            j(105, hVar);
                                        } else {
                                            x xVar = this.f3853j;
                                            if (this.f3851g.bindService(intent2, xVar, 1)) {
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
                    hVar = f0.f3875a;
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
        synchronized (this.f3847a) {
            if (this.f3853j != null) {
                this.f3851g.unbindService(this.f3853j);
                this.f3852i = null;
                this.f3853j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a2 = hVar.a();
            long j3 = 30000;
            long j10 = 30000;
            int i10 = 1;
            while (i10 <= 3) {
                try {
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (Math.max(0L, j10) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                h hVar2 = f0.f3879g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = hVar2.f3895a;
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
                    } catch (InterruptedException e7) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e7);
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
        synchronized (this.f3847a) {
            try {
                z10 = false;
                if (this.f3848b == 2 && this.f3852i != null && this.f3853j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.e;
        }
        return new Handler(Looper.myLooper());
    }

    public final j6.l s(h hVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, hVar, d0.a(exc));
        return new j6.l(hVar.f3895a, hVar.f3897c, new ArrayList(), new ArrayList());
    }

    public final h t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.f6896b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f6896b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.f6896b, (d4) r10.a());
        i((i3) s10.a());
        return f0.f3879g;
    }

    public final h u() {
        int[] iArr = {0, 3};
        synchronized (this.f3847a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f3848b == iArr[i10]) {
                    return f0.h;
                }
            }
            return f0.f3878f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f3851g.getPackageName();
    }

    public final n4.y x(h hVar, int i10, String str, Exception exc) {
        A(i10, 9, hVar, d0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.y(hVar, null, false);
    }

    public final void y(int i10, int i11, h hVar) {
        try {
            int i12 = d0.f3869a;
            h(d0.b(i10, i11, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, h hVar, long j3) {
        try {
            int i11 = d0.f3869a;
            this.h.b0(d0.b(i10, 2, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f3855l, j3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public c(qb.b bVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f6802a;
        this.f3849c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f3851g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f6896b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f6896b, w10);
        }
        String packageName = this.f3851g.getPackageName();
        x10.c();
        p3.t((p3) x10.f6896b, packageName);
        x10.c();
        p3.q((p3) x10.f6896b, nextLong);
        x10.c();
        p3.u((p3) x10.f6896b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f6896b, i10);
        x10.d();
        try {
            int i11 = this.f3851g.getPackageManager().getPackageInfo(this.f3851g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f6896b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new of.b(this.f3851g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3850f = new g(this.f3851g, null, this.h);
        this.f3866x = bVar;
        this.f3851g.getPackageName();
    }
}
