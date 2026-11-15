package f5;

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
    public final String f10943c;
    public final String d;
    public volatile e f10945f;
    public final Context f10946g;
    public final wf.b h;
    public volatile com.google.android.gms.internal.play_billing.c f10947i;
    public volatile t f10948j;
    public boolean f10949k;
    public boolean f10951m;
    public boolean f10952n;
    public boolean f10953o;
    public boolean f10954p;
    public boolean f10955q;
    public boolean f10956r;
    public boolean f10957s;
    public boolean f10958t;
    public boolean f10959u;
    public boolean v;
    public boolean f10960w;
    public final w7.s f10961x;
    public final boolean f10962y;
    public ExecutorService f10963z;
    public final Object f10941a = new Object();
    public volatile int f10942b = 0;
    public final Handler f10944e = new Handler(Looper.getMainLooper());
    public int f10950l = 0;

    public b(w7.s sVar, Context context, o oVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f6753a;
        this.f10943c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f10946g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f6856b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f6856b, w10);
        }
        String packageName = this.f10946g.getPackageName();
        x10.c();
        p3.t((p3) x10.f6856b, packageName);
        x10.c();
        p3.q((p3) x10.f6856b, nextLong);
        x10.c();
        p3.u((p3) x10.f6856b);
        int i7 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f6856b, i7);
        x10.d();
        try {
            int i10 = this.f10946g.getPackageManager().getPackageInfo(this.f10946g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f6856b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new wf.b(this.f10946g, (p3) x10.a());
        if (oVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10945f = new e(this.f10946g, oVar, this.h);
        this.f10961x = sVar;
        this.f10962y = false;
        this.f10946g.getPackageName();
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
            synchronized (bVar.f10941a) {
                try {
                    if (bVar.f10942b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f10945f != null) {
                        eVar = bVar.f10945f;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        boolean z10 = bVar.f10959u;
                        b0 b0Var = (b0) eVar.f10976e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        eVar.f10973a = z10;
                        Context context = (Context) eVar.f10974b;
                        ((b0) eVar.f10977f).a(context, intentFilter2);
                        if (eVar.f10973a) {
                            b0Var.b(context, intentFilter);
                            return;
                        } else {
                            b0Var.a(context, intentFilter);
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
        synchronized (bVar.f10941a) {
            z10 = true;
            if (bVar.f10942b != 1) {
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

    public final void A(int i7, int i10, f fVar, String str) {
        try {
            int i11 = y.f11021a;
            h(y.b(i7, i10, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i7, f fVar, long j3, boolean z10) {
        try {
            int i10 = y.f11021a;
            this.h.Z(y.b(i7, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f10950l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i7, f fVar, String str, long j3, boolean z10) {
        try {
            int i10 = y.f11021a;
            this.h.Z(y.b(i7, 2, fVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f10950l, j3, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f10944e.post(new m9.u(13, this, fVar));
    }

    public void a(g gVar, h hVar) {
        if (f(new r(this, hVar, gVar, 0), 30000L, new m9.u(this, hVar, gVar), r(), e()) == null) {
            f u10 = u();
            y(25, 4, u10);
            hVar.a(u10);
        }
    }

    public f5.f b(android.app.Activity r32, final f5.e r33) {
        throw new UnsupportedOperationException("Method not decompiled: f5.b.b(android.app.Activity, f5.e):f5.f");
    }

    public void c(cb.c cVar, j1 j1Var) {
        if (f(new r(this, j1Var, cVar, 1), 30000L, new m9.u(16, this, j1Var), r(), e()) == null) {
            f u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f6831b;
            ((q1) j1Var.f24500b).a(u10, com.google.android.gms.internal.play_billing.v.f6858e);
        }
    }

    public void d(r1 r1Var) {
        l(r1Var);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f10963z == null) {
                this.f10963z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f6853a, new s(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f10963z;
    }

    public final void g(h hVar, String str, f fVar, int i7, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i7, 4, fVar, y.a(exc));
        hVar.a(fVar);
    }

    public final void h(g3 g3Var) {
        try {
            wf.b bVar = this.h;
            int i7 = this.f10950l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f59107b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6856b, i7);
            bVar.f59107b = (p3) o3Var.a();
            bVar.W(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            wf.b bVar = this.h;
            int i7 = this.f10950l;
            bVar.getClass();
            o3 o3Var = (o3) ((p3) bVar.f59107b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6856b, i7);
            p3 p3Var = (p3) o3Var.a();
            bVar.f59107b = p3Var;
            bVar.e0(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i7, f fVar) {
        try {
            int i10 = y.f11021a;
            f3 f3Var = (f3) y.b(i7, 6, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
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
        synchronized (this.f10941a) {
            try {
                if (this.f10942b == 3) {
                    return;
                }
                int i10 = this.f10942b;
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
                this.f10942b = i7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i7;
        f fVar;
        synchronized (this.f10941a) {
            try {
                if (o()) {
                    fVar = t();
                } else if (this.f10942b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fVar = a0.f10929c;
                    j(37, fVar);
                } else if (this.f10942b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fVar = a0.h;
                    j(38, fVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f10948j = new t(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f10948j.f11013b;
                    mVar.f6789c = 0L;
                    mVar.f6788b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f10946g.getPackageManager().queryIntentServices(intent, 0);
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
                                intent2.putExtra("playBillingLibraryVersion", this.f10943c);
                                synchronized (this.f10941a) {
                                    try {
                                        if (this.f10942b == 2) {
                                            fVar = t();
                                        } else if (this.f10942b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            fVar = a0.h;
                                            j(105, fVar);
                                        } else {
                                            t tVar = this.f10948j;
                                            if (this.f10946g.bindService(intent2, tVar, 1)) {
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
                    fVar = a0.f10927a;
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
        synchronized (this.f10941a) {
            if (this.f10948j != null) {
                this.f10946g.unbindService(this.f10948j);
                this.f10947i = null;
                this.f10948j = null;
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
                f fVar = a0.f10932g;
                TimeUnit.MILLISECONDS.getClass();
                int i10 = fVar.f10978a;
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
        synchronized (this.f10941a) {
            try {
                z10 = false;
                if (this.f10942b == 2 && this.f10947i != null && this.f10948j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f10944e;
        }
        return new Handler(Looper.myLooper());
    }

    public final xa s(f fVar, int i7, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i7, 7, fVar, y.a(exc));
        return new xa(fVar.f10978a, fVar.f10980c, new ArrayList(), new ArrayList());
    }

    public final f t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s5 = i3.s();
        s5.c();
        i3.r((i3) s5.f6856b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f6856b);
        r10.d(false);
        r10.e();
        s5.c();
        i3.q((i3) s5.f6856b, (d4) r10.a());
        i((i3) s5.a());
        return a0.f10932g;
    }

    public final f u() {
        int[] iArr = {0, 3};
        synchronized (this.f10941a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f10942b == iArr[i7]) {
                    return a0.h;
                }
            }
            return a0.f10931f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f10946g.getPackageName();
    }

    public final q4.q x(f fVar, int i7, String str, Exception exc) {
        A(i7, 9, fVar, y.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new q4.q(19, fVar, (Object) null);
    }

    public final void y(int i7, int i10, f fVar) {
        try {
            int i11 = y.f11021a;
            h(y.b(i7, i10, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i7, f fVar, long j3) {
        try {
            int i10 = y.f11021a;
            this.h.X(y.b(i7, 2, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f10950l, j3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(w7.s sVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f6753a;
        this.f10943c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f10946g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f6856b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f6856b, w10);
        }
        String packageName = this.f10946g.getPackageName();
        x10.c();
        p3.t((p3) x10.f6856b, packageName);
        x10.c();
        p3.q((p3) x10.f6856b, nextLong);
        x10.c();
        p3.u((p3) x10.f6856b);
        int i7 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f6856b, i7);
        x10.d();
        try {
            int i10 = this.f10946g.getPackageManager().getPackageInfo(this.f10946g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f6856b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new wf.b(this.f10946g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f10945f = new e(this.f10946g, null, this.h);
        this.f10961x = sVar;
        this.f10946g.getPackageName();
    }
}
