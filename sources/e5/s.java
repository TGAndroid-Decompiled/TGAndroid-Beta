package e5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b8.dg;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.concurrent.TimeUnit;
public final class s implements ServiceConnection {
    public final c f9627a;
    public final com.google.android.gms.internal.play_billing.m f9628b;
    public final com.google.android.gms.internal.play_billing.m f9629c;
    public final b d;

    public s(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f9628b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f9629c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f9627a = cVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f9628b;
            if (mVar.f7456b) {
                long a10 = mVar.f7455a.a();
                if (mVar.f7456b) {
                    mVar.f7456b = false;
                    long j10 = (a10 - mVar.d) + mVar.f7457c;
                    mVar.f7457c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f9629c;
        if (mVar2.f7456b) {
            long a11 = mVar2.f7455a.a();
            if (mVar2.f7456b) {
                mVar2.f7456b = false;
                long j11 = (a11 - mVar2.d) + mVar2.f7457c;
                mVar2.f7457c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(f fVar, int i3, String str, boolean z10) {
        try {
            j3 s6 = k3.s();
            int i10 = fVar.f9593a;
            s6.c();
            k3.r((k3) s6.f7524b, i10);
            String str2 = fVar.f9595c;
            s6.c();
            k3.o((k3) s6.f7524b, str2);
            s6.c();
            k3.q((k3) s6.f7524b, i3);
            if (str != null) {
                s6.c();
                k3.n((k3) s6.f7524b, str);
            }
            Long a10 = a(z10);
            b bVar = this.d;
            if (z10) {
                c4 r5 = d4.r();
                r5.d(false);
                r5.e();
                if (a10 != null) {
                    long longValue = a10.longValue();
                    r5.c();
                    d4.p((d4) r5.f7524b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s6);
                u10.c();
                g3.t((g3) u10.f7524b, 6);
                u10.e(r5);
                bVar.h((g3) u10.a());
                return;
            }
            z3 p10 = a4.p();
            p10.c();
            a4.n((a4) p10.f7524b, (k3) s6.a());
            if (a10 != null) {
                long longValue2 = a10.longValue();
                p10.c();
                a4.o((a4) p10.f7524b, longValue2);
            }
            bVar.h.K((a4) p10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(f fVar) {
        b bVar = this.d;
        synchronized (bVar.f9559a) {
            try {
                if (bVar.f9560b == 3) {
                    return;
                }
                try {
                    this.f9627a.a(fVar);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                tf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7524b, 6);
                j3 s6 = k3.s();
                s6.c();
                k3.q((k3) s6.f7524b, 110);
                u10.d(s6);
                c4 r5 = d4.r();
                r5.d(false);
                r5.e();
                u10.e(r5);
                bVar2.F((g3) u10.a());
            } else {
                bVar.h.J(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar3 = this.d;
        synchronized (bVar3.f9559a) {
            if (bVar3.f9560b != 3 && bVar3.f9560b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.f9627a.b();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service connected.");
        b bVar = this.d;
        synchronized (bVar.f9559a) {
            try {
                if (bVar.f9560b == 3) {
                    return;
                }
                int i3 = com.google.android.gms.internal.play_billing.b.f7359b;
                if (iBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        aVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        aVar = new b8.a(iBinder, "com.android.vending.billing.IInAppBillingService", 3);
                    }
                }
                bVar.f9565i = aVar;
                if (b.f(new dg(this, 1), 30000L, new a3.o(this, 19), bVar.r(), bVar.e()) == null) {
                    f u10 = bVar.u();
                    bVar.j(25, u10);
                    c(u10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                tf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7524b, 6);
                j3 s6 = k3.s();
                s6.c();
                k3.q((k3) s6.f7524b, 109);
                u10.d(s6);
                c4 r5 = d4.r();
                r5.d(false);
                r5.e();
                u10.e(r5);
                bVar2.F((g3) u10.a());
            } else {
                bVar.h.L(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f9629c;
        mVar.f7457c = 0L;
        mVar.f7456b = false;
        mVar.a();
        b bVar3 = this.d;
        synchronized (bVar3.f9559a) {
            try {
                if (bVar3.f9560b != 3) {
                    bVar3.k(0);
                    try {
                        this.f9627a.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
