package org.telegram.messenger;
public final class pn implements Runnable {
    public final int f25957a;
    public final np f25958b;

    public pn(np npVar, int i7) {
        this.f25957a = i7;
        this.f25958b = npVar;
    }

    @Override
    public final void run() {
        int i7 = this.f25957a;
        np npVar = this.f25958b;
        switch (i7) {
            case 0:
                npVar.I(true);
                return;
            case 1:
                npVar.getMessagesController().U4(null);
                npVar.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                npVar.f25275f2 = false;
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
                npVar.f25274f1.clear();
                npVar.f25283g1.clear();
                npVar.f25292h1.clear();
                npVar.f25246c1.b();
                npVar.f25255d1.b();
                npVar.f25300i1 = 0L;
                npVar.f25308j1 = 0L;
                npVar.f25316k1 = 0L;
                npVar.f25411v0.clear();
                npVar.f25421w0.clear();
                npVar.f25284g2 = false;
                npVar.f25342n2 = null;
                npVar.f25351o2 = null;
                return;
            case 6:
                a8.b("cleanup: isUpdating = false");
                npVar.getConnectionsManager().setIsUpdating(false);
                npVar.X0.b();
                npVar.Y0.clear();
                npVar.f25226a1.b();
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
