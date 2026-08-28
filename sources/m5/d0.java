package m5;

import android.os.Parcel;
import android.os.RemoteException;
public final class d0 implements Runnable {
    public final int f17386a;
    public final e0 f17387b;
    public final int f17388c;

    public d0(e0 e0Var, int i9, int i10) {
        this.f17386a = i10;
        this.f17387b = e0Var;
        this.f17388c = i9;
    }

    private final void a() {
        e0 e0Var = this.f17387b;
        f0 f0Var = e0Var.f17392b;
        f0Var.f17405x = -1;
        f0Var.f17406y = -1;
        f0Var.f17402t = null;
        f0Var.f17403u = null;
        f0Var.v = 0.0d;
        f0Var.j();
        f0Var.f17404w = false;
        f0Var.f17407z = null;
        f0 f0Var2 = e0Var.f17392b;
        f0Var2.F = 1;
        int i9 = this.f17388c;
        synchronized (f0Var2.E) {
            try {
                for (n5.i iVar : e0Var.f17392b.E) {
                    n5.q qVar = iVar.f18495a.f18477e;
                    if (qVar != null) {
                        try {
                            u5.a aVar = new u5.a(i9);
                            n5.o oVar = (n5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.u.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e10) {
                            n5.c.f18475m.a(e10, "Unable to call %s on %s.", "onDisconnected", n5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e0Var.f17392b.h();
        f0 f0Var3 = e0Var.f17392b;
        com.google.android.gms.common.api.internal.n nVar = fa.c.D(f0Var3.f2946f, f0Var3.f17393k, "castDeviceControllerListenerKey").f2873c;
        x5.l.i(nVar, "Key must not be null");
        f0Var3.c(nVar, 8415);
    }

    private final void b() {
        e0 e0Var = this.f17387b;
        int i9 = this.f17388c;
        if (i9 == 0) {
            f0 f0Var = e0Var.f17392b;
            f0Var.F = 2;
            f0Var.f17395m = true;
            f0Var.f17396n = true;
            synchronized (f0Var.E) {
                try {
                    for (n5.i iVar : e0Var.f17392b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        f0 f0Var2 = e0Var.f17392b;
        f0Var2.F = 1;
        synchronized (f0Var2.E) {
            try {
            } catch (RemoteException e10) {
                n5.c.f18475m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", n5.q.class.getSimpleName());
            } finally {
            }
            for (n5.i iVar2 : e0Var.f17392b.E) {
                n5.q qVar = iVar2.f18495a.f18477e;
                if (qVar != null) {
                    u5.a aVar = new u5.a(i9);
                    n5.o oVar = (n5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.u.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        e0Var.f17392b.h();
    }

    @Override
    public final void run() {
        switch (this.f17386a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f17387b.f17392b.D.b(this.f17388c);
                return;
            default:
                e0 e0Var = this.f17387b;
                f0 f0Var = e0Var.f17392b;
                f0Var.F = 3;
                int i9 = this.f17388c;
                synchronized (f0Var.E) {
                    try {
                        for (n5.i iVar : e0Var.f17392b.E) {
                            n5.q qVar = iVar.f18495a.f18477e;
                            if (qVar != null) {
                                try {
                                    n5.o oVar = (n5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i9);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e10) {
                                    n5.c.f18475m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", n5.q.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
