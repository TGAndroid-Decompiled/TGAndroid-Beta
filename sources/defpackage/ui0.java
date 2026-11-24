package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class ui0 {
    public final Long A;
    public final ocd B;
    public final String c;
    public final String d;
    public volatile ej0 f;
    public final Context g;
    public final rhb h;
    public volatile gad i;
    public volatile wed j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final f8e x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public ui0(f8e f8eVar, Context context, cj0 cj0Var, sk skVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = cdd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        cne x = nne.x();
        x.b();
        nne.v((nne) x.b);
        if (v != null) {
            x.b();
            nne.w((nne) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        nne.t((nne) x.b, packageName);
        x.b();
        nne.q((nne) x.b, nextLong);
        x.b();
        nne.u((nne) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        nne.n((nne) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            nne.o((nne) x.b, i2);
        } catch (Throwable th) {
            yid.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new rhb(this.g, (nne) x.a());
        if (cj0Var == null) {
            yid.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new ej0(this.g, cj0Var, this.h);
        this.x = f8eVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new tnd(submit, runnable, (byte) 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            yid.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(ui0 ui0Var, int i) {
        ej0 ej0Var;
        if (i == 0) {
            synchronized (ui0Var.a) {
                if (ui0Var.b == 3) {
                    return;
                }
                ui0Var.k(2);
                if (ui0Var.f != null) {
                    ej0Var = ui0Var.f;
                } else {
                    ej0Var = null;
                }
                if (ej0Var != null) {
                    boolean z = ui0Var.u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    ej0Var.b = z;
                    Context context = (Context) ej0Var.a;
                    ((idf) ej0Var.f).a(context, intentFilter2);
                    boolean z2 = ej0Var.b;
                    idf idfVar = (idf) ej0Var.e;
                    if (z2) {
                        idfVar.b(context, intentFilter);
                        return;
                    } else {
                        idfVar.a(context, intentFilter);
                        return;
                    }
                }
                return;
            }
        }
        ui0Var.k(0);
    }

    public static boolean q(ui0 ui0Var) {
        boolean z;
        synchronized (ui0Var.a) {
            z = true;
            if (ui0Var.b != 1) {
                z = false;
            }
        }
        return z;
    }

    public static String v() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i, fj0 fj0Var, long j, boolean z) {
        try {
            int i2 = ald.a;
            this.h.y(ald.b(i, 2, fj0Var, null, fme.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void B(int i, fj0 fj0Var, String str, long j, boolean z) {
        try {
            int i2 = ald.a;
            this.h.y(ald.b(i, 2, fj0Var, str, fme.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void C(fj0 fj0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new us4(this, fj0Var, (byte) 16));
    }

    public void a(du2 du2Var, eu2 eu2Var) {
        if (f(new r6d(this, eu2Var, du2Var, (byte) 1), 30000L, new us4(this, eu2Var, du2Var), r(), e()) == null) {
            fj0 u = u();
            x(25, 4, u);
            eu2Var.e(u);
        }
    }

    public defpackage.fj0 b(android.app.Activity r30, final defpackage.ej0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui0.b(android.app.Activity, ej0):fj0");
    }

    public void c(oo8 oo8Var, xg0 xg0Var) {
        if (f(new r6d(this, xg0Var, oo8Var, (byte) 2), 30000L, new tnd(this, xg0Var, (byte) 15), r(), e()) == null) {
            fj0 u = u();
            x(25, 7, u);
            tgd tgdVar = fhd.b;
            ((bj0) xg0Var.b).b(u, ojd.e);
        }
    }

    public void d(cj0 cj0Var) {
        l(cj0Var);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        executorService = this.z;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(yid.a, new op7(this));
            this.z = executorService;
        }
        return executorService;
    }

    public final void g(eu2 eu2Var, String str, fj0 fj0Var, int i, String str2, Exception exc) {
        yid.i("BillingClient", str2, exc);
        z(i, 4, fj0Var, ald.a(exc));
        eu2Var.e(fj0Var);
    }

    public final void h(gje gjeVar) {
        try {
            rhb rhbVar = this.h;
            int i = this.l;
            rhbVar.getClass();
            cne cneVar = (cne) ((nne) rhbVar.b).g();
            cneVar.b();
            nne.p((nne) cneVar.b, i);
            rhbVar.b = (nne) cneVar.a();
            rhbVar.v(gjeVar);
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void i(gke gkeVar) {
        try {
            rhb rhbVar = this.h;
            int i = this.l;
            rhbVar.getClass();
            cne cneVar = (cne) ((nne) rhbVar.b).g();
            cneVar.b();
            nne.p((nne) cneVar.b, i);
            nne nneVar = (nne) cneVar.a();
            rhbVar.b = nneVar;
            rhbVar.L(gkeVar, nneVar);
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void j(int i, fj0 fj0Var) {
        try {
            int i2 = ald.a;
            uie uieVar = (uie) ald.b(i, 6, fj0Var, null, fme.BROADCAST_ACTION_UNSPECIFIED).g();
            yse r = gte.r();
            r.c(false);
            r.d();
            uieVar.d(r);
            h((gje) uieVar.a());
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void k(int i) {
        String str;
        String str2;
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            byte b = this.b;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
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
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
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
            yid.g("BillingClient", "Setting clientState from " + str + " to " + str2);
            this.b = i;
        }
    }

    public final void l(vi0 vi0Var) {
        int i;
        fj0 fj0Var;
        fj0 fj0Var2;
        synchronized (this.a) {
            if (o()) {
                fj0Var = t();
            } else {
                if (this.b == 1) {
                    yid.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fj0Var2 = sld.c;
                    j(37, fj0Var2);
                } else if (this.b == 3) {
                    yid.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fj0Var2 = sld.h;
                    j(38, fj0Var2);
                } else {
                    k(1);
                    m();
                    yid.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new wed(this, vi0Var);
                    ifd ifdVar = this.j.b;
                    ifdVar.c = 0L;
                    ifdVar.b = false;
                    ifdVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        fj0Var = t();
                                    } else if (this.b != 1) {
                                        yid.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        fj0Var2 = sld.h;
                                        j(105, fj0Var2);
                                    } else {
                                        wed wedVar = this.j;
                                        if (this.g.bindService(intent2, wedVar, 1)) {
                                            yid.g("BillingClient", "Service was bonded successfully.");
                                            fj0Var = null;
                                        } else {
                                            yid.h("BillingClient", "Connection to Billing service is blocked.");
                                            i = 39;
                                        }
                                    }
                                }
                            } else {
                                yid.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            yid.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    } else {
                        i = 41;
                    }
                    k(0);
                    yid.g("BillingClient", "Billing service unavailable on device.");
                    fj0 fj0Var3 = sld.a;
                    j(i, fj0Var3);
                    fj0Var = fj0Var3;
                }
                fj0Var = fj0Var2;
            }
        }
        if (fj0Var != null) {
            vi0Var.a(fj0Var);
        }
    }

    public final void m() {
        synchronized (this.a) {
            if (this.j != null) {
                this.g.unbindService(this.j);
                this.i = null;
                this.j = null;
            }
        }
    }

    public final boolean n() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ocd ocdVar = this.B;
        if (ocdVar != null) {
            long a = ocdVar.a();
            long j = 30000;
            int i = 1;
            long j2 = 30000;
            while (i <= 3) {
                try {
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    yid.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (Math.max(0L, j2) <= 0) {
                    yid.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                yid.g("BillingClient", "Already connected or not opted into auto reconnection.");
                fj0 fj0Var = sld.g;
                timeUnit.getClass();
                int i2 = fj0Var.a;
                if (i2 == 0) {
                    yid.g("BillingClient", "Reconnection succeeded with result: " + i2);
                    return o();
                }
                yid.h("BillingClient", "Reconnection failed with result: " + i2);
                j2 = j - (((ocdVar.a() - a) + 0) / 1000000);
                long j3 = j;
                long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (j2 < pow) {
                    yid.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j2 = j3 - (((ocdVar.a() - a) + 0) / 1000000);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        yid.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                    }
                }
                i++;
                j = j3;
            }
            yid.h("BillingClient", "Max retries reached.");
            return o();
        }
        gxc.d("ticker");
        return false;
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b == 2 && this.i != null && this.j != null) {
                z = true;
            }
        }
        return z;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.e;
        }
        return new Handler(Looper.myLooper());
    }

    public final kq s(fj0 fj0Var, int i, String str, Exception exc) {
        yid.i("BillingClient", str, exc);
        z(i, 7, fj0Var, ald.a(exc));
        return new kq(fj0Var.a, fj0Var.c, new ArrayList(), new ArrayList());
    }

    public final fj0 t() {
        yid.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        oje s = gke.s();
        s.b();
        gke.r((gke) s.b, 6);
        yse r = gte.r();
        r.b();
        gte.q((gte) r.b);
        r.c(false);
        r.d();
        s.b();
        gke.q((gke) s.b, (gte) r.a());
        i((gke) s.a());
        return sld.g;
    }

    public final fj0 u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return sld.h;
                }
            }
            return sld.f;
        }
    }

    public final rhb w(fj0 fj0Var, int i, String str, Exception exc) {
        z(i, 9, fj0Var, ald.a(exc));
        yid.i("BillingClient", str, exc);
        return new rhb(fj0Var, null, (byte) 16);
    }

    public final void x(int i, int i2, fj0 fj0Var) {
        try {
            int i3 = ald.a;
            h(ald.b(i, i2, fj0Var, null, fme.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(int i, fj0 fj0Var, long j) {
        try {
            int i2 = ald.a;
            this.h.w(ald.b(i, 2, fj0Var, null, fme.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(int i, int i2, fj0 fj0Var, String str) {
        try {
            int i3 = ald.a;
            h(ald.b(i, i2, fj0Var, str, fme.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public ui0(f8e f8eVar, Context context, sk skVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = cdd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        cne x = nne.x();
        x.b();
        nne.v((nne) x.b);
        if (v != null) {
            x.b();
            nne.w((nne) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        nne.t((nne) x.b, packageName);
        x.b();
        nne.q((nne) x.b, nextLong);
        x.b();
        nne.u((nne) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        nne.n((nne) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            nne.o((nne) x.b, i2);
        } catch (Throwable th) {
            yid.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new rhb(this.g, (nne) x.a());
        yid.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new ej0(this.g, null, this.h);
        this.x = f8eVar;
        this.g.getPackageName();
    }
}
