package o5;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f19238a;
    public final d0 f19239b;
    public final int f19240c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f19238a = i11;
        this.f19239b = d0Var;
        this.f19240c = i10;
    }

    private final void a() {
        d0 d0Var = this.f19239b;
        e0 e0Var = d0Var.f19248b;
        e0Var.f19264x = -1;
        e0Var.f19265y = -1;
        e0Var.f19261t = null;
        e0Var.f19262u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f19263w = false;
        e0Var.f19266z = null;
        e0 e0Var2 = d0Var.f19248b;
        e0Var2.F = 1;
        int i10 = this.f19240c;
        synchronized (e0Var2.E) {
            try {
                for (p5.i iVar : d0Var.f19248b.E) {
                    p5.q qVar = iVar.f45640a.f45625e;
                    if (qVar != null) {
                        try {
                            w5.a aVar = new w5.a(i10);
                            p5.o oVar = (p5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.u.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e10) {
                            p5.c.f45623m.a(e10, "Unable to call %s on %s.", "onDisconnected", p5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f19248b.h();
        e0 e0Var3 = d0Var.f19248b;
        com.google.android.gms.common.api.internal.n nVar = za.c.i(e0Var3.f3960f, e0Var3.f19252k, "castDeviceControllerListenerKey").f3887c;
        z5.l.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f19239b;
        int i10 = this.f19240c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f19248b;
            e0Var.F = 2;
            e0Var.f19254m = true;
            e0Var.f19255n = true;
            synchronized (e0Var.E) {
                try {
                    for (p5.i iVar : d0Var.f19248b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f19248b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e10) {
                p5.c.f45623m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", p5.q.class.getSimpleName());
            } finally {
            }
            for (p5.i iVar2 : d0Var.f19248b.E) {
                p5.q qVar = iVar2.f45640a.f45625e;
                if (qVar != null) {
                    w5.a aVar = new w5.a(i10);
                    p5.o oVar = (p5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.u.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        d0Var.f19248b.h();
    }

    @Override
    public final void run() {
        switch (this.f19238a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f19239b.f19248b.D.b(this.f19240c);
                return;
            default:
                d0 d0Var = this.f19239b;
                e0 e0Var = d0Var.f19248b;
                e0Var.F = 3;
                int i10 = this.f19240c;
                synchronized (e0Var.E) {
                    try {
                        for (p5.i iVar : d0Var.f19248b.E) {
                            p5.q qVar = iVar.f45640a.f45625e;
                            if (qVar != null) {
                                try {
                                    p5.o oVar = (p5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i10);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e10) {
                                    p5.c.f45623m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", p5.q.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
