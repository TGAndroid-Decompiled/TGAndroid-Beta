package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class egd implements Runnable {
    public final byte a;
    public final ugd b;
    public final int c;

    public egd(ugd ugdVar, int i, byte b) {
        this.a = b;
        this.b = ugdVar;
        this.c = i;
    }

    private final void a() {
        ugd ugdVar = this.b;
        bhd bhdVar = ugdVar.c;
        bhdVar.y = -1;
        bhdVar.z = -1;
        bhdVar.u = null;
        bhdVar.v = null;
        bhdVar.w = 0.0d;
        bhdVar.j();
        bhdVar.x = false;
        bhdVar.A = null;
        bhd bhdVar2 = ugdVar.c;
        bhdVar2.G = (byte) 1;
        int i = this.c;
        synchronized (bhdVar2.F) {
            for (l7d l7dVar : ugdVar.c.F) {
                had hadVar = l7dVar.a.e;
                if (hadVar != null) {
                    try {
                        ot2 ot2Var = new ot2(i, null, null);
                        w9d w9dVar = (w9d) hadVar;
                        Parcel R = w9dVar.R();
                        kid.c(R, ot2Var);
                        w9dVar.V(R, 3);
                    } catch (RemoteException e) {
                        me1.m.a(e, "Unable to call %s on %s.", "onDisconnected", had.class.getSimpleName());
                    }
                }
            }
        }
        ugdVar.c.h();
        bhd bhdVar3 = ugdVar.c;
        u76 u76Var = fk3.U(bhdVar3.g, bhdVar3.l, "castDeviceControllerListenerKey").b;
        ite.i(u76Var, "Key must not be null");
        bhdVar3.c(u76Var, 8415);
    }

    private final void b() {
        ugd ugdVar = this.b;
        int i = this.c;
        bhd bhdVar = ugdVar.c;
        if (i == 0) {
            bhdVar.G = (byte) 2;
            bhdVar.n = true;
            bhdVar.o = true;
            synchronized (bhdVar.F) {
                for (l7d l7dVar : ugdVar.c.F) {
                    l7dVar.a();
                }
            }
            return;
        }
        bhdVar.G = (byte) 1;
        synchronized (bhdVar.F) {
            for (l7d l7dVar2 : ugdVar.c.F) {
                had hadVar = l7dVar2.a.e;
                if (hadVar != null) {
                    try {
                        ot2 ot2Var = new ot2(i, null, null);
                        w9d w9dVar = (w9d) hadVar;
                        Parcel R = w9dVar.R();
                        kid.c(R, ot2Var);
                        w9dVar.V(R, 3);
                    } catch (RemoteException e) {
                        me1.m.a(e, "Unable to call %s on %s.", "onConnectionFailed", had.class.getSimpleName());
                    }
                }
            }
        }
        ugdVar.c.h();
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.b.c.E.b(this.c);
                return;
            default:
                ugd ugdVar = this.b;
                bhd bhdVar = ugdVar.c;
                bhdVar.G = (byte) 3;
                int i = this.c;
                synchronized (bhdVar.F) {
                    for (l7d l7dVar : ugdVar.c.F) {
                        had hadVar = l7dVar.a.e;
                        if (hadVar != null) {
                            try {
                                w9d w9dVar = (w9d) hadVar;
                                Parcel R = w9dVar.R();
                                R.writeInt(i);
                                w9dVar.V(R, 2);
                            } catch (RemoteException e) {
                                me1.m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", had.class.getSimpleName());
                            }
                        }
                    }
                }
                return;
        }
    }
}
