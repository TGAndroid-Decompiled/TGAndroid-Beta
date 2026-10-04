package c6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f4282a;
    public final d0 f4283b;
    public final int f4284c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f4282a = i11;
        this.f4283b = d0Var;
        this.f4284c = i10;
    }

    private final void a() {
        d0 d0Var = this.f4283b;
        e0 e0Var = d0Var.f4292b;
        e0Var.f4308x = -1;
        e0Var.f4309y = -1;
        e0Var.f4305t = null;
        e0Var.f4306u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f4307w = false;
        e0Var.f4310z = null;
        e0 e0Var2 = d0Var.f4292b;
        e0Var2.F = 1;
        int i10 = this.f4284c;
        synchronized (e0Var2.E) {
            try {
                for (d6.i iVar : d0Var.f4292b.E) {
                    d6.q qVar = iVar.f8145a.f8130e;
                    if (qVar != null) {
                        try {
                            k6.a aVar = new k6.a(i10);
                            d6.o oVar = (d6.o) qVar;
                            Parcel O0 = oVar.O0();
                            com.google.android.gms.internal.cast.v.c(O0, aVar);
                            oVar.S0(O0, 3);
                        } catch (RemoteException e7) {
                            d6.c.f8128m.a(e7, "Unable to call %s on %s.", "onDisconnected", d6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f4292b.h();
        e0 e0Var3 = d0Var.f4292b;
        com.google.android.gms.common.api.internal.n nVar = xa.c.D(e0Var3.f6675f, e0Var3.f4296k, "castDeviceControllerListenerKey").f6602c;
        n6.l.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f4283b;
        int i10 = this.f4284c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f4292b;
            e0Var.F = 2;
            e0Var.f4298m = true;
            e0Var.f4299n = true;
            synchronized (e0Var.E) {
                try {
                    for (d6.i iVar : d0Var.f4292b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f4292b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e7) {
                d6.c.f8128m.a(e7, "Unable to call %s on %s.", "onConnectionFailed", d6.q.class.getSimpleName());
            } finally {
            }
            for (d6.i iVar2 : d0Var.f4292b.E) {
                d6.q qVar = iVar2.f8145a.f8130e;
                if (qVar != null) {
                    k6.a aVar = new k6.a(i10);
                    d6.o oVar = (d6.o) qVar;
                    Parcel O0 = oVar.O0();
                    com.google.android.gms.internal.cast.v.c(O0, aVar);
                    oVar.S0(O0, 3);
                }
            }
        }
        d0Var.f4292b.h();
    }

    @Override
    public final void run() {
        switch (this.f4282a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f4283b.f4292b.D.b(this.f4284c);
                return;
            default:
                d0 d0Var = this.f4283b;
                e0 e0Var = d0Var.f4292b;
                e0Var.F = 3;
                int i10 = this.f4284c;
                synchronized (e0Var.E) {
                    try {
                        for (d6.i iVar : d0Var.f4292b.E) {
                            d6.q qVar = iVar.f8145a.f8130e;
                            if (qVar != null) {
                                try {
                                    d6.o oVar = (d6.o) qVar;
                                    Parcel O0 = oVar.O0();
                                    O0.writeInt(i10);
                                    oVar.S0(O0, 2);
                                } catch (RemoteException e7) {
                                    d6.c.f8128m.a(e7, "Unable to call %s on %s.", "onConnectionSuspended", d6.q.class.getSimpleName());
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
