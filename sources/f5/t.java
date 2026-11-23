package f5;

import a8.sa;
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
public final class t implements ServiceConnection {
    public final c f11311a;
    public final com.google.android.gms.internal.play_billing.m f11312b;
    public final com.google.android.gms.internal.play_billing.m f11313c;
    public final int d;
    public final b f11314e;

    public t(b bVar, c cVar, int i7) {
        this.f11314e = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f11312b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f11313c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f11311a = cVar;
        this.d = i7;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f11312b;
            if (mVar.f7065b) {
                long a10 = mVar.f7064a.a();
                if (mVar.f7065b) {
                    mVar.f7065b = false;
                    long j3 = (a10 - mVar.d) + mVar.f7066c;
                    mVar.f7066c = j3;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j3, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f11313c;
        if (mVar2.f7065b) {
            long a11 = mVar2.f7064a.a();
            if (mVar2.f7065b) {
                mVar2.f7065b = false;
                long j10 = (a11 - mVar2.d) + mVar2.f7066c;
                mVar2.f7066c = j10;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(f fVar, int i7, String str, boolean z10) {
        boolean z11;
        try {
            j3 s5 = k3.s();
            int i10 = fVar.f11277a;
            s5.c();
            k3.r((k3) s5.f7133b, i10);
            String str2 = fVar.f11279c;
            s5.c();
            k3.o((k3) s5.f7133b, str2);
            s5.c();
            k3.q((k3) s5.f7133b, i7);
            if (str != null) {
                s5.c();
                k3.n((k3) s5.f7133b, str);
            }
            Long a10 = a(z10);
            b bVar = this.f11314e;
            if (z10) {
                c4 r10 = d4.r();
                int i11 = this.d;
                if (i11 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r10.d(z11);
                r10.e(i11);
                if (a10 != null) {
                    long longValue = a10.longValue();
                    r10.c();
                    d4.p((d4) r10.f7133b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s5);
                u10.c();
                g3.t((g3) u10.f7133b, 6);
                u10.e(r10);
                bVar.h((g3) u10.a());
                return;
            }
            z3 p10 = a4.p();
            p10.c();
            a4.n((a4) p10.f7133b, (k3) s5.a());
            if (a10 != null) {
                long longValue2 = a10.longValue();
                p10.c();
                a4.o((a4) p10.f7133b, longValue2);
            }
            bVar.h.d0((a4) p10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(f fVar) {
        b bVar = this.f11314e;
        synchronized (bVar.f11243a) {
            try {
                if (bVar.f11244b == 3) {
                    return;
                }
                try {
                    this.f11311a.a(fVar);
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
        boolean z10;
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.f11314e;
            if (b.q(bVar)) {
                wf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7133b, 6);
                j3 s5 = k3.s();
                s5.c();
                k3.q((k3) s5.f7133b, 110);
                u10.d(s5);
                c4 r10 = d4.r();
                int i7 = this.d;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r10.d(z10);
                r10.e(i7);
                u10.e(r10);
                bVar2.W((g3) u10.a());
            } else {
                bVar.h.c0(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar3 = this.f11314e;
        synchronized (bVar3.f11243a) {
            if (bVar3.f11244b != 3 && bVar3.f11244b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.f11311a.b();
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
        b bVar = this.f11314e;
        synchronized (bVar.f11243a) {
            try {
                if (bVar.f11244b == 3) {
                    return;
                }
                int i7 = com.google.android.gms.internal.play_billing.b.f6968b;
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
                bVar.f11249i = aVar;
                if (b.f(new a2.b(this, 3), 30000L, new sa(this, 23), bVar.r(), bVar.e()) == null) {
                    int i10 = this.d;
                    f u10 = bVar.u();
                    bVar.j(25, i10, u10);
                    c(u10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.f11314e;
            if (b.q(bVar)) {
                wf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f7133b, 6);
                j3 s5 = k3.s();
                s5.c();
                k3.q((k3) s5.f7133b, 109);
                u10.d(s5);
                c4 r10 = d4.r();
                int i7 = this.d;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r10.d(z10);
                r10.e(i7);
                u10.e(r10);
                bVar2.W((g3) u10.a());
            } else {
                bVar.h.e0(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f11313c;
        mVar.f7066c = 0L;
        mVar.f7065b = false;
        mVar.a();
        b bVar3 = this.f11314e;
        synchronized (bVar3.f11243a) {
            try {
                if (bVar3.f11244b != 3) {
                    bVar3.k(0);
                    try {
                        this.f11311a.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
