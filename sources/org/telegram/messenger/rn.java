package org.telegram.messenger;
public final class rn implements Runnable {
    public final int f26638a;
    public final np f26639b;

    public rn(np npVar, int i7) {
        this.f26638a = i7;
        this.f26639b = npVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26638a;
        np npVar = this.f26639b;
        switch (i7) {
            case 0:
                npVar.getNotificationCenter().k(2, 8192);
                return;
            case 1:
                npVar.f25861h2 = false;
                return;
            case 2:
                npVar.getNotificationCenter().k(2, 8192);
                return;
            case 3:
                npVar.getNotificationCenter().k(2, 4);
                return;
            case 4:
                npVar.S1.clear();
                npVar.T1.b();
                npVar.U1.clear();
                npVar.V1.clear();
                npVar.f25842f1.clear();
                npVar.f25851g1.clear();
                npVar.f25860h1.clear();
                npVar.f25814c1.b();
                npVar.f25823d1.b();
                npVar.f25868i1 = 0L;
                npVar.f25876j1 = 0L;
                npVar.f25884k1 = 0L;
                npVar.f25979v0.clear();
                npVar.f25989w0.clear();
                npVar.f25869i2 = false;
                npVar.f25927p2 = null;
                npVar.f25936q2 = null;
                return;
            case 5:
                a8.b("cleanup: isUpdating = false");
                npVar.getConnectionsManager().setIsUpdating(false);
                npVar.X0.b();
                npVar.Y0.clear();
                npVar.f25794a1.b();
                npVar.Z0.clear();
                npVar.A0.clear();
                npVar.B0.b();
                npVar.C0.clear();
                npVar.D0.b();
                return;
            case 6:
                npVar.getNotificationCenter().k(188, new Object[0]);
                npVar.getNotificationCenter().k(184, new Object[0]);
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 7:
                npVar.r4();
                return;
            case 8:
                npVar.getNotificationCenter().k(2, 4);
                return;
            case 9:
                npVar.f25901m2 = false;
                return;
            case 10:
                y10 y10Var = npVar.N7;
                if (y10Var != null) {
                    y10Var.a(Boolean.TRUE);
                    npVar.N7 = null;
                    return;
                }
                return;
            case 11:
                npVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                y10 y10Var2 = npVar.N7;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    npVar.N7 = null;
                    return;
                }
                return;
            default:
                y10 y10Var3 = npVar.N7;
                if (y10Var3 != null) {
                    y10Var3.a(Boolean.FALSE);
                    npVar.N7 = null;
                    return;
                }
                return;
        }
    }
}
