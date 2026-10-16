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
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
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
    public final String f4334c;
    public final String d;
    public volatile h f4335f;
    public final Context f4336g;
    public final qf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f4337i;
    public volatile z f4338j;
    public boolean f4339k;
    public boolean f4341m;
    public boolean f4342n;
    public boolean f4343o;
    public boolean f4344p;
    public boolean f4345q;
    public boolean f4346r;
    public boolean f4347s;
    public boolean f4348t;
    public boolean f4349u;
    public boolean v;
    public boolean f4350w;
    public final rb.b f4351x;
    public final boolean f4352y;
    public ExecutorService f4353z;
    public final Object f4332a = new Object();
    public volatile int f4333b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int f4340l = 0;

    public c(rb.b bVar, Context context, r rVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f5670a;
        this.f4334c = "8.0.0";
        String w9 = w();
        this.d = w9;
        this.f4336g = context.getApplicationContext();
        p3 x10 = q3.x();
        x10.c();
        q3.v((q3) x10.f5767b);
        if (w9 != null) {
            x10.c();
            q3.w((q3) x10.f5767b, w9);
        }
        String packageName = this.f4336g.getPackageName();
        x10.c();
        q3.t((q3) x10.f5767b, packageName);
        x10.c();
        q3.q((q3) x10.f5767b, nextLong);
        x10.c();
        q3.u((q3) x10.f5767b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        q3.n((q3) x10.f5767b, i10);
        x10.d();
        try {
            int i11 = this.f4336g.getPackageManager().getPackageInfo(this.f4336g.getPackageName(), 0).versionCode;
            x10.c();
            q3.o((q3) x10.f5767b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new qf.b(this.f4336g, (q3) x10.a());
        if (rVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f4335f = new h(this.f4336g, rVar, this.h);
        this.f4351x = bVar;
        this.f4352y = false;
        this.f4336g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new j9.u(4, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(c cVar, int i10) {
        h hVar;
        if (i10 == 0) {
            synchronized (cVar.f4332a) {
                try {
                    if (cVar.f4333b == 3) {
                        return;
                    }
                    cVar.k(2);
                    if (cVar.f4335f != null) {
                        hVar = cVar.f4335f;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        boolean z10 = cVar.f4349u;
                        i0 i0Var = (i0) hVar.e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        hVar.f4367a = z10;
                        Context context = (Context) hVar.f4368b;
                        ((i0) hVar.f4370f).a(context, intentFilter2);
                        if (hVar.f4367a) {
                            i0Var.b(context, intentFilter);
                            return;
                        } else {
                            i0Var.a(context, intentFilter);
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
        synchronized (cVar.f4332a) {
            z10 = true;
            if (cVar.f4333b != 1) {
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

    public final void A(int i10, int i11, i iVar, String str) {
        try {
            int i12 = f0.f4363a;
            h(f0.b(i10, i11, iVar, str, n3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, i iVar, long j10, boolean z10) {
        try {
            int i11 = f0.f4363a;
            this.h.l0(f0.b(i10, 2, iVar, null, n3.BROADCAST_ACTION_UNSPECIFIED), this.f4340l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, i iVar, String str, long j10, boolean z10) {
        try {
            int i11 = f0.f4363a;
            this.h.l0(f0.b(i10, 2, iVar, str, n3.BROADCAST_ACTION_UNSPECIFIED), this.f4340l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(i iVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new j9.u(3, this, iVar));
    }

    @Override
    public void a(j jVar, k kVar) {
        if (f(new v(this, kVar, jVar, 0), 30000L, new w(this, kVar, jVar, 0), r(), e()) == null) {
            i u10 = u();
            y(25, 4, u10);
            kVar.a(u10, jVar.f4390a);
        }
    }

    @Override
    public c5.i b(android.app.Activity r32, final c5.h r33) {
        throw new UnsupportedOperationException("Method not decompiled: c5.c.b(android.app.Activity, c5.h):c5.i");
    }

    @Override
    public void c(a6.m mVar, org.telegram.messenger.d0 d0Var) {
        if (f(new v(this, d0Var, mVar, 1), 30000L, new j9.u(5, this, d0Var), r(), e()) == null) {
            i u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f5744b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            d0Var.a(u10, new t(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f4353z == null) {
                this.f4353z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f5764a, new x(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f4353z;
    }

    public final void g(k kVar, String str, i iVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, iVar, f0.a(exc));
        kVar.a(iVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            qf.b bVar = this.h;
            int i10 = this.f4340l;
            bVar.getClass();
            p3 p3Var = (p3) ((q3) bVar.f43097b).g();
            p3Var.c();
            q3.p((q3) p3Var.f5767b, i10);
            bVar.f43097b = (q3) p3Var.a();
            bVar.h0(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            qf.b bVar = this.h;
            int i10 = this.f4340l;
            bVar.getClass();
            p3 p3Var = (p3) ((q3) bVar.f43097b).g();
            p3Var.c();
            q3.p((q3) p3Var.f5767b, i10);
            q3 q3Var = (q3) p3Var.a();
            bVar.f43097b = q3Var;
            bVar.q0(i3Var, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, i iVar) {
        try {
            int i11 = f0.f4363a;
            f3 f3Var = (f3) f0.b(i10, 6, iVar, null, n3.BROADCAST_ACTION_UNSPECIFIED).g();
            d4 r10 = e4.r();
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
        synchronized (this.f4332a) {
            try {
                if (this.f4333b == 3) {
                    return;
                }
                int i11 = this.f4333b;
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
                this.f4333b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(d dVar) {
        int i10;
        i iVar;
        synchronized (this.f4332a) {
            try {
                if (o()) {
                    iVar = t();
                } else if (this.f4333b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    iVar = h0.f4373c;
                    j(37, iVar);
                } else if (this.f4333b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    iVar = h0.h;
                    j(38, iVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f4338j = new z(this, dVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f4338j.f4430b;
                    mVar.f5707c = 0L;
                    mVar.f5706b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f4336g.getPackageManager().queryIntentServices(intent, 0);
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
                                intent2.putExtra("playBillingLibraryVersion", this.f4334c);
                                synchronized (this.f4332a) {
                                    try {
                                        if (this.f4333b == 2) {
                                            iVar = t();
                                        } else if (this.f4333b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            iVar = h0.h;
                                            j(105, iVar);
                                        } else {
                                            z zVar = this.f4338j;
                                            if (this.f4336g.bindService(intent2, zVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                iVar = null;
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
                    iVar = h0.f4371a;
                    j(i10, iVar);
                }
            } finally {
            }
        }
        if (iVar != null) {
            dVar.onBillingSetupFinished(iVar);
        }
    }

    public final void m() {
        synchronized (this.f4332a) {
            if (this.f4338j != null) {
                this.f4336g.unbindService(this.f4338j);
                this.f4337i = null;
                this.f4338j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a2 = hVar.a();
            long j10 = 30000;
            int i10 = 1;
            long j11 = 30000;
            while (i10 <= 3) {
                try {
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (Math.max(0L, j11) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                i iVar = h0.f4375g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = iVar.f4384a;
                if (i11 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                j11 = j10 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                long j12 = j10;
                long pow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (j11 < pow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i10 < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j11 = j12 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                    } catch (InterruptedException e7) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e7);
                    }
                }
                i10++;
                j10 = j12;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
            return o();
        }
        throw new NullPointerException("ticker");
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f4332a) {
            try {
                z10 = false;
                if (this.f4333b == 2 && this.f4337i != null && this.f4338j != null) {
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

    public final j6.l s(i iVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, iVar, f0.a(exc));
        return new j6.l(iVar.f4384a, iVar.f4386c, new ArrayList(), new ArrayList());
    }

    public final i t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.f5767b, 6);
        d4 r10 = e4.r();
        r10.c();
        e4.q((e4) r10.f5767b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.f5767b, (e4) r10.a());
        i((i3) s10.a());
        return h0.f4375g;
    }

    public final i u() {
        int[] iArr = {0, 3};
        synchronized (this.f4332a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f4333b == iArr[i10]) {
                    return h0.h;
                }
            }
            return h0.f4374f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f4336g.getPackageName();
    }

    public final n4.s x(i iVar, int i10, String str, Exception exc) {
        A(i10, 9, iVar, f0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.s(iVar, null, false, 9);
    }

    public final void y(int i10, int i11, i iVar) {
        try {
            int i12 = f0.f4363a;
            h(f0.b(i10, i11, iVar, null, n3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, i iVar, long j10) {
        try {
            int i11 = f0.f4363a;
            this.h.j0(f0.b(i10, 2, iVar, null, n3.BROADCAST_ACTION_UNSPECIFIED), this.f4340l, j10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public c(rb.b bVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f5670a;
        this.f4334c = "8.0.0";
        String w9 = w();
        this.d = w9;
        this.f4336g = context.getApplicationContext();
        p3 x10 = q3.x();
        x10.c();
        q3.v((q3) x10.f5767b);
        if (w9 != null) {
            x10.c();
            q3.w((q3) x10.f5767b, w9);
        }
        String packageName = this.f4336g.getPackageName();
        x10.c();
        q3.t((q3) x10.f5767b, packageName);
        x10.c();
        q3.q((q3) x10.f5767b, nextLong);
        x10.c();
        q3.u((q3) x10.f5767b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        q3.n((q3) x10.f5767b, i10);
        x10.d();
        try {
            int i11 = this.f4336g.getPackageManager().getPackageInfo(this.f4336g.getPackageName(), 0).versionCode;
            x10.c();
            q3.o((q3) x10.f5767b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new qf.b(this.f4336g, (q3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f4335f = new h(this.f4336g, null, this.h);
        this.f4351x = bVar;
        this.f4336g.getPackageName();
    }
}
