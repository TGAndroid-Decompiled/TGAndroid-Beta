package f6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f11399a;
    public final d0 f11400b;
    public final int f11401c;

    public c0(d0 d0Var, int i7, int i10) {
        this.f11399a = i10;
        this.f11400b = d0Var;
        this.f11401c = i7;
    }

    private final void a() {
        d0 d0Var = this.f11400b;
        e0 e0Var = d0Var.f11409b;
        e0Var.f11425y = -1;
        e0Var.f11426z = -1;
        e0Var.f11422u = null;
        e0Var.v = null;
        e0Var.f11423w = 0.0d;
        e0Var.j();
        e0Var.f11424x = false;
        e0Var.A = null;
        e0 e0Var2 = d0Var.f11409b;
        e0Var2.G = 1;
        int i7 = this.f11401c;
        synchronized (e0Var2.F) {
            try {
                for (g6.i iVar : d0Var.f11409b.F) {
                    g6.q qVar = iVar.f13257a.f13242e;
                    if (qVar != null) {
                        try {
                            n6.a aVar = new n6.a(i7, null, null);
                            g6.o oVar = (g6.o) qVar;
                            Parcel p12 = oVar.p1();
                            com.google.android.gms.internal.cast.t.c(p12, aVar);
                            oVar.t1(p12, 3);
                        } catch (RemoteException e10) {
                            g6.c.f13240m.a(e10, "Unable to call %s on %s.", "onDisconnected", g6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f11409b.h();
        e0 e0Var3 = d0Var.f11409b;
        com.google.android.gms.common.api.internal.m mVar = d6.i.o(e0Var3.f6422g, e0Var3.f11413l, "castDeviceControllerListenerKey").f6367b;
        q6.m.i(mVar, "Key must not be null");
        e0Var3.c(mVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f11400b;
        int i7 = this.f11401c;
        if (i7 == 0) {
            e0 e0Var = d0Var.f11409b;
            e0Var.G = 2;
            e0Var.f11415n = true;
            e0Var.f11416o = true;
            synchronized (e0Var.F) {
                try {
                    for (g6.i iVar : d0Var.f11409b.F) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f11409b;
        e0Var2.G = 1;
        synchronized (e0Var2.F) {
            try {
            } catch (RemoteException e10) {
                g6.c.f13240m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", g6.q.class.getSimpleName());
            } finally {
            }
            for (g6.i iVar2 : d0Var.f11409b.F) {
                g6.q qVar = iVar2.f13257a.f13242e;
                if (qVar != null) {
                    n6.a aVar = new n6.a(i7, null, null);
                    g6.o oVar = (g6.o) qVar;
                    Parcel p12 = oVar.p1();
                    com.google.android.gms.internal.cast.t.c(p12, aVar);
                    oVar.t1(p12, 3);
                }
            }
        }
        d0Var.f11409b.h();
    }

    @Override
    public final void run() {
        switch (this.f11399a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f11400b.f11409b.E.b(this.f11401c);
                return;
            default:
                d0 d0Var = this.f11400b;
                e0 e0Var = d0Var.f11409b;
                e0Var.G = 3;
                int i7 = this.f11401c;
                synchronized (e0Var.F) {
                    try {
                        for (g6.i iVar : d0Var.f11409b.F) {
                            g6.q qVar = iVar.f13257a.f13242e;
                            if (qVar != null) {
                                try {
                                    g6.o oVar = (g6.o) qVar;
                                    Parcel p12 = oVar.p1();
                                    p12.writeInt(i7);
                                    oVar.t1(p12, 2);
                                } catch (RemoteException e10) {
                                    g6.c.f13240m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", g6.q.class.getSimpleName());
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
