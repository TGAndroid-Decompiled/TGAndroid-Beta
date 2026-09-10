package c5;

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
import org.telegram.messenger.BillingController;
import v7.z5;
public final class d0 extends c {
    public final Context C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile a9.d F;
    public volatile ScheduledExecutorService G;

    public d0(ob.a aVar, Context context, androidx.emoji2.text.f fVar) {
        super(aVar, context, fVar);
        this.D = 0;
        this.C = context;
    }

    public final t0 E(int i10) {
        if (!J()) {
            com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service is not ready.");
            F(94, 28, g0.a(-1, "Billing Override Service connection is disconnected."));
            return new r0(0);
        }
        b0 b0Var = new b0(this, i10, 0);
        ?? obj = new Object();
        obj.f5576c = new Object();
        j4 j4Var = new j4(obj);
        obj.f5575b = j4Var;
        obj.f5574a = b0.class;
        try {
            b0Var.j(obj);
            obj.f5574a = "billingOverrideService.getBillingOverride";
            return j4Var;
        } catch (Exception e) {
            g2 g2Var = new g2(e);
            z5 z5Var = g4.f5563f;
            i4 i4Var = j4Var.f5594b;
            if (z5Var.d(i4Var, null, g2Var)) {
                g4.d(i4Var);
            }
            return j4Var;
        }
    }

    public final void F(int i10, int i11, h hVar) {
        int i12 = e0.f4287a;
        g3 b10 = e0.b(i10, i11, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.h.B(b10);
    }

    public final void G(int i10, q0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        t0 E = E(i10);
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
            obj.f5678n = E;
            ?? obj2 = new Object();
            obj2.f5669a = obj;
            obj.f5679r = scheduledExecutorService.schedule((Runnable) obj2, 28500L, timeUnit);
            E.b(obj2, p0.f5635a);
            E = obj;
        }
        ?? obj3 = new Object();
        obj3.f11801a = i10;
        obj3.f11802b = aVar;
        obj3.f11803c = runnable;
        obj3.d = this;
        E.b(new q0(E, obj3), e());
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
    public final void a(final i iVar, final j jVar) {
        G(4, new q0.a() {
            @Override
            public final void accept(Object obj) {
                String str = iVar.f4314a;
                jVar.a((h) obj, str);
            }
        }, new v(this, iVar, jVar));
    }

    @Override
    public final h b(Activity activity, g gVar) {
        int i10 = 0;
        try {
            i10 = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            F(102, 28, g0.f4307p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e7) {
            if (e7 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(95, 28, g0.f4307p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
        }
        if (i10 > 0) {
            h a2 = g0.a(i10, "Billing override value was set by a license tester.");
            F(93, 2, a2);
            D(a2);
            return a2;
        }
        try {
            return super.b(activity, gVar);
        } catch (Exception e10) {
            h hVar = g0.f4298f;
            F(103, 2, hVar);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An internal error occurred.", e10);
            return hVar;
        }
    }

    @Override
    public final void c(xa.c cVar, org.telegram.messenger.c0 c0Var) {
        G(7, new z(c0Var, 0), new v(this, cVar, c0Var, 1));
    }

    @Override
    public final void d(BillingController billingController) {
        synchronized (this) {
            if (J()) {
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i10 = e0.f4287a;
                i3 c10 = e0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                n4.y yVar = this.h;
                yVar.getClass();
                yVar.N(c10, (p3) yVar.f13824b);
            } else {
                int i11 = 1;
                if (this.D == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    F(38, 26, g0.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.D = 1;
                    com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new a9.d(this, 1);
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
                            i11 = 39;
                        }
                    } else {
                        i11 = 41;
                    }
                    this.D = 0;
                    com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    F(i11, 26, g0.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        l(billingController);
    }

    public d0(ob.a aVar, Context context, q qVar, androidx.emoji2.text.f fVar) {
        super(aVar, context, qVar, fVar);
        this.D = 0;
        this.C = context;
    }
}
