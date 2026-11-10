package f5;

import a8.ra;
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
public final class s implements ServiceConnection {
    public final c f11189a;
    public final com.google.android.gms.internal.play_billing.m f11190b;
    public final com.google.android.gms.internal.play_billing.m f11191c;
    public final b d;

    public s(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f11190b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f11191c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f11189a = cVar;
    }

    public final Long a(boolean z9) {
        if (z9) {
            com.google.android.gms.internal.play_billing.m mVar = this.f11190b;
            if (mVar.f7404b) {
                long a10 = mVar.f7403a.a();
                if (mVar.f7404b) {
                    mVar.f7404b = false;
                    long j3 = (a10 - mVar.d) + mVar.f7405c;
                    mVar.f7405c = j3;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j3, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f11191c;
        if (mVar2.f7404b) {
            long a11 = mVar2.f7403a.a();
            if (mVar2.f7404b) {
                mVar2.f7404b = false;
                long j10 = (a11 - mVar2.d) + mVar2.f7405c;
                mVar2.f7405c = j10;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(f fVar, int i7, String str, boolean z9) {
        try {
            j3 s5 = k3.s();
            int i10 = fVar.f11156a;
            s5.c();
            k3.r((k3) s5.f7472b, i10);
            String str2 = fVar.f11158c;
            s5.c();
            k3.o((k3) s5.f7472b, str2);
            s5.c();
            k3.q((k3) s5.f7472b, i7);
            if (str != null) {
                s5.c();
                k3.n((k3) s5.f7472b, str);
            }
            Long a10 = a(z9);
            b bVar = this.d;
            if (z9) {
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                if (a10 != null) {
                    long longValue = a10.longValue();
                    r10.c();
                    d4.p((d4) r10.f7472b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s5);
                u10.c();
                g3.t((g3) u10.f7472b, 6);
                u10.e(r10);
                bVar.h((g3) u10.a());
                return;
            }
            z3 p10 = a4.p();
            p10.c();
            a4.n((a4) p10.f7472b, (k3) s5.a());
            if (a10 != null) {
                long longValue2 = a10.longValue();
                p10.c();
                a4.o((a4) p10.f7472b, longValue2);
            }
            bVar.h.m((a4) p10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(f fVar) {
        b bVar = this.d;
        synchronized (bVar.f11122a) {
            try {
                if (bVar.f11123b == 3) {
                    return;
                }
                try {
                    this.f11189a.a(fVar);
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
                q4.q qVar = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7472b, 6);
                j3 s5 = k3.s();
                s5.c();
                k3.q((k3) s5.f7472b, 110);
                u10.d(s5);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                qVar.h((g3) u10.a());
            } else {
                bVar.h.l(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.d;
        synchronized (bVar2.f11122a) {
            if (bVar2.f11123b != 3 && bVar2.f11123b != 0) {
                bVar2.k(0);
                bVar2.m();
                try {
                    this.f11189a.b();
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
        synchronized (bVar.f11122a) {
            try {
                if (bVar.f11123b == 3) {
                    return;
                }
                int i7 = com.google.android.gms.internal.play_billing.b.f7307b;
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
                bVar.f11128i = aVar;
                if (b.f(new a2.b(this, 3), 30000L, new ra(this, 23), bVar.r(), bVar.e()) == null) {
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
                q4.q qVar = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7472b, 6);
                j3 s5 = k3.s();
                s5.c();
                k3.q((k3) s5.f7472b, 109);
                u10.d(s5);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                qVar.h((g3) u10.a());
            } else {
                bVar.h.n(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f11191c;
        mVar.f7405c = 0L;
        mVar.f7404b = false;
        mVar.a();
        b bVar2 = this.d;
        synchronized (bVar2.f11122a) {
            try {
                if (bVar2.f11123b != 3) {
                    bVar2.k(0);
                    try {
                        this.f11189a.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
