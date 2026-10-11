package c6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f4332a;
    public final d0 f4333b;
    public final int f4334c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f4332a = i11;
        this.f4333b = d0Var;
        this.f4334c = i10;
    }

    private final void a() {
        d0 d0Var = this.f4333b;
        e0 e0Var = d0Var.f4342b;
        e0Var.f4358x = -1;
        e0Var.f4359y = -1;
        e0Var.f4355t = null;
        e0Var.f4356u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f4357w = false;
        e0Var.f4360z = null;
        e0 e0Var2 = d0Var.f4342b;
        e0Var2.F = 1;
        int i10 = this.f4334c;
        synchronized (e0Var2.E) {
            try {
                for (d6.i iVar : d0Var.f4342b.E) {
                    d6.q qVar = iVar.f8194a.f8179e;
                    if (qVar != null) {
                        try {
                            k6.a aVar = new k6.a(i10);
                            d6.o oVar = (d6.o) qVar;
                            Parcel N0 = oVar.N0();
                            com.google.android.gms.internal.cast.v.c(N0, aVar);
                            oVar.R0(N0, 3);
                        } catch (RemoteException e7) {
                            d6.c.f8177m.a(e7, "Unable to call %s on %s.", "onDisconnected", d6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f4342b.h();
        e0 e0Var3 = d0Var.f4342b;
        com.google.android.gms.common.api.internal.n nVar = a6.i.u(e0Var3.f6727f, e0Var3.f4346k, "castDeviceControllerListenerKey").f6654c;
        n6.m.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f4333b;
        int i10 = this.f4334c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f4342b;
            e0Var.F = 2;
            e0Var.f4348m = true;
            e0Var.f4349n = true;
            synchronized (e0Var.E) {
                try {
                    for (d6.i iVar : d0Var.f4342b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f4342b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e7) {
                d6.c.f8177m.a(e7, "Unable to call %s on %s.", "onConnectionFailed", d6.q.class.getSimpleName());
            } finally {
            }
            for (d6.i iVar2 : d0Var.f4342b.E) {
                d6.q qVar = iVar2.f8194a.f8179e;
                if (qVar != null) {
                    k6.a aVar = new k6.a(i10);
                    d6.o oVar = (d6.o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.v.c(N0, aVar);
                    oVar.R0(N0, 3);
                }
            }
        }
        d0Var.f4342b.h();
    }

    @Override
    public final void run() {
        switch (this.f4332a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f4333b.f4342b.D.b(this.f4334c);
                return;
            default:
                d0 d0Var = this.f4333b;
                e0 e0Var = d0Var.f4342b;
                e0Var.F = 3;
                int i10 = this.f4334c;
                synchronized (e0Var.E) {
                    try {
                        for (d6.i iVar : d0Var.f4342b.E) {
                            d6.q qVar = iVar.f8194a.f8179e;
                            if (qVar != null) {
                                try {
                                    d6.o oVar = (d6.o) qVar;
                                    Parcel N0 = oVar.N0();
                                    N0.writeInt(i10);
                                    oVar.R0(N0, 2);
                                } catch (RemoteException e7) {
                                    d6.c.f8177m.a(e7, "Unable to call %s on %s.", "onConnectionSuspended", d6.q.class.getSimpleName());
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
