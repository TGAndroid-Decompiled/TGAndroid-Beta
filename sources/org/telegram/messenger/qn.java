package org.telegram.messenger;
public final class qn implements Runnable {
    public final int f26427a;
    public final mp f26428b;

    public qn(mp mpVar, int i7) {
        this.f26427a = i7;
        this.f26428b = mpVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26427a;
        mp mpVar = this.f26428b;
        switch (i7) {
            case 0:
                mpVar.getNotificationCenter().k(2, 8192);
                return;
            case 1:
                mpVar.f25662h2 = false;
                return;
            case 2:
                mpVar.getNotificationCenter().k(2, 8192);
                return;
            case 3:
                mpVar.getNotificationCenter().k(2, 4);
                return;
            case 4:
                mpVar.S1.clear();
                mpVar.T1.b();
                mpVar.U1.clear();
                mpVar.V1.clear();
                mpVar.f25643f1.clear();
                mpVar.f25652g1.clear();
                mpVar.f25661h1.clear();
                mpVar.f25615c1.b();
                mpVar.f25624d1.b();
                mpVar.f25669i1 = 0L;
                mpVar.f25677j1 = 0L;
                mpVar.f25685k1 = 0L;
                mpVar.f25780v0.clear();
                mpVar.f25790w0.clear();
                mpVar.f25670i2 = false;
                mpVar.f25728p2 = null;
                mpVar.f25737q2 = null;
                return;
            case 5:
                a8.b("cleanup: isUpdating = false");
                mpVar.getConnectionsManager().setIsUpdating(false);
                mpVar.X0.b();
                mpVar.Y0.clear();
                mpVar.f25595a1.b();
                mpVar.Z0.clear();
                mpVar.A0.clear();
                mpVar.B0.b();
                mpVar.C0.clear();
                mpVar.D0.b();
                return;
            case 6:
                mpVar.getNotificationCenter().k(188, new Object[0]);
                mpVar.getNotificationCenter().k(184, new Object[0]);
                mpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 7:
                mpVar.r4();
                return;
            case 8:
                mpVar.getNotificationCenter().k(2, 4);
                return;
            case 9:
                mpVar.f25702m2 = false;
                return;
            case 10:
                x10 x10Var = mpVar.N7;
                if (x10Var != null) {
                    x10Var.a(Boolean.TRUE);
                    mpVar.N7 = null;
                    return;
                }
                return;
            case 11:
                mpVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                x10 x10Var2 = mpVar.N7;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    mpVar.N7 = null;
                    return;
                }
                return;
            default:
                x10 x10Var3 = mpVar.N7;
                if (x10Var3 != null) {
                    x10Var3.a(Boolean.FALSE);
                    mpVar.N7 = null;
                    return;
                }
                return;
        }
    }
}
