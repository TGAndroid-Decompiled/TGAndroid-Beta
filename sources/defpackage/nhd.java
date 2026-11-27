package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class nhd implements ServiceConnection {
    public final wh0 a;
    public final zhd b;
    public final zhd c;
    public final vh0 d;

    public nhd(vh0 vh0Var, wh0 wh0Var) {
        this.d = vh0Var;
        ffd ffdVar = vh0Var.B;
        this.b = new zhd(ffdVar);
        this.c = new zhd(ffdVar);
        this.a = wh0Var;
    }

    public final Long a(boolean z) {
        if (z) {
            zhd zhdVar = this.b;
            if (zhdVar.b) {
                long a = zhdVar.a.a();
                if (zhdVar.b) {
                    zhdVar.b = false;
                    long j = (a - zhdVar.d) + zhdVar.c;
                    zhdVar.c = j;
                    return Long.valueOf(j / 1000000);
                }
                grb.i("This stopwatch is already stopped.");
                return null;
            }
        } else {
            zhd zhdVar2 = this.c;
            if (zhdVar2.b) {
                long a2 = zhdVar2.a.a();
                if (zhdVar2.b) {
                    zhdVar2.b = false;
                    long j2 = (a2 - zhdVar2.d) + zhdVar2.c;
                    zhdVar2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                }
                grb.i("This stopwatch is already stopped.");
            }
        }
        return null;
    }

    public final void b(gi0 gi0Var, int i, String str, boolean z) {
        try {
            dne s = wne.s();
            int i2 = gi0Var.a;
            s.b();
            wne.r((wne) s.b, i2);
            String str2 = gi0Var.c;
            s.b();
            wne.o((wne) s.b, str2);
            s.b();
            wne.q((wne) s.b, i);
            if (str != null) {
                s.b();
                wne.n((wne) s.b, str);
            }
            Long a = a(z);
            vh0 vh0Var = this.d;
            if (z) {
                mve r = uve.r();
                r.c(false);
                r.d();
                if (a != null) {
                    long longValue = a.longValue();
                    r.b();
                    uve.p((uve) r.b, longValue);
                }
                kle u = wle.u();
                u.c(s);
                u.b();
                wle.t((wle) u.b, 6);
                u.d(r);
                vh0Var.h((wle) u.a());
                return;
            }
            fue p = que.p();
            p.b();
            que.n((que) p.b, (wne) s.a());
            if (a != null) {
                long longValue2 = a.longValue();
                p.b();
                que.o((que) p.b, longValue2);
            }
            vh0Var.h.o((que) p.a());
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(gi0 gi0Var) {
        vh0 vh0Var = this.d;
        synchronized (vh0Var.a) {
            if (vh0Var.b == 3) {
                return;
            }
            try {
                this.a.a(gi0Var);
            } catch (Throwable th) {
                old.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        old.h("BillingClient", "Billing service died.");
        try {
            vh0 vh0Var = this.d;
            boolean q = vh0.q(vh0Var);
            zhc zhcVar = vh0Var.h;
            if (q) {
                kle u = wle.u();
                u.b();
                wle.t((wle) u.b, 6);
                dne s = wne.s();
                s.b();
                wne.q((wne) s.b, 110);
                u.c(s);
                mve r = uve.r();
                r.c(false);
                r.d();
                u.d(r);
                zhcVar.h((wle) u.a());
            } else {
                zhcVar.n(moe.n());
            }
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
        vh0 vh0Var2 = this.d;
        synchronized (vh0Var2.a) {
            if (vh0Var2.b != 3 && vh0Var2.b != 0) {
                vh0Var2.k(0);
                vh0Var2.m();
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    old.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xcd v3dVar;
        old.g("BillingClient", "Billing service connected.");
        vh0 vh0Var = this.d;
        synchronized (vh0Var.a) {
            if (vh0Var.b == 3) {
                return;
            }
            int i = wcd.b;
            if (iBinder == null) {
                v3dVar = 0;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                if (queryLocalInterface instanceof xcd) {
                    v3dVar = (xcd) queryLocalInterface;
                } else {
                    v3dVar = new v3d(iBinder, "com.android.vending.billing.IInAppBillingService", (byte) 10);
                }
            }
            vh0Var.i = v3dVar;
            if (vh0.f(new ug7(this, (byte) 3), 30000L, new bva(this, (byte) 27), vh0Var.r(), vh0Var.e()) == null) {
                gi0 u = vh0Var.u();
                vh0Var.j(25, u);
                c(u);
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        old.h("BillingClient", "Billing service disconnected.");
        try {
            vh0 vh0Var = this.d;
            boolean q = vh0.q(vh0Var);
            zhc zhcVar = vh0Var.h;
            if (q) {
                kle u = wle.u();
                u.b();
                wle.t((wle) u.b, 6);
                dne s = wne.s();
                s.b();
                wne.q((wne) s.b, 109);
                u.c(s);
                mve r = uve.r();
                r.c(false);
                r.d();
                u.d(r);
                zhcVar.h((wle) u.a());
            } else {
                zhcVar.p(fve.n());
            }
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
        zhd zhdVar = this.c;
        zhdVar.c = 0L;
        zhdVar.b = false;
        zhdVar.a();
        vh0 vh0Var2 = this.d;
        synchronized (vh0Var2.a) {
            if (vh0Var2.b != 3) {
                vh0Var2.k(0);
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    old.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }
}
