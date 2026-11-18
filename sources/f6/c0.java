package f6;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f11370a;
    public final d0 f11371b;
    public final int f11372c;

    public c0(d0 d0Var, int i7, int i10) {
        this.f11370a = i10;
        this.f11371b = d0Var;
        this.f11372c = i7;
    }

    private final void a() {
        d0 d0Var = this.f11371b;
        e0 e0Var = d0Var.f11380b;
        e0Var.f11396y = -1;
        e0Var.f11397z = -1;
        e0Var.f11393u = null;
        e0Var.v = null;
        e0Var.f11394w = 0.0d;
        e0Var.j();
        e0Var.f11395x = false;
        e0Var.A = null;
        e0 e0Var2 = d0Var.f11380b;
        e0Var2.G = 1;
        int i7 = this.f11372c;
        synchronized (e0Var2.F) {
            try {
                for (g6.i iVar : d0Var.f11380b.F) {
                    g6.q qVar = iVar.f13228a.f13213e;
                    if (qVar != null) {
                        try {
                            n6.a aVar = new n6.a(i7, null, null);
                            g6.o oVar = (g6.o) qVar;
                            Parcel p12 = oVar.p1();
                            com.google.android.gms.internal.cast.t.c(p12, aVar);
                            oVar.t1(p12, 3);
                        } catch (RemoteException e10) {
                            g6.c.f13211m.a(e10, "Unable to call %s on %s.", "onDisconnected", g6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f11380b.h();
        e0 e0Var3 = d0Var.f11380b;
        com.google.android.gms.common.api.internal.m mVar = d6.i.o(e0Var3.f6393g, e0Var3.f11384l, "castDeviceControllerListenerKey").f6338b;
        q6.m.i(mVar, "Key must not be null");
        e0Var3.c(mVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f11371b;
        int i7 = this.f11372c;
        if (i7 == 0) {
            e0 e0Var = d0Var.f11380b;
            e0Var.G = 2;
            e0Var.f11386n = true;
            e0Var.f11387o = true;
            synchronized (e0Var.F) {
                try {
                    for (g6.i iVar : d0Var.f11380b.F) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f11380b;
        e0Var2.G = 1;
        synchronized (e0Var2.F) {
            try {
            } catch (RemoteException e10) {
                g6.c.f13211m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", g6.q.class.getSimpleName());
            } finally {
            }
            for (g6.i iVar2 : d0Var.f11380b.F) {
                g6.q qVar = iVar2.f13228a.f13213e;
                if (qVar != null) {
                    n6.a aVar = new n6.a(i7, null, null);
                    g6.o oVar = (g6.o) qVar;
                    Parcel p12 = oVar.p1();
                    com.google.android.gms.internal.cast.t.c(p12, aVar);
                    oVar.t1(p12, 3);
                }
            }
        }
        d0Var.f11380b.h();
    }

    @Override
    public final void run() {
        switch (this.f11370a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f11371b.f11380b.E.b(this.f11372c);
                return;
            default:
                d0 d0Var = this.f11371b;
                e0 e0Var = d0Var.f11380b;
                e0Var.G = 3;
                int i7 = this.f11372c;
                synchronized (e0Var.F) {
                    try {
                        for (g6.i iVar : d0Var.f11380b.F) {
                            g6.q qVar = iVar.f13228a.f13213e;
                            if (qVar != null) {
                                try {
                                    g6.o oVar = (g6.o) qVar;
                                    Parcel p12 = oVar.p1();
                                    p12.writeInt(i7);
                                    oVar.t1(p12, 2);
                                } catch (RemoteException e10) {
                                    g6.c.f13211m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", g6.q.class.getSimpleName());
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
