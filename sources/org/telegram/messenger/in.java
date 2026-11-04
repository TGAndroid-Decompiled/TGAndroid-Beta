package org.telegram.messenger;
public final class in implements Runnable {
    public final int f23561a;
    public final hp f23562b;

    public in(hp hpVar, int i3) {
        this.f23561a = i3;
        this.f23562b = hpVar;
    }

    @Override
    public final void run() {
        int i3 = this.f23561a;
        hp hpVar = this.f23562b;
        switch (i3) {
            case 0:
                hpVar.getMessagesController().T4(null);
                hpVar.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 1:
                hpVar.f23004f2 = false;
                return;
            case 2:
                hpVar.getNotificationCenter().k(2, 8192);
                return;
            case 3:
                hpVar.getNotificationCenter().k(2, 524288);
                hpVar.i5();
                return;
            case 4:
                hpVar.getNotificationCenter().k(2, 4);
                return;
            case 5:
                hpVar.Q1.clear();
                hpVar.R1.b();
                hpVar.S1.clear();
                hpVar.T1.clear();
                hpVar.f23003f1.clear();
                hpVar.f23012g1.clear();
                hpVar.f23020h1.clear();
                hpVar.f22975c1.b();
                hpVar.f22983d1.b();
                hpVar.f23028i1 = 0L;
                hpVar.f23036j1 = 0L;
                hpVar.k1 = 0L;
                hpVar.f23140v0.clear();
                hpVar.f23150w0.clear();
                hpVar.f23013g2 = false;
                hpVar.f23071n2 = null;
                hpVar.f23079o2 = null;
                return;
            case 6:
                a8.b("cleanup: isUpdating = false");
                hpVar.getConnectionsManager().setIsUpdating(false);
                hpVar.X0.b();
                hpVar.Y0.clear();
                hpVar.f22955a1.b();
                hpVar.Z0.clear();
                hpVar.A0.clear();
                hpVar.B0.b();
                hpVar.C0.clear();
                hpVar.D0.b();
                return;
            case 7:
                hpVar.getNotificationCenter().k(186, new Object[0]);
                hpVar.getNotificationCenter().k(184, new Object[0]);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                hpVar.j4();
                return;
            case 9:
                hpVar.getNotificationCenter().k(2, 4);
                return;
            case 10:
                u10 u10Var = hpVar.H7;
                if (u10Var != null) {
                    u10Var.a(Boolean.TRUE);
                    hpVar.H7 = null;
                    return;
                }
                return;
            case 11:
                hpVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                u10 u10Var2 = hpVar.H7;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    hpVar.H7 = null;
                    return;
                }
                return;
            default:
                u10 u10Var3 = hpVar.H7;
                if (u10Var3 != null) {
                    u10Var3.a(Boolean.FALSE);
                    hpVar.H7 = null;
                    return;
                }
                return;
        }
    }
}
