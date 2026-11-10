package f5;

import a8.g9;
import aa.c0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.j1;
import org.telegram.messenger.r1;
public final class w extends b {
    public final Context C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile ag.a F;
    public volatile ScheduledExecutorService G;

    public w(sa.d dVar, Context context, androidx.emoji2.text.f fVar) {
        super(dVar, context, fVar);
        this.D = 0;
        this.C = context;
    }

    public final t0 E(int i7) {
        if (!J()) {
            com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service is not ready.");
            F(94, 28, z.a(-1, "Billing Override Service connection is disconnected."));
            return new r0(0);
        }
        u uVar = new u(this, i7, 0);
        ?? obj = new Object();
        obj.f7368c = new Object();
        j4 j4Var = new j4(obj);
        obj.f7367b = j4Var;
        obj.f7366a = u.class;
        try {
            uVar.x(obj);
            obj.f7366a = "billingOverrideService.getBillingOverride";
            return j4Var;
        } catch (Exception e10) {
            g2 g2Var = new g2(e10);
            g9 g9Var = g4.f7354f;
            i4 i4Var = j4Var.f7387b;
            if (g9Var.d(i4Var, null, g2Var)) {
                g4.d(i4Var);
            }
            return j4Var;
        }
    }

    public final void F(int i7, int i10, f fVar) {
        int i11 = x.f11198a;
        g3 b10 = x.b(i7, i10, fVar, null, m3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.h.h(b10);
    }

    public final void G(int i7, q0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        t0 E = E(i7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!E.isDone()) {
            ?? obj = new Object();
            obj.f7480n = E;
            ?? obj2 = new Object();
            obj2.f7470a = obj;
            obj.f7481r = scheduledExecutorService.schedule((Runnable) obj2, 28500L, timeUnit);
            E.c(obj2, p0.f7432a);
            E = obj;
        }
        ?? obj3 = new Object();
        obj3.f19925a = i7;
        obj3.f19926b = aVar;
        obj3.f19927c = runnable;
        obj3.d = this;
        E.c(new q0(E, obj3), e());
    }

    public final synchronized boolean J() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(c0 c0Var, g gVar) {
        G(4, new t(c0Var, gVar), new a9.h(this, c0Var, gVar, 3));
    }

    @Override
    public final f b(Activity activity, e eVar) {
        int i7 = 0;
        try {
            i7 = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            F(102, 28, z.f11213p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(95, 28, z.f11213p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (i7 > 0) {
            f a10 = z.a(i7, "Billing override value was set by a license tester.");
            F(93, 2, a10);
            D(a10);
            return a10;
        }
        try {
            return super.b(activity, eVar);
        } catch (Exception e12) {
            f fVar = z.f11204f;
            F(103, 2, fVar);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An internal error occurred.", e12);
            return fVar;
        }
    }

    @Override
    public final void c(aa.n nVar, j1 j1Var) {
        G(7, new t(j1Var, 0), new a9.h(this, nVar, j1Var, 2));
    }

    @Override
    public final void d(r1 r1Var) {
        synchronized (this) {
            if (J()) {
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i7 = x.f11198a;
                i3 c10 = x.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                q4.q qVar = this.h;
                qVar.getClass();
                qVar.q(c10, (p3) qVar.f53815b);
            } else {
                int i10 = 1;
                if (this.D == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    F(38, 26, z.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.D = 1;
                    com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new ag.a(this, 2);
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
                                    com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            }
                            i10 = 39;
                        }
                    } else {
                        i10 = 41;
                    }
                    this.D = 0;
                    com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    F(i10, 26, z.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        l(r1Var);
    }

    public w(sa.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        super(dVar, context, nVar, fVar);
        this.D = 0;
        this.C = context;
    }
}
