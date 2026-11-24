package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public final class lid extends uh0 {
    public final Context C;
    public volatile byte D;
    public volatile z9d E;
    public volatile b5a F;
    public volatile ScheduledExecutorService G;

    public lid(c6e c6eVar, Context context, sj sjVar) {
        super(c6eVar, context, sjVar);
        this.D = (byte) 0;
        this.C = context;
    }

    public static void G(lid lidVar, ss2 ss2Var, ts2 ts2Var) {
        super.a(ss2Var, ts2Var);
    }

    public static void H(lid lidVar, z24 z24Var, sg0 sg0Var) {
        super.c(z24Var, sg0Var);
    }

    public final ymd D(int i) {
        if (!I()) {
            xgd.h("BillingClientTesting", "Billing Override Service is not ready.");
            E(94, 28, qjd.a(-1, "Billing Override Service connection is disconnected."));
            return new nmd(0);
        }
        ?? obj = new Object();
        obj.b = this;
        obj.a = i;
        ?? obj2 = new Object();
        obj2.c = new Object();
        ief iefVar = new ief(obj2);
        obj2.b = iefVar;
        obj2.a = nfd.class;
        try {
            obj.a(obj2);
            obj2.a = "billingOverrideService.getBillingOverride";
            return iefVar;
        } catch (Exception e) {
            z5e z5eVar = new z5e(e);
            e1f e1fVar = y4f.f;
            ucf ucfVar = iefVar.b;
            if (e1fVar.d(ucfVar, null, z5eVar)) {
                y4f.d(ucfVar);
            }
            return iefVar;
        }
    }

    public final void E(int i, int i2, fi0 fi0Var) {
        int i3 = yid.a;
        fhe b = yid.b(i, i2, fi0Var, null, dke.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b, "ApiFailure should not be null");
        this.h.i(b);
    }

    public final void F(int i, vs2 vs2Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        ymd D = D(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (this.G == null) {
                this.G = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = this.G;
        }
        if (!D.isDone()) {
            ?? obj = new Object();
            obj.n = D;
            xia xiaVar = new xia();
            xiaVar.b = obj;
            obj.r = scheduledExecutorService.schedule(xiaVar, 28500L, timeUnit);
            D.c(xiaVar, ald.a);
            D = obj;
        }
        nu7 nu7Var = new nu7(this, i, vs2Var, runnable);
        D.c(new rld(D, nu7Var, (byte) 0), e());
    }

    public final synchronized boolean I() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(ss2 ss2Var, ts2 ts2Var) {
        F(4, new tl4(ss2Var, ts2Var), new ey1(this, ss2Var, ts2Var, false, (byte) 8));
    }

    @Override
    public final fi0 b(Activity activity, ei0 ei0Var) {
        int i = 0;
        try {
            i = ((Integer) D(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            E(102, 28, qjd.p);
            xgd.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            E(95, 28, qjd.p);
            xgd.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (i > 0) {
            fi0 a = qjd.a(i, "Billing override value was set by a license tester.");
            E(93, 2, a);
            C(a);
            return a;
        }
        try {
            return super.b(activity, ei0Var);
        } catch (Exception e3) {
            fi0 fi0Var = qjd.f;
            E(103, 2, fi0Var);
            xgd.i("BillingClientTesting", "An internal error occurred.", e3);
            return fi0Var;
        }
    }

    @Override
    public final void c(z24 z24Var, sg0 sg0Var) {
        F(7, new tl4(sg0Var, (byte) 2), new ey1(this, z24Var, sg0Var, false, (byte) 7));
    }

    @Override
    public final void d(ci0 ci0Var) {
        synchronized (this) {
            if (I()) {
                xgd.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i = yid.a;
                fie c = yid.c(26, dke.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                aec aecVar = this.h;
                aecVar.getClass();
                aecVar.t(c, (lle) aecVar.b);
            } else {
                int i2 = 1;
                if (this.D == 1) {
                    xgd.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    xgd.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    E(38, 26, qjd.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.D = (byte) 1;
                    xgd.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new b5a(this, (byte) 2);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.C;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.F, 1)) {
                                    xgd.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    xgd.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            } else {
                                xgd.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            }
                            i2 = 39;
                        }
                    } else {
                        i2 = 41;
                    }
                    this.D = (byte) 0;
                    xgd.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    E(i2, 26, qjd.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        l(ci0Var);
    }

    public lid(c6e c6eVar, Context context, ci0 ci0Var, sj sjVar) {
        super(c6eVar, context, ci0Var, sjVar);
        this.D = (byte) 0;
        this.C = context;
    }
}
