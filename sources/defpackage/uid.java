package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class uid implements Runnable {
    public final byte a;
    public final kjd b;
    public final int c;

    public uid(kjd kjdVar, int i, byte b) {
        this.a = b;
        this.b = kjdVar;
        this.c = i;
    }

    private final void a() {
        kjd kjdVar = this.b;
        rjd rjdVar = kjdVar.c;
        rjdVar.y = -1;
        rjdVar.z = -1;
        rjdVar.u = null;
        rjdVar.v = null;
        rjdVar.w = 0.0d;
        rjdVar.j();
        rjdVar.x = false;
        rjdVar.A = null;
        rjd rjdVar2 = kjdVar.c;
        rjdVar2.G = (byte) 1;
        int i = this.c;
        synchronized (rjdVar2.F) {
            for (cad cadVar : kjdVar.c.F) {
                ycd ycdVar = cadVar.a.e;
                if (ycdVar != null) {
                    try {
                        ws2 ws2Var = new ws2(i, null, null);
                        ncd ncdVar = (ncd) ycdVar;
                        Parcel R = ncdVar.R();
                        ald.c(R, ws2Var);
                        ncdVar.V(R, 3);
                    } catch (RemoteException e) {
                        md1.m.a(e, "Unable to call %s on %s.", "onDisconnected", ycd.class.getSimpleName());
                    }
                }
            }
        }
        kjdVar.c.h();
        rjd rjdVar3 = kjdVar.c;
        y76 y76Var = aj3.T(rjdVar3.g, rjdVar3.l, "castDeviceControllerListenerKey").b;
        xve.i(y76Var, "Key must not be null");
        rjdVar3.c(y76Var, 8415);
    }

    private final void b() {
        kjd kjdVar = this.b;
        int i = this.c;
        rjd rjdVar = kjdVar.c;
        if (i == 0) {
            rjdVar.G = (byte) 2;
            rjdVar.n = true;
            rjdVar.o = true;
            synchronized (rjdVar.F) {
                for (cad cadVar : kjdVar.c.F) {
                    cadVar.a();
                }
            }
            return;
        }
        rjdVar.G = (byte) 1;
        synchronized (rjdVar.F) {
            for (cad cadVar2 : kjdVar.c.F) {
                ycd ycdVar = cadVar2.a.e;
                if (ycdVar != null) {
                    try {
                        ws2 ws2Var = new ws2(i, null, null);
                        ncd ncdVar = (ncd) ycdVar;
                        Parcel R = ncdVar.R();
                        ald.c(R, ws2Var);
                        ncdVar.V(R, 3);
                    } catch (RemoteException e) {
                        md1.m.a(e, "Unable to call %s on %s.", "onConnectionFailed", ycd.class.getSimpleName());
                    }
                }
            }
        }
        kjdVar.c.h();
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
                kjd kjdVar = this.b;
                rjd rjdVar = kjdVar.c;
                rjdVar.G = (byte) 3;
                int i = this.c;
                synchronized (rjdVar.F) {
                    for (cad cadVar : kjdVar.c.F) {
                        ycd ycdVar = cadVar.a.e;
                        if (ycdVar != null) {
                            try {
                                ncd ncdVar = (ncd) ycdVar;
                                Parcel R = ncdVar.R();
                                R.writeInt(i);
                                ncdVar.V(R, 2);
                            } catch (RemoteException e) {
                                md1.m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", ycd.class.getSimpleName());
                            }
                        }
                    }
                }
                return;
        }
    }
}
