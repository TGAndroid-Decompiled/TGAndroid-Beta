package c6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f4333a;
    public final d0 f4334b;
    public final int f4335c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f4333a = i11;
        this.f4334b = d0Var;
        this.f4335c = i10;
    }

    private final void a() {
        d0 d0Var = this.f4334b;
        e0 e0Var = d0Var.f4343b;
        e0Var.f4359x = -1;
        e0Var.f4360y = -1;
        e0Var.f4356t = null;
        e0Var.f4357u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f4358w = false;
        e0Var.f4361z = null;
        e0 e0Var2 = d0Var.f4343b;
        e0Var2.F = 1;
        int i10 = this.f4335c;
        synchronized (e0Var2.E) {
            try {
                for (d6.i iVar : d0Var.f4343b.E) {
                    d6.q qVar = iVar.f8195a.f8180e;
                    if (qVar != null) {
                        try {
                            k6.a aVar = new k6.a(i10);
                            d6.o oVar = (d6.o) qVar;
                            Parcel N0 = oVar.N0();
                            com.google.android.gms.internal.cast.v.c(N0, aVar);
                            oVar.R0(N0, 3);
                        } catch (RemoteException e7) {
                            d6.c.f8178m.a(e7, "Unable to call %s on %s.", "onDisconnected", d6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f4343b.h();
        e0 e0Var3 = d0Var.f4343b;
        com.google.android.gms.common.api.internal.n nVar = a6.i.N(e0Var3.f6728f, e0Var3.f4347k, "castDeviceControllerListenerKey").f6655c;
        n6.l.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f4334b;
        int i10 = this.f4335c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f4343b;
            e0Var.F = 2;
            e0Var.f4349m = true;
            e0Var.f4350n = true;
            synchronized (e0Var.E) {
                try {
                    for (d6.i iVar : d0Var.f4343b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f4343b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e7) {
                d6.c.f8178m.a(e7, "Unable to call %s on %s.", "onConnectionFailed", d6.q.class.getSimpleName());
            } finally {
            }
            for (d6.i iVar2 : d0Var.f4343b.E) {
                d6.q qVar = iVar2.f8195a.f8180e;
                if (qVar != null) {
                    k6.a aVar = new k6.a(i10);
                    d6.o oVar = (d6.o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.v.c(N0, aVar);
                    oVar.R0(N0, 3);
                }
            }
        }
        d0Var.f4343b.h();
    }

    @Override
    public final void run() {
        switch (this.f4333a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f4334b.f4343b.D.b(this.f4335c);
                return;
            default:
                d0 d0Var = this.f4334b;
                e0 e0Var = d0Var.f4343b;
                e0Var.F = 3;
                int i10 = this.f4335c;
                synchronized (e0Var.E) {
                    try {
                        for (d6.i iVar : d0Var.f4343b.E) {
                            d6.q qVar = iVar.f8195a.f8180e;
                            if (qVar != null) {
                                try {
                                    d6.o oVar = (d6.o) qVar;
                                    Parcel N0 = oVar.N0();
                                    N0.writeInt(i10);
                                    oVar.R0(N0, 2);
                                } catch (RemoteException e7) {
                                    d6.c.f8178m.a(e7, "Unable to call %s on %s.", "onConnectionSuspended", d6.q.class.getSimpleName());
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
