package d5;

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
    public final String f7933c;
    public final String d;
    public volatile h f7934f;
    public final Context f7935g;
    public final rf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f7936i;
    public volatile w f7937j;
    public boolean f7938k;
    public boolean f7940m;
    public boolean f7941n;
    public boolean f7942o;
    public boolean f7943p;
    public boolean f7944q;
    public boolean f7945r;
    public boolean f7946s;
    public boolean f7947t;
    public boolean f7948u;
    public boolean v;
    public boolean f7949w;
    public final tb.a f7950x;
    public final boolean f7951y;
    public ExecutorService f7952z;
    public final Object f7931a = new Object();
    public volatile int f7932b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int f7939l = 0;

    public c(tb.a aVar, Context context, q qVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7238a;
        this.f7933c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f7935g = context.getApplicationContext();
        o3 x9 = p3.x();
        x9.c();
        p3.v((p3) x9.f7332b);
        if (w10 != null) {
            x9.c();
            p3.w((p3) x9.f7332b, w10);
        }
        String packageName = this.f7935g.getPackageName();
        x9.c();
        p3.t((p3) x9.f7332b, packageName);
        x9.c();
        p3.q((p3) x9.f7332b, nextLong);
        x9.c();
        p3.u((p3) x9.f7332b);
        int i10 = Build.VERSION.SDK_INT;
        x9.c();
        p3.n((p3) x9.f7332b, i10);
        x9.d();
        try {
            int i11 = this.f7935g.getPackageManager().getPackageInfo(this.f7935g.getPackageName(), 0).versionCode;
            x9.c();
            p3.o((p3) x9.f7332b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new rf.b(this.f7935g, (p3) x9.a());
        if (qVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f7934f = new h(this.f7935g, qVar, this.h);
        this.f7950x = aVar;
        this.f7951y = false;
        this.f7935g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new k9.u(5, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(c cVar, int i10) {
        h hVar;
        if (i10 == 0) {
            synchronized (cVar.f7931a) {
                try {
                    if (cVar.f7932b == 3) {
                        return;
                    }
                    cVar.k(2);
                    if (cVar.f7934f != null) {
                        hVar = cVar.f7934f;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        boolean z10 = cVar.f7948u;
                        f0 f0Var = (f0) hVar.e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        hVar.f7981a = z10;
                        Context context = (Context) hVar.f7982b;
                        ((f0) hVar.f7984f).a(context, intentFilter2);
                        if (hVar.f7981a) {
                            f0Var.b(context, intentFilter);
                            return;
                        } else {
                            f0Var.a(context, intentFilter);
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
        synchronized (cVar.f7931a) {
            z10 = true;
            if (cVar.f7932b != 1) {
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
            int i12 = c0.f7953a;
            h(c0.b(i10, i11, iVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, i iVar, long j10, boolean z10) {
        try {
            int i11 = c0.f7953a;
            this.h.W(c0.b(i10, 2, iVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f7939l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, i iVar, String str, long j10, boolean z10) {
        try {
            int i11 = c0.f7953a;
            this.h.W(c0.b(i10, 2, iVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f7939l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(i iVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new k9.u(4, this, iVar));
    }

    @Override
    public void a(j jVar, k kVar) {
        if (f(new u(this, kVar, jVar, 0), 30000L, new q1(this, kVar, jVar, false, 1), r(), e()) == null) {
            i u10 = u();
            y(25, 4, u10);
            kVar.a(u10, jVar.f7988a);
        }
    }

    @Override
    public d5.i b(android.app.Activity r32, final d5.h r33) {
        throw new UnsupportedOperationException("Method not decompiled: d5.c.b(android.app.Activity, d5.h):d5.i");
    }

    @Override
    public void c(a4.l lVar, org.telegram.messenger.g0 g0Var) {
        if (f(new u(this, g0Var, lVar, 1), 30000L, new k9.u(6, this, g0Var), r(), e()) == null) {
            i u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7309b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            g0Var.a(u10, new s(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f7952z == null) {
                this.f7952z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f7329a, new v(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7952z;
    }

    public final void g(k kVar, String str, i iVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, iVar, c0.a(exc));
        kVar.a(iVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            rf.b bVar = this.h;
            int i10 = this.f7939l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f47332b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7332b, i10);
            bVar.f47332b = (p3) o3Var.a();
            bVar.T(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            rf.b bVar = this.h;
            int i10 = this.f7939l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f47332b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7332b, i10);
            p3 p3Var = (p3) o3Var.a();
            bVar.f47332b = p3Var;
            bVar.b0(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, i iVar) {
        try {
            int i11 = c0.f7953a;
            f3 f3Var = (f3) c0.b(i10, 6, iVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r6 = d4.r();
            r6.d(false);
            r6.e();
            f3Var.e(r6);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i10) {
        String str;
        String str2;
        synchronized (this.f7931a) {
            try {
                if (this.f7932b == 3) {
                    return;
                }
                int i11 = this.f7932b;
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
                this.f7932b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(d dVar) {
        int i10;
        i iVar;
        synchronized (this.f7931a) {
            try {
                if (o()) {
                    iVar = t();
                } else if (this.f7932b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    iVar = e0.f7959c;
                    j(37, iVar);
                } else if (this.f7932b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    iVar = e0.h;
                    j(38, iVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f7937j = new w(this, dVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f7937j.f8019b;
                    mVar.f7272c = 0L;
                    mVar.f7271b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f7935g.getPackageManager().queryIntentServices(intent, 0);
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
                                intent2.putExtra("playBillingLibraryVersion", this.f7933c);
                                synchronized (this.f7931a) {
                                    try {
                                        if (this.f7932b == 2) {
                                            iVar = t();
                                        } else if (this.f7932b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            iVar = e0.h;
                                            j(105, iVar);
                                        } else {
                                            w wVar = this.f7937j;
                                            if (this.f7935g.bindService(intent2, wVar, 1)) {
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
                    iVar = e0.f7957a;
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
        synchronized (this.f7931a) {
            if (this.f7937j != null) {
                this.f7935g.unbindService(this.f7937j);
                this.f7936i = null;
                this.f7937j = null;
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
                i iVar = e0.f7961g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = iVar.f7985a;
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
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
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
        synchronized (this.f7931a) {
            try {
                z10 = false;
                if (this.f7932b == 2 && this.f7936i != null && this.f7937j != null) {
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

    public final k6.m s(i iVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, iVar, c0.a(exc));
        return new k6.m(iVar.f7985a, iVar.f7987c, new ArrayList(), new ArrayList());
    }

    public final i t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.f7332b, 6);
        c4 r6 = d4.r();
        r6.c();
        d4.q((d4) r6.f7332b);
        r6.d(false);
        r6.e();
        s10.c();
        i3.q((i3) s10.f7332b, (d4) r6.a());
        i((i3) s10.a());
        return e0.f7961g;
    }

    public final i u() {
        int[] iArr = {0, 3};
        synchronized (this.f7931a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f7932b == iArr[i10]) {
                    return e0.h;
                }
            }
            return e0.f7960f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f7935g.getPackageName();
    }

    public final n4.s x(i iVar, int i10, String str, Exception exc) {
        A(i10, 9, iVar, c0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.s(iVar, null, false, 12);
    }

    public final void y(int i10, int i11, i iVar) {
        try {
            int i12 = c0.f7953a;
            h(c0.b(i10, i11, iVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, i iVar, long j10) {
        try {
            int i11 = c0.f7953a;
            this.h.U(c0.b(i10, 2, iVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f7939l, j10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public c(tb.a aVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f7238a;
        this.f7933c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f7935g = context.getApplicationContext();
        o3 x9 = p3.x();
        x9.c();
        p3.v((p3) x9.f7332b);
        if (w10 != null) {
            x9.c();
            p3.w((p3) x9.f7332b, w10);
        }
        String packageName = this.f7935g.getPackageName();
        x9.c();
        p3.t((p3) x9.f7332b, packageName);
        x9.c();
        p3.q((p3) x9.f7332b, nextLong);
        x9.c();
        p3.u((p3) x9.f7332b);
        int i10 = Build.VERSION.SDK_INT;
        x9.c();
        p3.n((p3) x9.f7332b, i10);
        x9.d();
        try {
            int i11 = this.f7935g.getPackageManager().getPackageInfo(this.f7935g.getPackageName(), 0).versionCode;
            x9.c();
            p3.o((p3) x9.f7332b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new rf.b(this.f7935g, (p3) x9.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f7934f = new h(this.f7935g, null, this.h);
        this.f7950x = aVar;
        this.f7935g.getPackageName();
    }
}
