package c6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f3854a;
    public final d0 f3855b;
    public final int f3856c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f3854a = i11;
        this.f3855b = d0Var;
        this.f3856c = i10;
    }

    private final void a() {
        d0 d0Var = this.f3855b;
        e0 e0Var = d0Var.f3863b;
        e0Var.f3879x = -1;
        e0Var.f3880y = -1;
        e0Var.f3876t = null;
        e0Var.f3877u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f3878w = false;
        e0Var.f3881z = null;
        e0 e0Var2 = d0Var.f3863b;
        e0Var2.F = 1;
        int i10 = this.f3856c;
        synchronized (e0Var2.E) {
            try {
                for (d6.i iVar : d0Var.f3863b.E) {
                    d6.q qVar = iVar.f5779a.e;
                    if (qVar != null) {
                        try {
                            k6.a aVar = new k6.a(i10);
                            d6.o oVar = (d6.o) qVar;
                            Parcel P0 = oVar.P0();
                            com.google.android.gms.internal.cast.u.c(P0, aVar);
                            oVar.T0(P0, 3);
                        } catch (RemoteException e) {
                            d6.c.f5763m.a(e, "Unable to call %s on %s.", "onDisconnected", d6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f3863b.h();
        e0 e0Var3 = d0Var.f3863b;
        com.google.android.gms.common.api.internal.n nVar = za.c.k(e0Var3.f4524f, e0Var3.f3867k, "castDeviceControllerListenerKey").f4459c;
        n6.l.h(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f3855b;
        int i10 = this.f3856c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f3863b;
            e0Var.F = 2;
            e0Var.f3869m = true;
            e0Var.f3870n = true;
            synchronized (e0Var.E) {
                try {
                    for (d6.i iVar : d0Var.f3863b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f3863b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e) {
                d6.c.f5763m.a(e, "Unable to call %s on %s.", "onConnectionFailed", d6.q.class.getSimpleName());
            } finally {
            }
            for (d6.i iVar2 : d0Var.f3863b.E) {
                d6.q qVar = iVar2.f5779a.e;
                if (qVar != null) {
                    k6.a aVar = new k6.a(i10);
                    d6.o oVar = (d6.o) qVar;
                    Parcel P0 = oVar.P0();
                    com.google.android.gms.internal.cast.u.c(P0, aVar);
                    oVar.T0(P0, 3);
                }
            }
        }
        d0Var.f3863b.h();
    }

    @Override
    public final void run() {
        switch (this.f3854a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f3855b.f3863b.D.b(this.f3856c);
                return;
            default:
                d0 d0Var = this.f3855b;
                e0 e0Var = d0Var.f3863b;
                e0Var.F = 3;
                int i10 = this.f3856c;
                synchronized (e0Var.E) {
                    try {
                        for (d6.i iVar : d0Var.f3863b.E) {
                            d6.q qVar = iVar.f5779a.e;
                            if (qVar != null) {
                                try {
                                    d6.o oVar = (d6.o) qVar;
                                    Parcel P0 = oVar.P0();
                                    P0.writeInt(i10);
                                    oVar.T0(P0, 2);
                                } catch (RemoteException e) {
                                    d6.c.f5763m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", d6.q.class.getSimpleName());
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
