package org.telegram.messenger;
public final class pn implements Runnable {
    public final int f25959a;
    public final np f25960b;

    public pn(np npVar, int i7) {
        this.f25959a = i7;
        this.f25960b = npVar;
    }

    @Override
    public final void run() {
        int i7 = this.f25959a;
        np npVar = this.f25960b;
        switch (i7) {
            case 0:
                npVar.I(true);
                return;
            case 1:
                npVar.getMessagesController().U4(null);
                npVar.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                npVar.f25278f2 = false;
                return;
            case 3:
                npVar.getNotificationCenter().k(2, 8192);
                return;
            case 4:
                npVar.getNotificationCenter().k(2, 4);
                return;
            case 5:
                npVar.Q1.clear();
                npVar.R1.b();
                npVar.S1.clear();
                npVar.T1.clear();
                npVar.f25277f1.clear();
                npVar.f25286g1.clear();
                npVar.f25295h1.clear();
                npVar.f25249c1.b();
                npVar.f25258d1.b();
                npVar.f25303i1 = 0L;
                npVar.f25311j1 = 0L;
                npVar.f25319k1 = 0L;
                npVar.f25414v0.clear();
                npVar.f25424w0.clear();
                npVar.f25287g2 = false;
                npVar.f25345n2 = null;
                npVar.f25354o2 = null;
                return;
            case 6:
                a8.b("cleanup: isUpdating = false");
                npVar.getConnectionsManager().setIsUpdating(false);
                npVar.X0.b();
                npVar.Y0.clear();
                npVar.f25229a1.b();
                npVar.Z0.clear();
                npVar.A0.clear();
                npVar.B0.b();
                npVar.C0.clear();
                npVar.D0.b();
                return;
            case 7:
                npVar.getNotificationCenter().k(186, new Object[0]);
                npVar.getNotificationCenter().k(184, new Object[0]);
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                npVar.j4();
                return;
            case 9:
                npVar.getNotificationCenter().k(2, 4);
                return;
            case 10:
                z10 z10Var = npVar.I7;
                if (z10Var != null) {
                    z10Var.a(Boolean.TRUE);
                    npVar.I7 = null;
                    return;
                }
                return;
            case 11:
                npVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                z10 z10Var2 = npVar.I7;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    npVar.I7 = null;
                    return;
                }
                return;
            default:
                z10 z10Var3 = npVar.I7;
                if (z10Var3 != null) {
                    z10Var3.a(Boolean.FALSE);
                    npVar.I7 = null;
                    return;
                }
                return;
        }
    }
}
