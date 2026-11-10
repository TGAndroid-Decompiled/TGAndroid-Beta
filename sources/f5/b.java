package f5;

import a8.wa;
import aa.c0;
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
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
public class b {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f11124c;
    public final String d;
    public volatile e f11126f;
    public final Context f11127g;
    public final q4.q h;
    public volatile com.google.android.gms.internal.play_billing.c f11128i;
    public volatile s f11129j;
    public boolean f11130k;
    public boolean f11132m;
    public boolean f11133n;
    public boolean f11134o;
    public boolean f11135p;
    public boolean f11136q;
    public boolean f11137r;
    public boolean f11138s;
    public boolean f11139t;
    public boolean f11140u;
    public boolean v;
    public boolean f11141w;
    public final sa.d f11142x;
    public final boolean f11143y;
    public ExecutorService f11144z;
    public final Object f11122a = new Object();
    public volatile int f11123b = 0;
    public final Handler f11125e = new Handler(Looper.getMainLooper());
    public int f11131l = 0;

    public b(sa.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7369a;
        this.f11124c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f11127g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f7472b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f7472b, w10);
        }
        String packageName = this.f11127g.getPackageName();
        x10.c();
        p3.t((p3) x10.f7472b, packageName);
        x10.c();
        p3.q((p3) x10.f7472b, nextLong);
        x10.c();
        p3.u((p3) x10.f7472b);
        int i7 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f7472b, i7);
        x10.d();
        try {
            int i10 = this.f11127g.getPackageManager().getPackageInfo(this.f11127g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f7472b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new q4.q(this.f11127g, (p3) x10.a());
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11126f = new e(this.f11127g, nVar, this.h);
        this.f11142x = dVar;
        this.f11143y = false;
        this.f11127g.getPackageName();
    }

    public static Future f(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new m9.u(14, submit, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static void p(b bVar, int i7) {
        e eVar;
        if (i7 == 0) {
            synchronized (bVar.f11122a) {
                try {
                    if (bVar.f11123b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f11126f != null) {
                        eVar = bVar.f11126f;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        boolean z9 = bVar.f11140u;
                        a0 a0Var = (a0) eVar.f11154e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        eVar.f11151a = z9;
                        Context context = (Context) eVar.f11152b;
                        ((a0) eVar.f11155f).a(context, intentFilter2);
                        if (eVar.f11151a) {
                            a0Var.b(context, intentFilter);
                            return;
                        } else {
                            a0Var.a(context, intentFilter);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        bVar.k(0);
    }

    public static boolean q(b bVar) {
        boolean z9;
        synchronized (bVar.f11122a) {
            z9 = true;
            if (bVar.f11123b != 1) {
                z9 = false;
            }
        }
        return z9;
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i7, int i10, f fVar, String str) {
        try {
            int i11 = x.f11198a;
            h(x.b(i7, i10, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i7, f fVar, long j3, boolean z9) {
        try {
            int i10 = x.f11198a;
            this.h.k(x.b(i7, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f11131l, j3, z9);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i7, f fVar, String str, long j3, boolean z9) {
        try {
            int i10 = x.f11198a;
            this.h.k(x.b(i7, 2, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f11131l, j3, z9);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f11125e.post(new m9.u(13, this, fVar));
    }

    public void a(c0 c0Var, g gVar) {
        if (f(new q(this, gVar, c0Var, 0), 30000L, new m9.u(this, gVar, c0Var), r(), e()) == null) {
            f u10 = u();
            y(25, 4, u10);
            gVar.a(u10);
        }
    }

    public f5.f b(android.app.Activity r32, final f5.e r33) {
        throw new UnsupportedOperationException("Method not decompiled: f5.b.b(android.app.Activity, f5.e):f5.f");
    }

    public void c(aa.n nVar, j1 j1Var) {
        if (f(new q(this, j1Var, nVar, 1), 30000L, new m9.u(16, this, j1Var), r(), e()) == null) {
            f u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7447b;
            ((q1) j1Var.f23469b).a(u10, com.google.android.gms.internal.play_billing.v.f7474e);
        }
    }

    public void d(r1 r1Var) {
        l(r1Var);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f11144z == null) {
                this.f11144z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f7469a, new r(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11144z;
    }

    public final void g(g gVar, String str, f fVar, int i7, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i7, 4, fVar, x.a(exc));
        gVar.a(fVar);
    }

    public final void h(g3 g3Var) {
        try {
            q4.q qVar = this.h;
            int i7 = this.f11131l;
            qVar.getClass();
            o3 o3Var = (o3) ((p3) qVar.f53815b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7472b, i7);
            qVar.f53815b = (p3) o3Var.a();
            qVar.h(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            q4.q qVar = this.h;
            int i7 = this.f11131l;
            qVar.getClass();
            o3 o3Var = (o3) ((p3) qVar.f53815b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7472b, i7);
            p3 p3Var = (p3) o3Var.a();
            qVar.f53815b = p3Var;
            qVar.q(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i7, f fVar) {
        try {
            int i10 = x.f11198a;
            f3 f3Var = (f3) x.b(i7, 6, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r10 = d4.r();
            r10.d(false);
            r10.e();
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i7) {
        String str;
        String str2;
        synchronized (this.f11122a) {
            try {
                if (this.f11123b == 3) {
                    return;
                }
                int i10 = this.f11123b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
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
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
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
                this.f11123b = i7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i7;
        f fVar;
        synchronized (this.f11122a) {
            try {
                if (o()) {
                    fVar = t();
                } else if (this.f11123b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fVar = z.f11202c;
                    j(37, fVar);
                } else if (this.f11123b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fVar = z.h;
                    j(38, fVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f11129j = new s(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f11129j.f11190b;
                    mVar.f7405c = 0L;
                    mVar.f7404b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f11127g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i7 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f11124c);
                                synchronized (this.f11122a) {
                                    try {
                                        if (this.f11123b == 2) {
                                            fVar = t();
                                        } else if (this.f11123b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            fVar = z.h;
                                            j(105, fVar);
                                        } else {
                                            s sVar = this.f11129j;
                                            if (this.f11127g.bindService(intent2, sVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                fVar = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i7 = 39;
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
                        i7 = 41;
                    }
                    k(0);
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                    fVar = z.f11200a;
                    j(i7, fVar);
                }
            } finally {
            }
        }
        if (fVar != null) {
            cVar.a(fVar);
        }
    }

    public final void m() {
        synchronized (this.f11122a) {
            if (this.f11129j != null) {
                this.f11127g.unbindService(this.f11129j);
                this.f11128i = null;
                this.f11129j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a10 = hVar.a();
            long j3 = 30000;
            int i7 = 1;
            long j10 = 30000;
            while (i7 <= 3) {
                try {
                } catch (Exception e10) {
                    if (e10 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e10);
                }
                if (Math.max(0L, j10) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                f fVar = z.f11205g;
                TimeUnit.MILLISECONDS.getClass();
                int i10 = fVar.f11156a;
                if (i10 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i10);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i10);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                j10 = j3 - timeUnit.convert((hVar.a() - a10) + 0, timeUnit2);
                long j11 = j3;
                long pow = ((long) Math.pow(2.0d, i7 - 1)) * 1000;
                if (j10 < pow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i7 < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j10 = j11 - timeUnit.convert((hVar.a() - a10) + 0, timeUnit2);
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                    }
                }
                i7++;
                j3 = j11;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
            return o();
        }
        throw new NullPointerException("ticker");
    }

    public final boolean o() {
        boolean z9;
        synchronized (this.f11122a) {
            try {
                z9 = false;
                if (this.f11123b == 2 && this.f11128i != null && this.f11129j != null) {
                    z9 = true;
                }
            } finally {
            }
        }
        return z9;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f11125e;
        }
        return new Handler(Looper.myLooper());
    }

    public final wa s(f fVar, int i7, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i7, 7, fVar, x.a(exc));
        return new wa(fVar.f11156a, fVar.f11158c, new ArrayList(), new ArrayList());
    }

    public final f t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s5 = i3.s();
        s5.c();
        i3.r((i3) s5.f7472b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f7472b);
        r10.d(false);
        r10.e();
        s5.c();
        i3.q((i3) s5.f7472b, (d4) r10.a());
        i((i3) s5.a());
        return z.f11205g;
    }

    public final f u() {
        int[] iArr = {0, 3};
        synchronized (this.f11122a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f11123b == iArr[i7]) {
                    return z.h;
                }
            }
            return z.f11204f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f11127g.getPackageName();
    }

    public final wf.b x(f fVar, int i7, String str, Exception exc) {
        A(i7, 9, fVar, x.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new wf.b(fVar, null, false, 17);
    }

    public final void y(int i7, int i10, f fVar) {
        try {
            int i11 = x.f11198a;
            h(x.b(i7, i10, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i7, f fVar, long j3) {
        try {
            int i10 = x.f11198a;
            this.h.i(x.b(i7, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f11131l, j3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(sa.d dVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7369a;
        this.f11124c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f11127g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f7472b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f7472b, w10);
        }
        String packageName = this.f11127g.getPackageName();
        x10.c();
        p3.t((p3) x10.f7472b, packageName);
        x10.c();
        p3.q((p3) x10.f7472b, nextLong);
        x10.c();
        p3.u((p3) x10.f7472b);
        int i7 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f7472b, i7);
        x10.d();
        try {
            int i10 = this.f11127g.getPackageManager().getPackageInfo(this.f11127g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f7472b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new q4.q(this.f11127g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f11126f = new e(this.f11127g, null, this.h);
        this.f11142x = dVar;
        this.f11127g.getPackageName();
    }
}
