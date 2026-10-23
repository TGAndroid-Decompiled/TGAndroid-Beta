package c5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.m3;
import java.util.concurrent.TimeUnit;
public final class z implements ServiceConnection {
    public final d f4802a;
    public final com.google.android.gms.internal.play_billing.m f4803b;
    public final com.google.android.gms.internal.play_billing.m f4804c;
    public final c d;

    public z(c cVar, d dVar) {
        this.d = cVar;
        com.google.android.gms.internal.play_billing.h hVar = cVar.B;
        this.f4803b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f4804c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f4802a = dVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f4803b;
            if (mVar.f7172b) {
                long a2 = mVar.f7171a.a();
                if (mVar.f7172b) {
                    mVar.f7172b = false;
                    long j10 = (a2 - mVar.d) + mVar.f7173c;
                    mVar.f7173c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f4804c;
        if (mVar2.f7172b) {
            long a10 = mVar2.f7171a.a();
            if (mVar2.f7172b) {
                mVar2.f7172b = false;
                long j11 = (a10 - mVar2.d) + mVar2.f7173c;
                mVar2.f7173c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(i iVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = l3.s();
            int i11 = iVar.f4757a;
            s10.c();
            l3.r((l3) s10.f7233b, i11);
            String str2 = iVar.f4759c;
            s10.c();
            l3.o((l3) s10.f7233b, str2);
            s10.c();
            l3.q((l3) s10.f7233b, i10);
            if (str != null) {
                s10.c();
                l3.n((l3) s10.f7233b, str);
            }
            Long a2 = a(z10);
            c cVar = this.d;
            if (z10) {
                d4 r10 = e4.r();
                r10.d(false);
                r10.e();
                if (a2 != null) {
                    long longValue = a2.longValue();
                    r10.c();
                    e4.p((e4) r10.f7233b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s10);
                u10.c();
                g3.t((g3) u10.f7233b, 6);
                u10.e(r10);
                cVar.h((g3) u10.a());
                return;
            }
            a4 p5 = b4.p();
            p5.c();
            b4.n((b4) p5.f7233b, (l3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p5.c();
                b4.o((b4) p5.f7233b, longValue2);
            }
            cVar.h.R((b4) p5.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(i iVar) {
        c cVar = this.d;
        synchronized (cVar.f4705a) {
            try {
                if (cVar.f4706b == 3) {
                    return;
                }
                try {
                    this.f4802a.onBillingSetupFinished(iVar);
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
                n4.s sVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7233b, 6);
                j3 s10 = l3.s();
                s10.c();
                l3.q((l3) s10.f7233b, 110);
                u10.d(s10);
                d4 r10 = e4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                sVar.K((g3) u10.a());
            } else {
                cVar.h.Q(m3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        c cVar2 = this.d;
        synchronized (cVar2.f4705a) {
            if (cVar2.f4706b != 3 && cVar2.f4706b != 0) {
                cVar2.k(0);
                cVar2.m();
                try {
                    this.f4802a.onBillingServiceDisconnected();
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
        synchronized (cVar.f4705a) {
            try {
                if (cVar.f4706b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f7083b;
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
                cVar.f4710i = aVar;
                if (c.f(new y(this, 0), 30000L, new androidx.activity.i(this, 8), cVar.r(), cVar.e()) == null) {
                    i u10 = cVar.u();
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
                n4.s sVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7233b, 6);
                j3 s10 = l3.s();
                s10.c();
                l3.q((l3) s10.f7233b, 109);
                u10.d(s10);
                d4 r10 = e4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                sVar.K((g3) u10.a());
            } else {
                cVar.h.S(c4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f4804c;
        mVar.f7173c = 0L;
        mVar.f7172b = false;
        mVar.a();
        c cVar2 = this.d;
        synchronized (cVar2.f4705a) {
            try {
                if (cVar2.f4706b != 3) {
                    cVar2.k(0);
                    try {
                        this.f4802a.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
