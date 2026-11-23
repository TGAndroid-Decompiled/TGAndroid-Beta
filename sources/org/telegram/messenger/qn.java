package org.telegram.messenger;
public final class qn implements Runnable {
    public final int f26539a;
    public final mp f26540b;

    public qn(mp mpVar, int i7) {
        this.f26539a = i7;
        this.f26540b = mpVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26539a;
        mp mpVar = this.f26540b;
        switch (i7) {
            case 0:
                mpVar.getNotificationCenter().k(2, 8192);
                return;
            case 1:
                mpVar.f25757h2 = false;
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
                mpVar.f25738f1.clear();
                mpVar.f25747g1.clear();
                mpVar.f25756h1.clear();
                mpVar.f25710c1.b();
                mpVar.f25719d1.b();
                mpVar.f25764i1 = 0L;
                mpVar.f25772j1 = 0L;
                mpVar.f25780k1 = 0L;
                mpVar.f25875v0.clear();
                mpVar.f25885w0.clear();
                mpVar.f25765i2 = false;
                mpVar.f25823p2 = null;
                mpVar.f25832q2 = null;
                return;
            case 5:
                a8.b("cleanup: isUpdating = false");
                mpVar.getConnectionsManager().setIsUpdating(false);
                mpVar.X0.b();
                mpVar.Y0.clear();
                mpVar.f25690a1.b();
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
                mpVar.f25797m2 = false;
                return;
            case 10:
                w10 w10Var = mpVar.N7;
                if (w10Var != null) {
                    w10Var.a(Boolean.TRUE);
                    mpVar.N7 = null;
                    return;
                }
                return;
            case 11:
                mpVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                w10 w10Var2 = mpVar.N7;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    mpVar.N7 = null;
                    return;
                }
                return;
            default:
                w10 w10Var3 = mpVar.N7;
                if (w10Var3 != null) {
                    w10Var3.a(Boolean.FALSE);
                    mpVar.N7 = null;
                    return;
                }
                return;
        }
    }
}
