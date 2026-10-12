package c6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f4331a;
    public final d0 f4332b;
    public final int f4333c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f4331a = i11;
        this.f4332b = d0Var;
        this.f4333c = i10;
    }

    private final void a() {
        d0 d0Var = this.f4332b;
        e0 e0Var = d0Var.f4341b;
        e0Var.f4357x = -1;
        e0Var.f4358y = -1;
        e0Var.f4354t = null;
        e0Var.f4355u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f4356w = false;
        e0Var.f4359z = null;
        e0 e0Var2 = d0Var.f4341b;
        e0Var2.F = 1;
        int i10 = this.f4333c;
        synchronized (e0Var2.E) {
            try {
                for (d6.i iVar : d0Var.f4341b.E) {
                    d6.q qVar = iVar.f8192a.f8177e;
                    if (qVar != null) {
                        try {
                            k6.a aVar = new k6.a(i10);
                            d6.o oVar = (d6.o) qVar;
                            Parcel N0 = oVar.N0();
                            com.google.android.gms.internal.cast.v.c(N0, aVar);
                            oVar.R0(N0, 3);
                        } catch (RemoteException e7) {
                            d6.c.f8175m.a(e7, "Unable to call %s on %s.", "onDisconnected", d6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f4341b.h();
        e0 e0Var3 = d0Var.f4341b;
        com.google.android.gms.common.api.internal.n nVar = a6.i.s(e0Var3.f6726f, e0Var3.f4345k, "castDeviceControllerListenerKey").f6653c;
        n6.m.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f4332b;
        int i10 = this.f4333c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f4341b;
            e0Var.F = 2;
            e0Var.f4347m = true;
            e0Var.f4348n = true;
            synchronized (e0Var.E) {
                try {
                    for (d6.i iVar : d0Var.f4341b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f4341b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e7) {
                d6.c.f8175m.a(e7, "Unable to call %s on %s.", "onConnectionFailed", d6.q.class.getSimpleName());
            } finally {
            }
            for (d6.i iVar2 : d0Var.f4341b.E) {
                d6.q qVar = iVar2.f8192a.f8177e;
                if (qVar != null) {
                    k6.a aVar = new k6.a(i10);
                    d6.o oVar = (d6.o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.v.c(N0, aVar);
                    oVar.R0(N0, 3);
                }
            }
        }
        d0Var.f4341b.h();
    }

    @Override
    public final void run() {
        switch (this.f4331a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f4332b.f4341b.D.b(this.f4333c);
                return;
            default:
                d0 d0Var = this.f4332b;
                e0 e0Var = d0Var.f4341b;
                e0Var.F = 3;
                int i10 = this.f4333c;
                synchronized (e0Var.E) {
                    try {
                        for (d6.i iVar : d0Var.f4341b.E) {
                            d6.q qVar = iVar.f8192a.f8177e;
                            if (qVar != null) {
                                try {
                                    d6.o oVar = (d6.o) qVar;
                                    Parcel N0 = oVar.N0();
                                    N0.writeInt(i10);
                                    oVar.R0(N0, 2);
                                } catch (RemoteException e7) {
                                    d6.c.f8175m.a(e7, "Unable to call %s on %s.", "onConnectionSuspended", d6.q.class.getSimpleName());
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
