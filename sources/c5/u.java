package c5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
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
public final class u implements ServiceConnection {
    public final c f3818a;
    public final com.google.android.gms.internal.play_billing.m f3819b;
    public final com.google.android.gms.internal.play_billing.m f3820c;
    public final b d;

    public u(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f3819b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f3820c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f3818a = cVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f3819b;
            if (mVar.f5153b) {
                long a2 = mVar.f5152a.a();
                if (mVar.f5153b) {
                    mVar.f5153b = false;
                    long j10 = (a2 - mVar.d) + mVar.f5154c;
                    mVar.f5154c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f3820c;
        if (mVar2.f5153b) {
            long a10 = mVar2.f5152a.a();
            if (mVar2.f5153b) {
                mVar2.f5153b = false;
                long j11 = (a10 - mVar2.d) + mVar2.f5154c;
                mVar2.f5154c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(g gVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i11 = gVar.f3785a;
            s10.c();
            k3.r((k3) s10.f5214b, i11);
            String str2 = gVar.f3787c;
            s10.c();
            k3.o((k3) s10.f5214b, str2);
            s10.c();
            k3.q((k3) s10.f5214b, i10);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.f5214b, str);
            }
            Long a2 = a(z10);
            b bVar = this.d;
            if (z10) {
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                if (a2 != null) {
                    long longValue = a2.longValue();
                    r10.c();
                    d4.p((d4) r10.f5214b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s10);
                u10.c();
                g3.t((g3) u10.f5214b, 6);
                u10.e(r10);
                bVar.h((g3) u10.a());
                return;
            }
            z3 p5 = a4.p();
            p5.c();
            a4.n((a4) p5.f5214b, (k3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p5.c();
                a4.o((a4) p5.f5214b, longValue2);
            }
            bVar.h.y0((a4) p5.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(g gVar) {
        b bVar = this.d;
        synchronized (bVar.f3734a) {
            try {
                if (bVar.f3735b == 3) {
                    return;
                }
                try {
                    this.f3818a.a(gVar);
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
                hf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f5214b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f5214b, 110);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.s0((g3) u10.a());
            } else {
                bVar.h.x0(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar3 = this.d;
        synchronized (bVar3.f3734a) {
            if (bVar3.f3735b != 3 && bVar3.f3735b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.f3818a.b();
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
        synchronized (bVar.f3734a) {
            try {
                if (bVar.f3735b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f5063b;
                if (iBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        aVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        aVar = new a9.a(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                    }
                }
                bVar.f3739i = aVar;
                if (b.f(new t(this, 0), 30000L, new androidx.activity.i(this, 10), bVar.r(), bVar.e()) == null) {
                    g u10 = bVar.u();
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
                hf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f5214b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f5214b, 109);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.s0((g3) u10.a());
            } else {
                bVar.h.z0(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f3820c;
        mVar.f5154c = 0L;
        mVar.f5153b = false;
        mVar.a();
        b bVar3 = this.d;
        synchronized (bVar3.f3734a) {
            try {
                if (bVar3.f3735b != 3) {
                    bVar3.k(0);
                    try {
                        this.f3818a.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
