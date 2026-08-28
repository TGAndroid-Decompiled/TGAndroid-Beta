package n2;

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
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import f7.d7;
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
public class b extends a {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f18268c;
    public final String d;
    public volatile f f18270f;
    public final Context f18271g;
    public final g5.b h;
    public volatile com.google.android.gms.internal.play_billing.c f18272i;
    public volatile t f18273j;
    public boolean f18274k;
    public boolean f18276m;
    public boolean f18277n;
    public boolean f18278o;
    public boolean f18279p;
    public boolean f18280q;
    public boolean f18281r;
    public boolean f18282s;
    public boolean f18283t;
    public boolean f18284u;
    public boolean v;
    public boolean f18285w;
    public final ya.b f18286x;
    public final boolean f18287y;
    public ExecutorService f18288z;
    public final Object f18266a = new Object();
    public volatile int f18267b = 0;
    public final Handler f18269e = new Handler(Looper.getMainLooper());
    public int f18275l = 0;

    public b(ya.b bVar, Context context, n nVar, a9.c cVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f3588a;
        this.f18268c = "8.0.0";
        String w8 = w();
        this.d = w8;
        this.f18271g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f3691b);
        if (w8 != null) {
            x10.c();
            p3.w((p3) x10.f3691b, w8);
        }
        String packageName = this.f18271g.getPackageName();
        x10.c();
        p3.t((p3) x10.f3691b, packageName);
        x10.c();
        p3.q((p3) x10.f3691b, nextLong);
        x10.c();
        p3.u((p3) x10.f3691b);
        int i9 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f3691b, i9);
        x10.d();
        try {
            int i10 = this.f18271g.getPackageManager().getPackageInfo(this.f18271g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f3691b, i10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new g5.b(this.f18271g, (p3) x10.a());
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f18270f = new f(this.f18271g, nVar, this.h);
        this.f18286x = bVar;
        this.f18287y = false;
        this.f18271g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new androidx.biometric.j(submit, runnable, false, 25), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static void p(b bVar, int i9) {
        f fVar;
        if (i9 == 0) {
            synchronized (bVar.f18266a) {
                try {
                    if (bVar.f18267b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f18270f != null) {
                        fVar = bVar.f18270f;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        boolean z10 = bVar.f18284u;
                        c0 c0Var = (c0) fVar.f18317e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        fVar.f18314a = z10;
                        Context context = (Context) fVar.f18315b;
                        ((c0) fVar.f18318f).a(context, intentFilter2);
                        if (fVar.f18314a) {
                            c0Var.b(context, intentFilter);
                            return;
                        } else {
                            c0Var.a(context, intentFilter);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.k(0);
    }

    public static boolean q(b bVar) {
        boolean z10;
        synchronized (bVar.f18266a) {
            z10 = true;
            if (bVar.f18267b != 1) {
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

    public final void A(int i9, int i10, g gVar, String str) {
        try {
            int i11 = z.f18363a;
            h(z.b(i9, i10, gVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void B(int i9, g gVar, long j10, boolean z10) {
        try {
            int i10 = z.f18363a;
            this.h.z(z.b(i9, 2, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f18275l, j10, z10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void C(int i9, g gVar, String str, long j10, boolean z10) {
        try {
            int i10 = z.f18363a;
            this.h.z(z.b(i9, 2, gVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f18275l, j10, z10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void D(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f18269e.post(new androidx.biometric.j(this, gVar, false, 24));
    }

    @Override
    public void a(d7 d7Var, h hVar) {
        if (f(new s(this, hVar, d7Var, 0), 30000L, new q1(this, hVar, d7Var, false, 8), r(), e()) == null) {
            g u10 = u();
            y(25, 4, u10);
            hVar.a(u10, d7Var.f5642a);
        }
    }

    @Override
    public n2.g b(android.app.Activity r32, final n2.f r33) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.b(android.app.Activity, n2.f):n2.g");
    }

    @Override
    public void c(p pVar, org.telegram.messenger.d dVar) {
        if (f(new s(this, dVar, pVar, 1), 30000L, new androidx.biometric.j(this, dVar, false, 26), r(), e()) == null) {
            g u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f3666b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f3693e;
            dVar.a(u10, new q(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f18288z == null) {
                this.f18288z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f3688a, new e9.v(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18288z;
    }

    public final void g(h hVar, String str, g gVar, int i9, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i9, 4, gVar, z.a(exc));
        hVar.a(gVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            g5.b bVar = this.h;
            int i9 = this.f18275l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f7111b).g();
            o3Var.c();
            p3.p((p3) o3Var.f3691b, i9);
            bVar.f7111b = (p3) o3Var.a();
            bVar.w(g3Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void i(i3 i3Var) {
        try {
            g5.b bVar = this.h;
            int i9 = this.f18275l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f7111b).g();
            o3Var.c();
            p3.p((p3) o3Var.f3691b, i9);
            p3 p3Var = (p3) o3Var.a();
            bVar.f7111b = p3Var;
            bVar.F(i3Var, p3Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void j(int i9, g gVar) {
        try {
            int i10 = z.f18363a;
            f3 f3Var = (f3) z.b(i9, 6, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r10 = d4.r();
            r10.d(false);
            r10.e();
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void k(int i9) {
        String str;
        String str2;
        synchronized (this.f18266a) {
            try {
                if (this.f18267b == 3) {
                    return;
                }
                int i10 = this.f18267b;
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
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
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
                this.f18267b = i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(c cVar) {
        int i9;
        g gVar;
        synchronized (this.f18266a) {
            try {
                if (o()) {
                    gVar = t();
                } else if (this.f18267b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gVar = b0.f18291c;
                    j(37, gVar);
                } else if (this.f18267b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gVar = b0.h;
                    j(38, gVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f18273j = new t(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f18273j.f18353b;
                    mVar.f3624c = 0L;
                    mVar.f3623b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f18271g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i9 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f18268c);
                                synchronized (this.f18266a) {
                                    try {
                                        if (this.f18267b == 2) {
                                            gVar = t();
                                        } else if (this.f18267b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            gVar = b0.h;
                                            j(105, gVar);
                                        } else {
                                            t tVar = this.f18273j;
                                            if (this.f18271g.bindService(intent2, tVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                gVar = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i9 = 39;
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
                        i9 = 41;
                    }
                    k(0);
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                    gVar = b0.f18289a;
                    j(i9, gVar);
                }
            } finally {
            }
        }
        if (gVar != null) {
            cVar.onBillingSetupFinished(gVar);
        }
    }

    public final void m() {
        synchronized (this.f18266a) {
            if (this.f18273j != null) {
                this.f18271g.unbindService(this.f18273j);
                this.f18272i = null;
                this.f18273j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a2 = hVar.a();
            long j10 = 30000;
            long j11 = 30000;
            int i9 = 1;
            while (i9 <= 3) {
                try {
                } catch (Exception e10) {
                    if (e10 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e10);
                }
                if (Math.max(0L, j11) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                g gVar = b0.f18294g;
                TimeUnit.MILLISECONDS.getClass();
                int i10 = gVar.f18319a;
                if (i10 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i10);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i10);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                j11 = j10 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                long j12 = j10;
                long pow = ((long) Math.pow(2.0d, i9 - 1)) * 1000;
                if (j11 < pow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i9 < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j11 = j12 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                    }
                }
                i9++;
                j10 = j12;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
            return o();
        }
        throw new NullPointerException("ticker");
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f18266a) {
            try {
                z10 = false;
                if (this.f18267b == 2 && this.f18272i != null && this.f18273j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f18269e;
        }
        return new Handler(Looper.myLooper());
    }

    public final t5.l s(g gVar, int i9, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i9, 7, gVar, z.a(exc));
        return new t5.l(gVar.f18319a, gVar.f18321c, new ArrayList(), new ArrayList());
    }

    public final g t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.f3691b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f3691b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.f3691b, (d4) r10.a());
        i((i3) s10.a());
        return b0.f18294g;
    }

    public final g u() {
        int[] iArr = {0, 3};
        synchronized (this.f18266a) {
            for (int i9 = 0; i9 < 2; i9++) {
                if (this.f18267b == iArr[i9]) {
                    return b0.h;
                }
            }
            return b0.f18293f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f18271g.getPackageName();
    }

    public final g5.b x(g gVar, int i9, String str, Exception exc) {
        A(i9, 9, gVar, z.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new g5.b(gVar, null, false, 25);
    }

    public final void y(int i9, int i10, g gVar) {
        try {
            int i11 = z.f18363a;
            h(z.b(i9, i10, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(int i9, g gVar, long j10) {
        try {
            int i10 = z.f18363a;
            this.h.x(z.b(i9, 2, gVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f18275l, j10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public b(ya.b bVar, Context context, a9.c cVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f3588a;
        this.f18268c = "8.0.0";
        String w8 = w();
        this.d = w8;
        this.f18271g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f3691b);
        if (w8 != null) {
            x10.c();
            p3.w((p3) x10.f3691b, w8);
        }
        String packageName = this.f18271g.getPackageName();
        x10.c();
        p3.t((p3) x10.f3691b, packageName);
        x10.c();
        p3.q((p3) x10.f3691b, nextLong);
        x10.c();
        p3.u((p3) x10.f3691b);
        int i9 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f3691b, i9);
        x10.d();
        try {
            int i10 = this.f18271g.getPackageManager().getPackageInfo(this.f18271g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f3691b, i10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new g5.b(this.f18271g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f18270f = new f(this.f18271g, null, this.h);
        this.f18286x = bVar;
        this.f18271g.getPackageName();
    }
}
