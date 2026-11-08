package org.telegram.messenger;
public final class sn implements Runnable {
    public final int f25503a;
    public final qp f25504b;

    public sn(qp qpVar, int i7) {
        this.f25503a = i7;
        this.f25504b = qpVar;
    }

    @Override
    public final void run() {
        int i7 = this.f25503a;
        qp qpVar = this.f25504b;
        switch (i7) {
            case 0:
                qpVar.I(true);
                return;
            case 1:
                qpVar.getMessagesController().T4(null);
                qpVar.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                qpVar.f24769e2 = false;
                return;
            case 3:
                qpVar.getNotificationCenter().k(2, 8192);
                return;
            case 4:
                qpVar.getNotificationCenter().k(2, 4);
                return;
            case 5:
                qpVar.P1.clear();
                qpVar.Q1.b();
                qpVar.R1.clear();
                qpVar.S1.clear();
                qpVar.f24768e1.clear();
                qpVar.f24778f1.clear();
                qpVar.f24787g1.clear();
                qpVar.f24740b1.b();
                qpVar.f24750c1.b();
                qpVar.f24796h1 = 0L;
                qpVar.f24804i1 = 0L;
                qpVar.f24812j1 = 0L;
                qpVar.f24906u0.clear();
                qpVar.f24915v0.clear();
                qpVar.f24779f2 = false;
                qpVar.f24837m2 = null;
                qpVar.f24846n2 = null;
                return;
            case 6:
                a8.b("cleanup: isUpdating = false");
                qpVar.getConnectionsManager().setIsUpdating(false);
                qpVar.W0.b();
                qpVar.X0.clear();
                qpVar.Z0.b();
                qpVar.Y0.clear();
                qpVar.f24954z0.clear();
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
