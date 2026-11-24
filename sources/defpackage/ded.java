package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class ded implements Runnable {
    public final byte a;
    public final ted b;
    public final int c;

    public ded(ted tedVar, int i, byte b) {
        this.a = b;
        this.b = tedVar;
        this.c = i;
    }

    private final void a() {
        ted tedVar = this.b;
        afd afdVar = tedVar.c;
        afdVar.y = -1;
        afdVar.z = -1;
        afdVar.u = null;
        afdVar.v = null;
        afdVar.w = 0.0d;
        afdVar.j();
        afdVar.x = false;
        afdVar.A = null;
        afd afdVar2 = tedVar.c;
        afdVar2.G = (byte) 1;
        int i = this.c;
        synchronized (afdVar2.F) {
            for (j5d j5dVar : tedVar.c.F) {
                f8d f8dVar = j5dVar.a.e;
                if (f8dVar != null) {
                    try {
                        ds2 ds2Var = new ds2(i, null, null);
                        u7d u7dVar = (u7d) f8dVar;
                        Parcel R = u7dVar.R();
                        jgd.c(R, ds2Var);
                        u7dVar.V(R, 3);
                    } catch (RemoteException e) {
                        ed1.m.a(e, "Unable to call %s on %s.", "onDisconnected", f8d.class.getSimpleName());
                    }
                }
            }
        }
        tedVar.c.h();
        afd afdVar3 = tedVar.c;
        u56 u56Var = s34.w(afdVar3.g, afdVar3.l, "castDeviceControllerListenerKey").b;
        fre.i(u56Var, "Key must not be null");
        afdVar3.c(u56Var, 8415);
    }

    private final void b() {
        ted tedVar = this.b;
        int i = this.c;
        afd afdVar = tedVar.c;
        if (i == 0) {
            afdVar.G = (byte) 2;
            afdVar.n = true;
            afdVar.o = true;
            synchronized (afdVar.F) {
                for (j5d j5dVar : tedVar.c.F) {
                    j5dVar.a();
                }
            }
            return;
        }
        afdVar.G = (byte) 1;
        synchronized (afdVar.F) {
            for (j5d j5dVar2 : tedVar.c.F) {
                f8d f8dVar = j5dVar2.a.e;
                if (f8dVar != null) {
                    try {
                        ds2 ds2Var = new ds2(i, null, null);
                        u7d u7dVar = (u7d) f8dVar;
                        Parcel R = u7dVar.R();
                        jgd.c(R, ds2Var);
                        u7dVar.V(R, 3);
                    } catch (RemoteException e) {
                        ed1.m.a(e, "Unable to call %s on %s.", "onConnectionFailed", f8d.class.getSimpleName());
                    }
                }
            }
        }
        tedVar.c.h();
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
                ted tedVar = this.b;
                afd afdVar = tedVar.c;
                afdVar.G = (byte) 3;
                int i = this.c;
                synchronized (afdVar.F) {
                    for (j5d j5dVar : tedVar.c.F) {
                        f8d f8dVar = j5dVar.a.e;
                        if (f8dVar != null) {
                            try {
                                u7d u7dVar = (u7d) f8dVar;
                                Parcel R = u7dVar.R();
                                R.writeInt(i);
                                u7dVar.V(R, 2);
                            } catch (RemoteException e) {
                                ed1.m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", f8d.class.getSimpleName());
                            }
                        }
                    }
                }
                return;
        }
    }
}
