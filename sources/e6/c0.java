package e6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f9679a;
    public final d0 f9680b;
    public final int f9681c;

    public c0(d0 d0Var, int i3, int i10) {
        this.f9679a = i10;
        this.f9680b = d0Var;
        this.f9681c = i3;
    }

    private final void a() {
        d0 d0Var = this.f9680b;
        e0 e0Var = d0Var.f9689b;
        e0Var.f9705y = -1;
        e0Var.f9706z = -1;
        e0Var.f9702u = null;
        e0Var.v = null;
        e0Var.f9703w = 0.0d;
        e0Var.j();
        e0Var.f9704x = false;
        e0Var.A = null;
        e0 e0Var2 = d0Var.f9689b;
        e0Var2.G = 1;
        int i3 = this.f9681c;
        synchronized (e0Var2.F) {
            try {
                for (f6.i iVar : d0Var.f9689b.F) {
                    f6.q qVar = iVar.f11485a.f11469e;
                    if (qVar != null) {
                        try {
                            m6.a aVar = new m6.a(i3, null, null);
                            f6.o oVar = (f6.o) qVar;
                            Parcel P0 = oVar.P0();
                            com.google.android.gms.internal.cast.u.c(P0, aVar);
                            oVar.T0(P0, 3);
                        } catch (RemoteException e10) {
                            f6.c.f11467m.a(e10, "Unable to call %s on %s.", "onDisconnected", f6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f9689b.h();
        e0 e0Var3 = d0Var.f9689b;
        com.google.android.gms.common.api.internal.m mVar = c6.i.x(e0Var3.f6777g, e0Var3.f9693l, "castDeviceControllerListenerKey").f6726b;
        p6.m.h(mVar, "Key must not be null");
        e0Var3.c(mVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f9680b;
        int i3 = this.f9681c;
        if (i3 == 0) {
            e0 e0Var = d0Var.f9689b;
            e0Var.G = 2;
            e0Var.f9695n = true;
            e0Var.f9696o = true;
            synchronized (e0Var.F) {
                try {
                    for (f6.i iVar : d0Var.f9689b.F) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f9689b;
        e0Var2.G = 1;
        synchronized (e0Var2.F) {
            try {
            } catch (RemoteException e10) {
                f6.c.f11467m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", f6.q.class.getSimpleName());
            } finally {
            }
            for (f6.i iVar2 : d0Var.f9689b.F) {
                f6.q qVar = iVar2.f11485a.f11469e;
                if (qVar != null) {
                    m6.a aVar = new m6.a(i3, null, null);
                    f6.o oVar = (f6.o) qVar;
                    Parcel P0 = oVar.P0();
                    com.google.android.gms.internal.cast.u.c(P0, aVar);
                    oVar.T0(P0, 3);
                }
            }
        }
        d0Var.f9689b.h();
    }

    @Override
    public final void run() {
        switch (this.f9679a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f9680b.f9689b.E.b(this.f9681c);
                return;
            default:
                d0 d0Var = this.f9680b;
                e0 e0Var = d0Var.f9689b;
                e0Var.G = 3;
                int i3 = this.f9681c;
                synchronized (e0Var.F) {
                    try {
                        for (f6.i iVar : d0Var.f9689b.F) {
                            f6.q qVar = iVar.f11485a.f11469e;
                            if (qVar != null) {
                                try {
                                    f6.o oVar = (f6.o) qVar;
                                    Parcel P0 = oVar.P0();
                                    P0.writeInt(i3);
                                    oVar.T0(P0, 2);
                                } catch (RemoteException e10) {
                                    f6.c.f11467m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", f6.q.class.getSimpleName());
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
