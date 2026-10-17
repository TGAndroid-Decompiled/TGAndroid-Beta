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
public final class y implements ServiceConnection {
    public final d f4797a;
    public final com.google.android.gms.internal.play_billing.m f4798b;
    public final com.google.android.gms.internal.play_billing.m f4799c;
    public final c d;

    public y(c cVar, d dVar) {
        this.d = cVar;
        com.google.android.gms.internal.play_billing.h hVar = cVar.B;
        this.f4798b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f4799c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f4797a = dVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f4798b;
            if (mVar.f7162b) {
                long a2 = mVar.f7161a.a();
                if (mVar.f7162b) {
                    mVar.f7162b = false;
                    long j10 = (a2 - mVar.d) + mVar.f7163c;
                    mVar.f7163c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f4799c;
        if (mVar2.f7162b) {
            long a10 = mVar2.f7161a.a();
            if (mVar2.f7162b) {
                mVar2.f7162b = false;
                long j11 = (a10 - mVar2.d) + mVar2.f7163c;
                mVar2.f7163c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(i iVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i11 = iVar.f4756a;
            s10.c();
            k3.r((k3) s10.f7223b, i11);
            String str2 = iVar.f4758c;
            s10.c();
            k3.o((k3) s10.f7223b, str2);
            s10.c();
            k3.q((k3) s10.f7223b, i10);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.f7223b, str);
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
                    d4.p((d4) r10.f7223b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s10);
                u10.c();
                g3.t((g3) u10.f7223b, 6);
                u10.e(r10);
                cVar.h((g3) u10.a());
                return;
            }
            z3 p5 = a4.p();
            p5.c();
            a4.n((a4) p5.f7223b, (k3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p5.c();
                a4.o((a4) p5.f7223b, longValue2);
            }
            cVar.h.S((a4) p5.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(i iVar) {
        c cVar = this.d;
        synchronized (cVar.f4704a) {
            try {
                if (cVar.f4705b == 3) {
                    return;
                }
                try {
                    this.f4797a.onBillingSetupFinished(iVar);
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
                g3.t((g3) u10.f7223b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f7223b, 110);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                sVar.N((g3) u10.a());
            } else {
                cVar.h.R(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        c cVar2 = this.d;
        synchronized (cVar2.f4704a) {
            if (cVar2.f4705b != 3 && cVar2.f4705b != 0) {
                cVar2.k(0);
                cVar2.m();
                try {
                    this.f4797a.onBillingServiceDisconnected();
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
        synchronized (cVar.f4704a) {
            try {
                if (cVar.f4705b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f7073b;
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
                cVar.f4709i = aVar;
                if (c.f(new x(this, 0), 30000L, new androidx.activity.i(this, 8), cVar.r(), cVar.e()) == null) {
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
                g3.t((g3) u10.f7223b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f7223b, 109);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                sVar.N((g3) u10.a());
            } else {
                cVar.h.T(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f4799c;
        mVar.f7163c = 0L;
        mVar.f7162b = false;
        mVar.a();
        c cVar2 = this.d;
        synchronized (cVar2.f4704a) {
            try {
                if (cVar2.f4705b != 3) {
                    cVar2.k(0);
                    try {
                        this.f4797a.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
