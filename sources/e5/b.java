package e5;

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
import b8.kg;
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
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
public class b {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f9561c;
    public final String d;
    public volatile e f9563f;
    public final Context f9564g;
    public final tf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f9565i;
    public volatile s f9566j;
    public boolean f9567k;
    public boolean f9569m;
    public boolean f9570n;
    public boolean f9571o;
    public boolean f9572p;
    public boolean f9573q;
    public boolean f9574r;
    public boolean f9575s;
    public boolean f9576t;
    public boolean f9577u;
    public boolean v;
    public boolean f9578w;
    public final nb.a f9579x;
    public final boolean f9580y;
    public ExecutorService f9581z;
    public final Object f9559a = new Object();
    public volatile int f9560b = 0;
    public final Handler f9562e = new Handler(Looper.getMainLooper());
    public int f9568l = 0;

    public b(nb.a aVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7421a;
        this.f9561c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f9564g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f7524b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f7524b, w10);
        }
        String packageName = this.f9564g.getPackageName();
        x10.c();
        p3.t((p3) x10.f7524b, packageName);
        x10.c();
        p3.q((p3) x10.f7524b, nextLong);
        x10.c();
        p3.u((p3) x10.f7524b);
        int i3 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f7524b, i3);
        x10.d();
        try {
            int i10 = this.f9564g.getPackageManager().getPackageInfo(this.f9564g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f7524b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new tf.b(this.f9564g, (p3) x10.a());
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f9563f = new e(this.f9564g, nVar, this.h);
        this.f9579x = aVar;
        this.f9580y = false;
        this.f9564g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new l9.u(8, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static void p(b bVar, int i3) {
        e eVar;
        if (i3 == 0) {
            synchronized (bVar.f9559a) {
                try {
                    if (bVar.f9560b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f9563f != null) {
                        eVar = bVar.f9563f;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        boolean z10 = bVar.f9577u;
                        a0 a0Var = (a0) eVar.f9591e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        eVar.f9588a = z10;
                        Context context = (Context) eVar.f9589b;
                        ((a0) eVar.f9592f).a(context, intentFilter2);
                        if (eVar.f9588a) {
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
        synchronized (bVar.f9559a) {
            z10 = true;
            if (bVar.f9560b != 1) {
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

    public final void A(int i3, int i10, f fVar, String str) {
        try {
            int i11 = x.f9636a;
            h(x.b(i3, i10, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i3, f fVar, long j10, boolean z10) {
        try {
            int i10 = x.f9636a;
            this.h.I(x.b(i3, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f9568l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i3, f fVar, String str, long j10, boolean z10) {
        try {
            int i10 = x.f9636a;
            this.h.I(x.b(i3, 2, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f9568l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f9562e.post(new l9.u(7, this, fVar));
    }

    public void a(com.google.android.gms.internal.clearcut.e eVar, g gVar) {
        if (f(new q(this, gVar, eVar, 0), 30000L, new l9.u(this, gVar, eVar), r(), e()) == null) {
            f u10 = u();
            y(25, 4, u10);
            gVar.a(u10);
        }
    }

    public e5.f b(android.app.Activity r32, final e5.e r33) {
        throw new UnsupportedOperationException("Method not decompiled: e5.b.b(android.app.Activity, e5.e):e5.f");
    }

    public void c(android.support.v4.media.c cVar, p1 p1Var) {
        if (f(new q(this, p1Var, cVar, 1), 30000L, new l9.u(10, this, p1Var), r(), e()) == null) {
            f u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7499b;
            ((q1) p1Var.f24685b).k(u10, com.google.android.gms.internal.play_billing.v.f7526e);
        }
    }

    public void d(r1 r1Var) {
        l(r1Var);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f9581z == null) {
                this.f9581z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f7521a, new r(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f9581z;
    }

    public final void g(g gVar, String str, f fVar, int i3, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i3, 4, fVar, x.a(exc));
        gVar.a(fVar);
    }

    public final void h(g3 g3Var) {
        try {
            tf.b bVar = this.h;
            int i3 = this.f9568l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f55094a).g();
            o3Var.c();
            p3.p((p3) o3Var.f7524b, i3);
            bVar.f55094a = (p3) o3Var.a();
            bVar.F(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            tf.b bVar = this.h;
            int i3 = this.f9568l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f55094a).g();
            o3Var.c();
            p3.p((p3) o3Var.f7524b, i3);
            p3 p3Var = (p3) o3Var.a();
            bVar.f55094a = p3Var;
            bVar.N(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i3, f fVar) {
        try {
            int i10 = x.f9636a;
            f3 f3Var = (f3) x.b(i3, 6, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r5 = d4.r();
            r5.d(false);
            r5.e();
            f3Var.e(r5);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i3) {
        String str;
        String str2;
        synchronized (this.f9559a) {
            try {
                if (this.f9560b == 3) {
                    return;
                }
                int i10 = this.f9560b;
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
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
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
                this.f9560b = i3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i3;
        f fVar;
        synchronized (this.f9559a) {
            try {
                if (o()) {
                    fVar = t();
                } else if (this.f9560b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fVar = z.f9640c;
                    j(37, fVar);
                } else if (this.f9560b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fVar = z.h;
                    j(38, fVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f9566j = new s(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f9566j.f9628b;
                    mVar.f7457c = 0L;
                    mVar.f7456b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f9564g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i3 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f9561c);
                                synchronized (this.f9559a) {
                                    try {
                                        if (this.f9560b == 2) {
                                            fVar = t();
                                        } else if (this.f9560b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            fVar = z.h;
                                            j(105, fVar);
                                        } else {
                                            s sVar = this.f9566j;
                                            if (this.f9564g.bindService(intent2, sVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                fVar = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i3 = 39;
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
                        i3 = 41;
                    }
                    k(0);
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                    fVar = z.f9638a;
                    j(i3, fVar);
                }
            } finally {
            }
        }
        if (fVar != null) {
            cVar.a(fVar);
        }
    }

    public final void m() {
        synchronized (this.f9559a) {
            if (this.f9566j != null) {
                this.f9564g.unbindService(this.f9566j);
                this.f9565i = null;
                this.f9566j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a10 = hVar.a();
            long j10 = 30000;
            int i3 = 1;
            long j11 = 30000;
            while (i3 <= 3) {
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
                f fVar = z.f9643g;
                TimeUnit.MILLISECONDS.getClass();
                int i10 = fVar.f9593a;
                if (i10 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i10);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i10);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                j11 = j10 - timeUnit.convert((hVar.a() - a10) + 0, timeUnit2);
                long j12 = j10;
                long pow = ((long) Math.pow(2.0d, i3 - 1)) * 1000;
                if (j11 < pow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i3 < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j11 = j12 - timeUnit.convert((hVar.a() - a10) + 0, timeUnit2);
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                    }
                }
                i3++;
                j10 = j12;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
            return o();
        }
        throw new NullPointerException("ticker");
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f9559a) {
            try {
                z10 = false;
                if (this.f9560b == 2 && this.f9565i != null && this.f9566j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f9562e;
        }
        return new Handler(Looper.myLooper());
    }

    public final kg s(f fVar, int i3, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i3, 7, fVar, x.a(exc));
        return new kg(fVar.f9593a, fVar.f9595c, new ArrayList(), new ArrayList());
    }

    public final f t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s6 = i3.s();
        s6.c();
        i3.r((i3) s6.f7524b, 6);
        c4 r5 = d4.r();
        r5.c();
        d4.q((d4) r5.f7524b);
        r5.d(false);
        r5.e();
        s6.c();
        i3.q((i3) s6.f7524b, (d4) r5.a());
        i((i3) s6.a());
        return z.f9643g;
    }

    public final f u() {
        int[] iArr = {0, 3};
        synchronized (this.f9559a) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.f9560b == iArr[i3]) {
                    return z.h;
                }
            }
            return z.f9642f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f9564g.getPackageName();
    }

    public final p4.q x(f fVar, int i3, String str, Exception exc) {
        A(i3, 9, fVar, x.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new p4.q(fVar, null, false);
    }

    public final void y(int i3, int i10, f fVar) {
        try {
            int i11 = x.f9636a;
            h(x.b(i3, i10, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i3, f fVar, long j10) {
        try {
            int i10 = x.f9636a;
            this.h.G(x.b(i3, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f9568l, j10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(nb.a aVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7421a;
        this.f9561c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f9564g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f7524b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f7524b, w10);
        }
        String packageName = this.f9564g.getPackageName();
        x10.c();
        p3.t((p3) x10.f7524b, packageName);
        x10.c();
        p3.q((p3) x10.f7524b, nextLong);
        x10.c();
        p3.u((p3) x10.f7524b);
        int i3 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f7524b, i3);
        x10.d();
        try {
            int i10 = this.f9564g.getPackageManager().getPackageInfo(this.f9564g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f7524b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new tf.b(this.f9564g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f9563f = new e(this.f9564g, null, this.h);
        this.f9579x = aVar;
        this.f9564g.getPackageName();
    }
}
