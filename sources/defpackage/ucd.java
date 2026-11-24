package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class ucd implements ServiceConnection {
    public final vh0 a;
    public final gdd b;
    public final gdd c;
    public final uh0 d;

    public ucd(uh0 uh0Var, vh0 vh0Var) {
        this.d = uh0Var;
        mad madVar = uh0Var.B;
        this.b = new gdd(madVar);
        this.c = new gdd(madVar);
        this.a = vh0Var;
    }

    public final Long a(boolean z) {
        if (z) {
            gdd gddVar = this.b;
            if (gddVar.b) {
                long a = gddVar.a.a();
                if (gddVar.b) {
                    gddVar.b = false;
                    long j = (a - gddVar.d) + gddVar.c;
                    gddVar.c = j;
                    return Long.valueOf(j / 1000000);
                }
                sc8.j("This stopwatch is already stopped.");
                return null;
            }
        } else {
            gdd gddVar2 = this.c;
            if (gddVar2.b) {
                long a2 = gddVar2.a.a();
                if (gddVar2.b) {
                    gddVar2.b = false;
                    long j2 = (a2 - gddVar2.d) + gddVar2.c;
                    gddVar2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                }
                sc8.j("This stopwatch is already stopped.");
            }
        }
        return null;
    }

    public final void b(fi0 fi0Var, int i, String str, boolean z) {
        try {
            mie s = fje.s();
            int i2 = fi0Var.a;
            s.b();
            fje.r((fje) s.b, i2);
            String str2 = fi0Var.c;
            s.b();
            fje.o((fje) s.b, str2);
            s.b();
            fje.q((fje) s.b, i);
            if (str != null) {
                s.b();
                fje.n((fje) s.b, str);
            }
            Long a = a(z);
            uh0 uh0Var = this.d;
            if (z) {
                vqe r = dre.r();
                r.c(false);
                r.d();
                if (a != null) {
                    long longValue = a.longValue();
                    r.b();
                    dre.p((dre) r.b, longValue);
                }
                tge u = fhe.u();
                u.c(s);
                u.b();
                fhe.t((fhe) u.b, 6);
                u.d(r);
                uh0Var.h((fhe) u.a());
                return;
            }
            ope p = zpe.p();
            p.b();
            zpe.n((zpe) p.b, (fje) s.a());
            if (a != null) {
                long longValue2 = a.longValue();
                p.b();
                zpe.o((zpe) p.b, longValue2);
            }
            uh0Var.h.q((zpe) p.a());
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(fi0 fi0Var) {
        uh0 uh0Var = this.d;
        synchronized (uh0Var.a) {
            if (uh0Var.b == 3) {
                return;
            }
            try {
                this.a.a(fi0Var);
            } catch (Throwable th) {
                xgd.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        xgd.h("BillingClient", "Billing service died.");
        try {
            uh0 uh0Var = this.d;
            boolean q = uh0.q(uh0Var);
            aec aecVar = uh0Var.h;
            if (q) {
                tge u = fhe.u();
                u.b();
                fhe.t((fhe) u.b, 6);
                mie s = fje.s();
                s.b();
                fje.q((fje) s.b, 110);
                u.c(s);
                vqe r = dre.r();
                r.c(false);
                r.d();
                u.d(r);
                aecVar.i((fhe) u.a());
            } else {
                aecVar.n(vje.n());
            }
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
        uh0 uh0Var2 = this.d;
        synchronized (uh0Var2.a) {
            if (uh0Var2.b != 3 && uh0Var2.b != 0) {
                uh0Var2.k(0);
                uh0Var2.m();
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    xgd.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e8d ezcVar;
        xgd.g("BillingClient", "Billing service connected.");
        uh0 uh0Var = this.d;
        synchronized (uh0Var.a) {
            if (uh0Var.b == 3) {
                return;
            }
            int i = d8d.b;
            if (iBinder == null) {
                ezcVar = 0;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                if (queryLocalInterface instanceof e8d) {
                    ezcVar = (e8d) queryLocalInterface;
                } else {
                    ezcVar = new ezc(iBinder, "com.android.vending.billing.IInAppBillingService", (byte) 10);
                }
            }
            uh0Var.i = ezcVar;
            if (uh0.f(new ke7(this, (byte) 3), 30000L, new xia(this, (byte) 28), uh0Var.r(), uh0Var.e()) == null) {
                fi0 u = uh0Var.u();
                uh0Var.j(25, u);
                c(u);
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        xgd.h("BillingClient", "Billing service disconnected.");
        try {
            uh0 uh0Var = this.d;
            boolean q = uh0.q(uh0Var);
            aec aecVar = uh0Var.h;
            if (q) {
                tge u = fhe.u();
                u.b();
                fhe.t((fhe) u.b, 6);
                mie s = fje.s();
                s.b();
                fje.q((fje) s.b, 109);
                u.c(s);
                vqe r = dre.r();
                r.c(false);
                r.d();
                u.d(r);
                aecVar.i((fhe) u.a());
            } else {
                aecVar.r(oqe.n());
            }
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
        gdd gddVar = this.c;
        gddVar.c = 0L;
        gddVar.b = false;
        gddVar.a();
        uh0 uh0Var2 = this.d;
        synchronized (uh0Var2.a) {
            if (uh0Var2.b != 3) {
                uh0Var2.k(0);
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    xgd.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }
}
