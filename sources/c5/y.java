package c5;

import ai.q4;
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
public final class y implements ServiceConnection {
    public final d f3939a;
    public final com.google.android.gms.internal.play_billing.m f3940b;
    public final com.google.android.gms.internal.play_billing.m f3941c;
    public final c d;

    public y(c cVar, d dVar) {
        this.d = cVar;
        com.google.android.gms.internal.play_billing.h hVar = cVar.B;
        this.f3940b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f3941c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f3939a = dVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f3940b;
            if (mVar.f6836b) {
                long a2 = mVar.f6835a.a();
                if (mVar.f6836b) {
                    mVar.f6836b = false;
                    long j3 = (a2 - mVar.d) + mVar.f6837c;
                    mVar.f6837c = j3;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j3, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f3941c;
        if (mVar2.f6836b) {
            long a10 = mVar2.f6835a.a();
            if (mVar2.f6836b) {
                mVar2.f6836b = false;
                long j10 = (a10 - mVar2.d) + mVar2.f6837c;
                mVar2.f6837c = j10;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(h hVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i11 = hVar.f3894a;
            s10.c();
            k3.r((k3) s10.f6897b, i11);
            String str2 = hVar.f3896c;
            s10.c();
            k3.o((k3) s10.f6897b, str2);
            s10.c();
            k3.q((k3) s10.f6897b, i10);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.f6897b, str);
            }
            Long a2 = a(z10);
            c cVar = this.d;
            if (z10) {
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                if (a2 != null) {
                    long longValue = a2.longValue();
                    r10.c();
                    d4.p((d4) r10.f6897b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s10);
                u10.c();
                g3.t((g3) u10.f6897b, 6);
                u10.e(r10);
                cVar.h((g3) u10.a());
                return;
            }
            z3 p5 = a4.p();
            p5.c();
            a4.n((a4) p5.f6897b, (k3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p5.c();
                a4.o((a4) p5.f6897b, longValue2);
            }
            cVar.h.c0((a4) p5.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(h hVar) {
        c cVar = this.d;
        synchronized (cVar.f3848a) {
            try {
                if (cVar.f3849b == 3) {
                    return;
                }
                try {
                    this.f3939a.onBillingSetupFinished(hVar);
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
            c cVar = this.d;
            if (c.q(cVar)) {
                of.b bVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f6897b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f6897b, 110);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar.X((g3) u10.a());
            } else {
                cVar.h.b0(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        c cVar2 = this.d;
        synchronized (cVar2.f3848a) {
            if (cVar2.f3849b != 3 && cVar2.f3849b != 0) {
                cVar2.k(0);
                cVar2.m();
                try {
                    this.f3939a.onBillingServiceDisconnected();
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
        c cVar = this.d;
        synchronized (cVar.f3848a) {
            try {
                if (cVar.f3849b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f6747b;
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
                cVar.f3853i = aVar;
                if (c.f(new x(this, 0), 30000L, new q4(this, 11), cVar.r(), cVar.e()) == null) {
                    h u10 = cVar.u();
                    cVar.j(25, u10);
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
            c cVar = this.d;
            if (c.q(cVar)) {
                of.b bVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f6897b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f6897b, 109);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar.X((g3) u10.a());
            } else {
                cVar.h.d0(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f3941c;
        mVar.f6837c = 0L;
        mVar.f6836b = false;
        mVar.a();
        c cVar2 = this.d;
        synchronized (cVar2.f3848a) {
            try {
                if (cVar2.f3849b != 3) {
                    cVar2.k(0);
                    try {
                        this.f3939a.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
