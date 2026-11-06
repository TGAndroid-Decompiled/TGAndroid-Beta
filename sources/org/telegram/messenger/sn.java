package org.telegram.messenger;
public final class sn implements Runnable {
    public final int f25489a;
    public final qp f25490b;

    public sn(qp qpVar, int i7) {
        this.f25489a = i7;
        this.f25490b = qpVar;
    }

    @Override
    public final void run() {
        int i7 = this.f25489a;
        qp qpVar = this.f25490b;
        switch (i7) {
            case 0:
                qpVar.getMessagesController().T4(null);
                qpVar.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 1:
                qpVar.f24754e2 = false;
                return;
            case 2:
                qpVar.getNotificationCenter().k(2, 8192);
                return;
            case 3:
                qpVar.getNotificationCenter().k(2, 524288);
                qpVar.i5();
                return;
            case 4:
                qpVar.getNotificationCenter().k(2, 4);
                return;
            case 5:
                qpVar.P1.clear();
                qpVar.Q1.b();
                qpVar.R1.clear();
                qpVar.S1.clear();
                qpVar.f24753e1.clear();
                qpVar.f24763f1.clear();
                qpVar.f24772g1.clear();
                qpVar.f24725b1.b();
                qpVar.f24735c1.b();
                qpVar.f24781h1 = 0L;
                qpVar.f24789i1 = 0L;
                qpVar.f24797j1 = 0L;
                qpVar.f24891u0.clear();
                qpVar.f24900v0.clear();
                qpVar.f24764f2 = false;
                qpVar.f24822m2 = null;
                qpVar.f24831n2 = null;
                return;
            case 6:
                a8.b("cleanup: isUpdating = false");
                qpVar.getConnectionsManager().setIsUpdating(false);
                qpVar.W0.b();
                qpVar.X0.clear();
                qpVar.Z0.b();
                qpVar.Y0.clear();
                qpVar.f24939z0.clear();
                qpVar.A0.b();
                qpVar.B0.clear();
                qpVar.C0.b();
                return;
            case 7:
                qpVar.getNotificationCenter().k(186, new Object[0]);
                qpVar.getNotificationCenter().k(184, new Object[0]);
                qpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                qpVar.j4();
                return;
            case 9:
                qpVar.getNotificationCenter().k(2, 4);
                return;
            case 10:
                c20 c20Var = qpVar.H7;
                if (c20Var != null) {
                    c20Var.a(Boolean.TRUE);
                    qpVar.H7 = null;
                    return;
                }
                return;
            case 11:
                qpVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                c20 c20Var2 = qpVar.H7;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    qpVar.H7 = null;
                    return;
                }
                return;
            default:
                c20 c20Var3 = qpVar.H7;
                if (c20Var3 != null) {
                    c20Var3.a(Boolean.FALSE);
                    qpVar.H7 = null;
                    return;
                }
                return;
        }
    }
}
