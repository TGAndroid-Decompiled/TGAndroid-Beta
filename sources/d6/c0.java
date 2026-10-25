package d6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f8051a;
    public final d0 f8052b;
    public final int f8053c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f8051a = i11;
        this.f8052b = d0Var;
        this.f8053c = i10;
    }

    private final void a() {
        d0 d0Var = this.f8052b;
        e0 e0Var = d0Var.f8060b;
        e0Var.f8076x = -1;
        e0Var.f8077y = -1;
        e0Var.f8073t = null;
        e0Var.f8074u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f8075w = false;
        e0Var.f8078z = null;
        e0 e0Var2 = d0Var.f8060b;
        e0Var2.F = 1;
        int i10 = this.f8053c;
        synchronized (e0Var2.E) {
            try {
                for (e6.i iVar : d0Var.f8060b.E) {
                    e6.q qVar = iVar.f9819a.e;
                    if (qVar != null) {
                        try {
                            l6.a aVar = new l6.a(i10);
                            e6.o oVar = (e6.o) qVar;
                            Parcel N0 = oVar.N0();
                            com.google.android.gms.internal.cast.t.c(N0, aVar);
                            oVar.R0(N0, 3);
                        } catch (RemoteException e) {
                            e6.c.f9803m.a(e, "Unable to call %s on %s.", "onDisconnected", e6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f8060b.h();
        e0 e0Var3 = d0Var.f8060b;
        com.google.android.gms.common.api.internal.n nVar = za.c.l(e0Var3.f6655f, e0Var3.f8064k, "castDeviceControllerListenerKey").f6599c;
        o6.l.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f8052b;
        int i10 = this.f8053c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f8060b;
            e0Var.F = 2;
            e0Var.f8066m = true;
            e0Var.f8067n = true;
            synchronized (e0Var.E) {
                try {
                    for (e6.i iVar : d0Var.f8060b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f8060b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e) {
                e6.c.f9803m.a(e, "Unable to call %s on %s.", "onConnectionFailed", e6.q.class.getSimpleName());
            } finally {
            }
            for (e6.i iVar2 : d0Var.f8060b.E) {
                e6.q qVar = iVar2.f9819a.e;
                if (qVar != null) {
                    l6.a aVar = new l6.a(i10);
                    e6.o oVar = (e6.o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.t.c(N0, aVar);
                    oVar.R0(N0, 3);
                }
            }
        }
        d0Var.f8060b.h();
    }

    @Override
    public final void run() {
        switch (this.f8051a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f8052b.f8060b.D.b(this.f8053c);
                return;
            default:
                d0 d0Var = this.f8052b;
                e0 e0Var = d0Var.f8060b;
                e0Var.F = 3;
                int i10 = this.f8053c;
                synchronized (e0Var.E) {
                    try {
                        for (e6.i iVar : d0Var.f8060b.E) {
                            e6.q qVar = iVar.f9819a.e;
                            if (qVar != null) {
                                try {
                                    e6.o oVar = (e6.o) qVar;
                                    Parcel N0 = oVar.N0();
                                    N0.writeInt(i10);
                                    oVar.R0(N0, 2);
                                } catch (RemoteException e) {
                                    e6.c.f9803m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", e6.q.class.getSimpleName());
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
