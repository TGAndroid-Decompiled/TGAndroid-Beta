package n2;

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
import m.i3;
public final class t implements ServiceConnection {
    public final c f18352a;
    public final com.google.android.gms.internal.play_billing.m f18353b;
    public final com.google.android.gms.internal.play_billing.m f18354c;
    public final b d;

    public t(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f18353b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f18354c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f18352a = cVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f18353b;
            if (mVar.f3623b) {
                long a2 = mVar.f3622a.a();
                if (mVar.f3623b) {
                    mVar.f3623b = false;
                    long j10 = (a2 - mVar.d) + mVar.f3624c;
                    mVar.f3624c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f18354c;
        if (mVar2.f3623b) {
            long a3 = mVar2.f3622a.a();
            if (mVar2.f3623b) {
                mVar2.f3623b = false;
                long j11 = (a3 - mVar2.d) + mVar2.f3624c;
                mVar2.f3624c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(g gVar, int i9, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i10 = gVar.f18319a;
            s10.c();
            k3.r((k3) s10.f3691b, i10);
            String str2 = gVar.f18321c;
            s10.c();
            k3.o((k3) s10.f3691b, str2);
            s10.c();
            k3.q((k3) s10.f3691b, i9);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.f3691b, str);
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
                    d4.p((d4) r10.f3691b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s10);
                u10.c();
                g3.t((g3) u10.f3691b, 6);
                u10.e(r10);
                bVar.h((g3) u10.a());
                return;
            }
            z3 p6 = a4.p();
            p6.c();
            a4.n((a4) p6.f3691b, (k3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p6.c();
                a4.o((a4) p6.f3691b, longValue2);
            }
            bVar.h.B((a4) p6.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(g gVar) {
        b bVar = this.d;
        synchronized (bVar.f18266a) {
            try {
                if (bVar.f18267b == 3) {
                    return;
                }
                try {
                    this.f18352a.onBillingSetupFinished(gVar);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                g5.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f3691b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f3691b, 110);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.w((g3) u10.a());
            } else {
                bVar.h.A(l3.n());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
        b bVar3 = this.d;
        synchronized (bVar3.f18266a) {
            if (bVar3.f18267b != 3 && bVar3.f18267b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.f18352a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service connected.");
        b bVar = this.d;
        synchronized (bVar.f18266a) {
            try {
                if (bVar.f18267b == 3) {
                    return;
                }
                int i9 = com.google.android.gms.internal.play_billing.b.f3527b;
                if (iBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        aVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        aVar = new b7.a(iBinder, "com.android.vending.billing.IInAppBillingService", 3);
                    }
                }
                bVar.f18272i = aVar;
                if (b.f(new d7.p(this, 8), 30000L, new i3(this, 2), bVar.r(), bVar.e()) == null) {
                    g u10 = bVar.u();
                    bVar.j(25, u10);
                    c(u10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                g5.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f3691b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.f3691b, 109);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.w((g3) u10.a());
            } else {
                bVar.h.C(b4.n());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f18354c;
        mVar.f3624c = 0L;
        mVar.f3623b = false;
        mVar.a();
        b bVar3 = this.d;
        synchronized (bVar3.f18266a) {
            try {
                if (bVar3.f18267b != 3) {
                    bVar3.k(0);
                    try {
                        this.f18352a.onBillingServiceDisconnected();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                    }
                }
            } finally {
            }
        }
    }
}
