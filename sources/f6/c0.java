package f6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f11361a;
    public final d0 f11362b;
    public final int f11363c;

    public c0(d0 d0Var, int i7, int i10) {
        this.f11361a = i10;
        this.f11362b = d0Var;
        this.f11363c = i7;
    }

    private final void a() {
        d0 d0Var = this.f11362b;
        e0 e0Var = d0Var.f11371b;
        e0Var.f11387y = -1;
        e0Var.f11388z = -1;
        e0Var.f11384u = null;
        e0Var.v = null;
        e0Var.f11385w = 0.0d;
        e0Var.j();
        e0Var.f11386x = false;
        e0Var.A = null;
        e0 e0Var2 = d0Var.f11371b;
        e0Var2.G = 1;
        int i7 = this.f11363c;
        synchronized (e0Var2.F) {
            try {
                for (g6.i iVar : d0Var.f11371b.F) {
                    g6.q qVar = iVar.f13219a.f13204e;
                    if (qVar != null) {
                        try {
                            n6.a aVar = new n6.a(i7, null, null);
                            g6.o oVar = (g6.o) qVar;
                            Parcel p12 = oVar.p1();
                            com.google.android.gms.internal.cast.t.c(p12, aVar);
                            oVar.t1(p12, 3);
                        } catch (RemoteException e10) {
                            g6.c.f13202m.a(e10, "Unable to call %s on %s.", "onDisconnected", g6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f11371b.h();
        e0 e0Var3 = d0Var.f11371b;
        com.google.android.gms.common.api.internal.m mVar = d6.i.p(e0Var3.f6384g, e0Var3.f11375l, "castDeviceControllerListenerKey").f6331b;
        q6.m.i(mVar, "Key must not be null");
        e0Var3.c(mVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f11362b;
        int i7 = this.f11363c;
        if (i7 == 0) {
            e0 e0Var = d0Var.f11371b;
            e0Var.G = 2;
            e0Var.f11377n = true;
            e0Var.f11378o = true;
            synchronized (e0Var.F) {
                try {
                    for (g6.i iVar : d0Var.f11371b.F) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f11371b;
        e0Var2.G = 1;
        synchronized (e0Var2.F) {
            try {
            } catch (RemoteException e10) {
                g6.c.f13202m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", g6.q.class.getSimpleName());
            } finally {
            }
            for (g6.i iVar2 : d0Var.f11371b.F) {
                g6.q qVar = iVar2.f13219a.f13204e;
                if (qVar != null) {
                    n6.a aVar = new n6.a(i7, null, null);
                    g6.o oVar = (g6.o) qVar;
                    Parcel p12 = oVar.p1();
                    com.google.android.gms.internal.cast.t.c(p12, aVar);
                    oVar.t1(p12, 3);
                }
            }
        }
        d0Var.f11371b.h();
    }

    @Override
    public final void run() {
        switch (this.f11361a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f11362b.f11371b.E.b(this.f11363c);
                return;
            default:
                d0 d0Var = this.f11362b;
                e0 e0Var = d0Var.f11371b;
                e0Var.G = 3;
                int i7 = this.f11363c;
                synchronized (e0Var.F) {
                    try {
                        for (g6.i iVar : d0Var.f11371b.F) {
                            g6.q qVar = iVar.f13219a.f13204e;
                            if (qVar != null) {
                                try {
                                    g6.o oVar = (g6.o) qVar;
                                    Parcel p12 = oVar.p1();
                                    p12.writeInt(i7);
                                    oVar.t1(p12, 2);
                                } catch (RemoteException e10) {
                                    g6.c.f13202m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", g6.q.class.getSimpleName());
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
