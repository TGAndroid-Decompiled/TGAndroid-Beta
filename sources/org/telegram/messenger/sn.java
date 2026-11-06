package org.telegram.messenger;
public final class sn implements Runnable {
    public final int f25497a;
    public final qp f25498b;

    public sn(qp qpVar, int i7) {
        this.f25497a = i7;
        this.f25498b = qpVar;
    }

    @Override
    public final void run() {
        int i7 = this.f25497a;
        qp qpVar = this.f25498b;
        switch (i7) {
            case 0:
                qpVar.getMessagesController().T4(null);
                qpVar.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 1:
                qpVar.f24762e2 = false;
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
                qpVar.f24761e1.clear();
                qpVar.f24771f1.clear();
                qpVar.f24780g1.clear();
                qpVar.f24733b1.b();
                qpVar.f24743c1.b();
                qpVar.f24789h1 = 0L;
                qpVar.f24797i1 = 0L;
                qpVar.f24805j1 = 0L;
                qpVar.f24899u0.clear();
                qpVar.f24908v0.clear();
                qpVar.f24772f2 = false;
                qpVar.f24830m2 = null;
                qpVar.f24839n2 = null;
                return;
            case 6:
                a8.b("cleanup: isUpdating = false");
                qpVar.getConnectionsManager().setIsUpdating(false);
                qpVar.W0.b();
                qpVar.X0.clear();
                qpVar.Z0.b();
                qpVar.Y0.clear();
                qpVar.f24947z0.clear();
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
