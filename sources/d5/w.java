package d5;

import a8.gg;
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
public final class w implements ServiceConnection {
    public final d f8018a;
    public final com.google.android.gms.internal.play_billing.m f8019b;
    public final com.google.android.gms.internal.play_billing.m f8020c;
    public final c d;

    public w(c cVar, d dVar) {
        this.d = cVar;
        com.google.android.gms.internal.play_billing.h hVar = cVar.B;
        this.f8019b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f8020c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f8018a = dVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f8019b;
            if (mVar.f7271b) {
                long a2 = mVar.f7270a.a();
                if (mVar.f7271b) {
                    mVar.f7271b = false;
                    long j10 = (a2 - mVar.d) + mVar.f7272c;
                    mVar.f7272c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f8020c;
        if (mVar2.f7271b) {
            long a10 = mVar2.f7270a.a();
            if (mVar2.f7271b) {
                mVar2.f7271b = false;
                long j11 = (a10 - mVar2.d) + mVar2.f7272c;
                mVar2.f7272c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(i iVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i11 = iVar.f7985a;
            s10.c();
            k3.r((k3) s10.f7332b, i11);
            String str2 = iVar.f7987c;
            s10.c();
            k3.o((k3) s10.f7332b, str2);
            s10.c();
            k3.q((k3) s10.f7332b, i10);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.f7332b, str);
            }
            Long a2 = a(z10);
            c cVar = this.d;
            if (z10) {
                c4 r6 = d4.r();
                r6.d(false);
                r6.e();
                if (a2 != null) {
                    long longValue = a2.longValue();
                    r6.c();
                    d4.p((d4) r6.f7332b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s10);
                u10.c();
                g3.t((g3) u10.f7332b, 6);
                u10.e(r6);
                cVar.h((g3) u10.a());
                return;
            }
            z3 p10 = a4.p();
            p10.c();
            a4.n((a4) p10.f7332b, (k3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p10.c();
                a4.o((a4) p10.f7332b, longValue2);
            }
            cVar.h.Y((a4) p10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(i iVar) {
        c cVar = this.d;
        synchronized (cVar.f7931a) {
            try {
                if (cVar.f7932b == 3) {
                    return;
                }
                try {
                    this.f8018a.onBillingSetupFinished(iVar);
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
                rf.b bVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7332b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f7332b, 110);
                u10.d(s10);
                c4 r6 = d4.r();
                r6.d(false);
                r6.e();
                u10.e(r6);
                bVar.T((g3) u10.a());
            } else {
                cVar.h.X(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        c cVar2 = this.d;
        synchronized (cVar2.f7931a) {
            if (cVar2.f7932b != 3 && cVar2.f7932b != 0) {
                cVar2.k(0);
                cVar2.m();
                try {
                    this.f8018a.onBillingServiceDisconnected();
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
        synchronized (cVar.f7931a) {
            try {
                if (cVar.f7932b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f7182b;
                if (iBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        aVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        aVar = new a8.a(iBinder, "com.android.vending.billing.IInAppBillingService", 3);
                    }
                }
                cVar.f7936i = aVar;
                if (c.f(new gg(this, 1), 30000L, new a5.d(this, 18), cVar.r(), cVar.e()) == null) {
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
                rf.b bVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7332b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f7332b, 109);
                u10.d(s10);
                c4 r6 = d4.r();
                r6.d(false);
                r6.e();
                u10.e(r6);
                bVar.T((g3) u10.a());
            } else {
                cVar.h.Z(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f8020c;
        mVar.f7272c = 0L;
        mVar.f7271b = false;
        mVar.a();
        c cVar2 = this.d;
        synchronized (cVar2.f7931a) {
            try {
                if (cVar2.f7932b != 3) {
                    cVar2.k(0);
                    try {
                        this.f8018a.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
