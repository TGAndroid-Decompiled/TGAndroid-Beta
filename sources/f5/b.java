package f5;

import a8.ca;
import a8.xa;
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
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
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
public class b extends ca {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f11246c;
    public final String d;
    public volatile e f11248f;
    public final Context f11249g;
    public final wf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f11250i;
    public volatile t f11251j;
    public boolean f11252k;
    public boolean f11254m;
    public boolean f11255n;
    public boolean f11256o;
    public boolean f11257p;
    public boolean f11258q;
    public boolean f11259r;
    public boolean f11260s;
    public boolean f11261t;
    public boolean f11262u;
    public boolean v;
    public boolean f11263w;
    public final w7.s f11264x;
    public final boolean f11265y;
    public ExecutorService f11266z;
    public final Object f11244a = new Object();
    public volatile int f11245b = 0;
    public final Handler f11247e = new Handler(Looper.getMainLooper());
    public int f11253l = 0;

    public b(w7.s sVar, Context context, o oVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7031a;
        this.f11246c = "8.0.0";
        String x10 = x();
        this.d = x10;
        this.f11249g = context.getApplicationContext();
        o3 x11 = p3.x();
        x11.c();
        p3.v((p3) x11.f7134b);
        if (x10 != null) {
            x11.c();
            p3.w((p3) x11.f7134b, x10);
        }
        String packageName = this.f11249g.getPackageName();
        x11.c();
        p3.t((p3) x11.f7134b, packageName);
        x11.c();
        p3.q((p3) x11.f7134b, nextLong);
        x11.c();
        p3.u((p3) x11.f7134b);
        int i7 = Build.VERSION.SDK_INT;
        x11.c();
        p3.n((p3) x11.f7134b, i7);
        x11.d();
        try {
            int i10 = this.f11249g.getPackageManager().getPackageInfo(this.f11249g.getPackageName(), 0).versionCode;
            x11.c();
            p3.o((p3) x11.f7134b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new wf.b(this.f11249g, (p3) x11.a());
        if (oVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11248f = new e(this.f11249g, oVar, this.h);
        this.f11264x = sVar;
        this.f11265y = false;
        this.f11249g.getPackageName();
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
            synchronized (bVar.f11244a) {
                try {
                    if (bVar.f11245b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f11248f != null) {
                        eVar = bVar.f11248f;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        boolean z10 = bVar.f11262u;
                        a0 a0Var = (a0) eVar.f11276e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        eVar.f11273a = z10;
                        Context context = (Context) eVar.f11274b;
                        ((a0) eVar.f11277f).a(context, intentFilter2);
                        if (eVar.f11273a) {
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
        boolean z10;
        synchronized (bVar.f11244a) {
            z10 = true;
            if (bVar.f11245b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static String x() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i7, f fVar, long j3) {
        try {
            int i10 = x.f11319a;
            this.h.X(x.b(i7, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f11253l, j3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i7, int i10, f fVar, String str) {
        try {
            int i11 = x.f11319a;
            h(x.b(i7, i10, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i7, f fVar, long j3, boolean z10) {
        try {
            int i10 = x.f11319a;
            this.h.Z(x.b(i7, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f11253l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(int i7, f fVar, String str, long j3, boolean z10) {
        try {
            int i10 = x.f11319a;
            this.h.Z(x.b(i7, 2, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f11253l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void E(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f11247e.post(new m9.u(13, this, fVar));
    }

    public void a(g gVar, h hVar) {
        if (f(new r(this, hVar, gVar, 0), 30000L, new m9.u(this, hVar, gVar), r(), e()) == null) {
            f u10 = u();
            z(25, 4, u10);
            hVar.a(u10);
        }
    }

    public f5.f b(android.app.Activity r37, final f5.e r38) {
        throw new UnsupportedOperationException("Method not decompiled: f5.b.b(android.app.Activity, f5.e):f5.f");
    }

    public void c(d6.i iVar, j1 j1Var) {
        if (f(new r(this, j1Var, iVar, 1), 30000L, new m9.u(16, this, j1Var), r(), e()) == null) {
            f u10 = u();
            z(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7109b;
            ((q1) j1Var.f24781b).a(u10, com.google.android.gms.internal.play_billing.v.f7136e);
        }
    }

    public void d(r1 r1Var) {
        l(r1Var, 0);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f11266z == null) {
                this.f11266z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f7131a, new s(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11266z;
    }

    public final void g(h hVar, String str, f fVar, int i7, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        B(i7, 4, fVar, x.a(exc));
        hVar.a(fVar);
    }

    public final void h(g3 g3Var) {
        try {
            wf.b bVar = this.h;
            int i7 = this.f11253l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f59680b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7134b, i7);
            bVar.f59680b = (p3) o3Var.a();
            bVar.W(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            wf.b bVar = this.h;
            int i7 = this.f11253l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f59680b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7134b, i7);
            p3 p3Var = (p3) o3Var.a();
            bVar.f59680b = p3Var;
            bVar.e0(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i7, int i10, f fVar) {
        boolean z10;
        try {
            int i11 = x.f11319a;
            f3 f3Var = (f3) x.b(i7, 6, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r10 = d4.r();
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r10.d(z10);
            r10.e(i10);
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i7) {
        String str;
        String str2;
        synchronized (this.f11244a) {
            try {
                if (this.f11245b == 3) {
                    return;
                }
                int i10 = this.f11245b;
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
                this.f11245b = i7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar, int i7) {
        int i10;
        f fVar;
        boolean bindService;
        f fVar2;
        synchronized (this.f11244a) {
            try {
                if (o()) {
                    fVar = t(i7);
                } else {
                    if (this.f11245b == 1) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        fVar2 = z.f11323c;
                        j(37, i7, fVar2);
                    } else if (this.f11245b == 3) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        fVar2 = z.h;
                        j(38, i7, fVar2);
                    } else {
                        k(1);
                        if (i7 == 0) {
                            i7 = 0;
                        }
                        m();
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                        this.f11251j = new t(this, cVar, i7);
                        com.google.android.gms.internal.play_billing.m mVar = this.f11251j.f11313b;
                        mVar.f7067c = 0L;
                        mVar.f7066b = false;
                        mVar.a();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.f11249g.getPackageManager().queryIntentServices(intent, 0);
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
                                    intent2.putExtra("playBillingLibraryVersion", this.f11246c);
                                    synchronized (this.f11244a) {
                                        try {
                                            if (this.f11245b == 2) {
                                                fVar = t(i7);
                                            } else if (this.f11245b != 1) {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                fVar2 = z.h;
                                                j(105, i7, fVar2);
                                            } else {
                                                t tVar = this.f11251j;
                                                if (i7 > 0 && Build.VERSION.SDK_INT >= 29) {
                                                    bindService = this.f11249g.bindService(intent2, 1, e(), tVar);
                                                } else {
                                                    bindService = this.f11249g.bindService(intent2, tVar, 1);
                                                }
                                                if (bindService) {
                                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                    fVar = null;
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
                        f fVar3 = z.f11321a;
                        j(i10, i7, fVar3);
                        fVar = fVar3;
                    }
                    fVar = fVar2;
                }
            } finally {
            }
        }
        if (fVar != null) {
            cVar.a(fVar);
        }
    }

    public final void m() {
        synchronized (this.f11244a) {
            if (this.f11251j != null) {
                this.f11249g.unbindService(this.f11251j);
                this.f11250i = null;
                this.f11251j = null;
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
                t0 v = v(i7);
                TimeUnit.MILLISECONDS.getClass();
                int i10 = ((f) ((r0) v).f7111a).f11278a;
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
        boolean z10;
        synchronized (this.f11244a) {
            try {
                z10 = false;
                if (this.f11245b == 2 && this.f11250i != null && this.f11251j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f11247e;
        }
        return new Handler(Looper.myLooper());
    }

    public final xa s(f fVar, int i7, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        B(i7, 7, fVar, x.a(exc));
        return new xa(fVar.f11278a, fVar.f11280c, new ArrayList(), new ArrayList());
    }

    public final f t(int i7) {
        boolean z10;
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s5 = i3.s();
        s5.c();
        i3.r((i3) s5.f7134b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f7134b);
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r10.d(z10);
        r10.e(i7);
        s5.c();
        i3.q((i3) s5.f7134b, (d4) r10.a());
        i((i3) s5.a());
        return z.f11326g;
    }

    public final f u() {
        int[] iArr = {0, 3};
        synchronized (this.f11244a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f11245b == iArr[i7]) {
                    return z.h;
                }
            }
            return z.f11325f;
        }
    }

    public final t0 v(int i7) {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return new r0(z.f11326g);
    }

    public final void w() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f11249g.getPackageName();
    }

    public final q4.q y(f fVar, int i7, String str, Exception exc) {
        B(i7, 9, fVar, x.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new q4.q(19, fVar, (Object) null);
    }

    public final void z(int i7, int i10, f fVar) {
        try {
            int i11 = x.f11319a;
            h(x.b(i7, i10, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(w7.s sVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7031a;
        this.f11246c = "8.0.0";
        String x10 = x();
        this.d = x10;
        this.f11249g = context.getApplicationContext();
        o3 x11 = p3.x();
        x11.c();
        p3.v((p3) x11.f7134b);
        if (x10 != null) {
            x11.c();
            p3.w((p3) x11.f7134b, x10);
        }
        String packageName = this.f11249g.getPackageName();
        x11.c();
        p3.t((p3) x11.f7134b, packageName);
        x11.c();
        p3.q((p3) x11.f7134b, nextLong);
        x11.c();
        p3.u((p3) x11.f7134b);
        int i7 = Build.VERSION.SDK_INT;
        x11.c();
        p3.n((p3) x11.f7134b, i7);
        x11.d();
        try {
            int i10 = this.f11249g.getPackageManager().getPackageInfo(this.f11249g.getPackageName(), 0).versionCode;
            x11.c();
            p3.o((p3) x11.f7134b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new wf.b(this.f11249g, (p3) x11.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f11248f = new e(this.f11249g, null, this.h);
        this.f11264x = sVar;
        this.f11249g.getPackageName();
    }
}
