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
import org.telegram.messenger.s1;
import org.telegram.messenger.t1;
import org.telegram.messenger.u1;
public class b {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f3736c;
    public final String d;
    public volatile f f3737f;
    public final Context f3738g;
    public final hf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f3739i;
    public volatile u f3740j;
    public boolean f3741k;
    public boolean f3743m;
    public boolean f3744n;
    public boolean f3745o;
    public boolean f3746p;
    public boolean f3747q;
    public boolean f3748r;
    public boolean f3749s;
    public boolean f3750t;
    public boolean f3751u;
    public boolean v;
    public boolean f3752w;
    public final oa.d f3753x;
    public final boolean f3754y;
    public ExecutorService f3755z;
    public final Object f3734a = new Object();
    public volatile int f3735b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int f3742l = 0;

    public b(oa.d dVar, Context context, o oVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f5120a;
        this.f3736c = "8.0.0";
        String w9 = w();
        this.d = w9;
        this.f3738g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f5214b);
        if (w9 != null) {
            x10.c();
            p3.w((p3) x10.f5214b, w9);
        }
        String packageName = this.f3738g.getPackageName();
        x10.c();
        p3.t((p3) x10.f5214b, packageName);
        x10.c();
        p3.q((p3) x10.f5214b, nextLong);
        x10.c();
        p3.u((p3) x10.f5214b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f5214b, i10);
        x10.d();
        try {
            int i11 = this.f3738g.getPackageManager().getPackageInfo(this.f3738g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f5214b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new hf.b(this.f3738g, (p3) x10.a());
        if (oVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3737f = new f(this.f3738g, oVar, this.h);
        this.f3753x = dVar;
        this.f3754y = false;
        this.f3738g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new j9.u(3, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(b bVar, int i10) {
        f fVar;
        if (i10 == 0) {
            synchronized (bVar.f3734a) {
                try {
                    if (bVar.f3735b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f3737f != null) {
                        fVar = bVar.f3737f;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        boolean z10 = bVar.f3751u;
                        d0 d0Var = (d0) fVar.e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        fVar.f3781a = z10;
                        Context context = (Context) fVar.f3782b;
                        ((d0) fVar.f3784f).a(context, intentFilter2);
                        if (fVar.f3781a) {
                            d0Var.b(context, intentFilter);
                            return;
                        } else {
                            d0Var.a(context, intentFilter);
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
        boolean z10;
        synchronized (bVar.f3734a) {
            z10 = true;
            if (bVar.f3735b != 1) {
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

    public final void A(int i10, int i11, g gVar, String str) {
        try {
            int i12 = a0.f3733a;
            h(a0.b(i10, i11, gVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, g gVar, long j10, boolean z10) {
        try {
            int i11 = a0.f3733a;
            this.h.w0(a0.b(i10, 2, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f3742l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, g gVar, String str, long j10, boolean z10) {
        try {
            int i11 = a0.f3733a;
            this.h.w0(a0.b(i10, 2, gVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f3742l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new j9.u(2, this, gVar));
    }

    public void a(h hVar, k6.h hVar2) {
        if (f(new r(this, hVar, hVar2, 0), 30000L, new j9.u(this, hVar, hVar2), r(), e()) == null) {
            g u10 = u();
            y(25, 4, u10);
            hVar.a(u10);
        }
    }

    public c5.g b(android.app.Activity r32, final c5.f r33) {
        throw new UnsupportedOperationException("Method not decompiled: c5.b.b(android.app.Activity, c5.f):c5.g");
    }

    public void c(a4.l lVar, s1 s1Var) {
        if (f(new r(this, s1Var, lVar, 1), 30000L, new j9.u(5, this, s1Var), r(), e()) == null) {
            g u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f5191b;
            ((t1) s1Var.f18056b).a(u10, com.google.android.gms.internal.play_billing.v.e);
        }
    }

    public void d(u1 u1Var) {
        l(u1Var);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f3755z == null) {
                this.f3755z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f5211a, new s(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3755z;
    }

    public final void g(h hVar, String str, g gVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, gVar, a0.a(exc));
        hVar.a(gVar);
    }

    public final void h(g3 g3Var) {
        try {
            hf.b bVar = this.h;
            int i10 = this.f3742l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f7658b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5214b, i10);
            bVar.f7658b = (p3) o3Var.a();
            bVar.s0(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            hf.b bVar = this.h;
            int i10 = this.f3742l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f7658b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5214b, i10);
            p3 p3Var = (p3) o3Var.a();
            bVar.f7658b = p3Var;
            bVar.B0(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, g gVar) {
        try {
            int i11 = a0.f3733a;
            f3 f3Var = (f3) a0.b(i10, 6, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
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
        synchronized (this.f3734a) {
            try {
                if (this.f3735b == 3) {
                    return;
                }
                int i11 = this.f3735b;
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
                this.f3735b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i10;
        g gVar;
        synchronized (this.f3734a) {
            try {
                if (o()) {
                    gVar = t();
                } else if (this.f3735b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gVar = c0.f3759c;
                    j(37, gVar);
                } else if (this.f3735b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gVar = c0.h;
                    j(38, gVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f3740j = new u(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f3740j.f3819b;
                    mVar.f5154c = 0L;
                    mVar.f5153b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f3738g.getPackageManager().queryIntentServices(intent, 0);
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
                                intent2.putExtra("playBillingLibraryVersion", this.f3736c);
                                synchronized (this.f3734a) {
                                    try {
                                        if (this.f3735b == 2) {
                                            gVar = t();
                                        } else if (this.f3735b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            gVar = c0.h;
                                            j(105, gVar);
                                        } else {
                                            u uVar = this.f3740j;
                                            if (this.f3738g.bindService(intent2, uVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                gVar = null;
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
                    gVar = c0.f3757a;
                    j(i10, gVar);
                }
            } finally {
            }
        }
        if (gVar != null) {
            cVar.a(gVar);
        }
    }

    public final void m() {
        synchronized (this.f3734a) {
            if (this.f3740j != null) {
                this.f3738g.unbindService(this.f3740j);
                this.f3739i = null;
                this.f3740j = null;
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
                g gVar = c0.f3761g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = gVar.f3785a;
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
        synchronized (this.f3734a) {
            try {
                z10 = false;
                if (this.f3735b == 2 && this.f3739i != null && this.f3740j != null) {
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

    public final a5.a s(g gVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, gVar, a0.a(exc));
        return new a5.a(gVar.f3785a, gVar.f3787c, new ArrayList(), new ArrayList());
    }

    public final g t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.f5214b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f5214b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.f5214b, (d4) r10.a());
        i((i3) s10.a());
        return c0.f3761g;
    }

    public final g u() {
        int[] iArr = {0, 3};
        synchronized (this.f3734a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f3735b == iArr[i10]) {
                    return c0.h;
                }
            }
            return c0.f3760f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f3738g.getPackageName();
    }

    public final n4.q x(g gVar, int i10, String str, Exception exc) {
        A(i10, 9, gVar, a0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.q(gVar, null, false);
    }

    public final void y(int i10, int i11, g gVar) {
        try {
            int i12 = a0.f3733a;
            h(a0.b(i10, i11, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, g gVar, long j10) {
        try {
            int i11 = a0.f3733a;
            this.h.t0(a0.b(i10, 2, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f3742l, j10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(oa.d dVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f5120a;
        this.f3736c = "8.0.0";
        String w9 = w();
        this.d = w9;
        this.f3738g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f5214b);
        if (w9 != null) {
            x10.c();
            p3.w((p3) x10.f5214b, w9);
        }
        String packageName = this.f3738g.getPackageName();
        x10.c();
        p3.t((p3) x10.f5214b, packageName);
        x10.c();
        p3.q((p3) x10.f5214b, nextLong);
        x10.c();
        p3.u((p3) x10.f5214b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f5214b, i10);
        x10.d();
        try {
            int i11 = this.f3738g.getPackageManager().getPackageInfo(this.f3738g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f5214b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new hf.b(this.f3738g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3737f = new f(this.f3738g, null, this.h);
        this.f3753x = dVar;
        this.f3738g.getPackageName();
    }
}
