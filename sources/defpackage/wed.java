package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class wed implements ServiceConnection {
    public final vi0 a;
    public final ifd b;
    public final ifd c;
    public final ui0 d;

    public wed(ui0 ui0Var, vi0 vi0Var) {
        this.d = ui0Var;
        ocd ocdVar = ui0Var.B;
        this.b = new ifd(ocdVar);
        this.c = new ifd(ocdVar);
        this.a = vi0Var;
    }

    public final Long a(boolean z) {
        if (z) {
            ifd ifdVar = this.b;
            if (ifdVar.b) {
                long a = ifdVar.a.a();
                if (ifdVar.b) {
                    ifdVar.b = false;
                    long j = (a - ifdVar.d) + ifdVar.c;
                    ifdVar.c = j;
                    return Long.valueOf(j / 1000000);
                }
                dq9.m("This stopwatch is already stopped.");
                return null;
            }
        } else {
            ifd ifdVar2 = this.c;
            if (ifdVar2.b) {
                long a2 = ifdVar2.a.a();
                if (ifdVar2.b) {
                    ifdVar2.b = false;
                    long j2 = (a2 - ifdVar2.d) + ifdVar2.c;
                    ifdVar2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                }
                dq9.m("This stopwatch is already stopped.");
            }
        }
        return null;
    }

    public final void b(fj0 fj0Var, int i, String str, boolean z) {
        try {
            nke s = gle.s();
            int i2 = fj0Var.a;
            s.b();
            gle.r((gle) s.b, i2);
            String str2 = fj0Var.c;
            s.b();
            gle.o((gle) s.b, str2);
            s.b();
            gle.q((gle) s.b, i);
            if (str != null) {
                s.b();
                gle.n((gle) s.b, str);
            }
            Long a = a(z);
            ui0 ui0Var = this.d;
            if (z) {
                yse r = gte.r();
                r.c(false);
                r.d();
                if (a != null) {
                    long longValue = a.longValue();
                    r.b();
                    gte.p((gte) r.b, longValue);
                }
                uie u = gje.u();
                u.c(s);
                u.b();
                gje.t((gje) u.b, 6);
                u.d(r);
                ui0Var.h((gje) u.a());
                return;
            }
            rre p = cse.p();
            p.b();
            cse.n((cse) p.b, (gle) s.a());
            if (a != null) {
                long longValue2 = a.longValue();
                p.b();
                cse.o((cse) p.b, longValue2);
            }
            ui0Var.h.C((cse) p.a());
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(fj0 fj0Var) {
        ui0 ui0Var = this.d;
        synchronized (ui0Var.a) {
            if (ui0Var.b == 3) {
                return;
            }
            try {
                this.a.a(fj0Var);
            } catch (Throwable th) {
                yid.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        yid.h("BillingClient", "Billing service died.");
        try {
            ui0 ui0Var = this.d;
            boolean q = ui0.q(ui0Var);
            rhb rhbVar = ui0Var.h;
            if (q) {
                uie u = gje.u();
                u.b();
                gje.t((gje) u.b, 6);
                nke s = gle.s();
                s.b();
                gle.q((gle) s.b, 110);
                u.c(s);
                yse r = gte.r();
                r.c(false);
                r.d();
                u.d(r);
                rhbVar.v((gje) u.a());
            } else {
                rhbVar.B(xle.n());
            }
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
        ui0 ui0Var2 = this.d;
        synchronized (ui0Var2.a) {
            if (ui0Var2.b != 3 && ui0Var2.b != 0) {
                ui0Var2.k(0);
                ui0Var2.m();
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    yid.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gad f1dVar;
        yid.g("BillingClient", "Billing service connected.");
        ui0 ui0Var = this.d;
        synchronized (ui0Var.a) {
            if (ui0Var.b == 3) {
                return;
            }
            int i = fad.b;
            if (iBinder == null) {
                f1dVar = 0;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                if (queryLocalInterface instanceof gad) {
                    f1dVar = (gad) queryLocalInterface;
                } else {
                    f1dVar = new f1d(iBinder, "com.android.vending.billing.IInAppBillingService", (byte) 10);
                }
            }
            ui0Var.i = f1dVar;
            if (ui0.f(new mg7(this, (byte) 3), 30000L, new zka(this, (byte) 28), ui0Var.r(), ui0Var.e()) == null) {
                fj0 u = ui0Var.u();
                ui0Var.j(25, u);
                c(u);
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        yid.h("BillingClient", "Billing service disconnected.");
        try {
            ui0 ui0Var = this.d;
            boolean q = ui0.q(ui0Var);
            rhb rhbVar = ui0Var.h;
            if (q) {
                uie u = gje.u();
                u.b();
                gje.t((gje) u.b, 6);
                nke s = gle.s();
                s.b();
                gle.q((gle) s.b, 109);
                u.c(s);
                yse r = gte.r();
                r.c(false);
                r.d();
                u.d(r);
                rhbVar.v((gje) u.a());
            } else {
                rhbVar.I(rse.n());
            }
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
        ifd ifdVar = this.c;
        ifdVar.c = 0L;
        ifdVar.b = false;
        ifdVar.a();
        ui0 ui0Var2 = this.d;
        synchronized (ui0Var2.a) {
            if (ui0Var2.b != 3) {
                ui0Var2.k(0);
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    yid.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }
}
