package org.telegram.messenger;
public final class qn implements Runnable {
    public final int f26429a;
    public final mp f26430b;

    public qn(mp mpVar, int i7) {
        this.f26429a = i7;
        this.f26430b = mpVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26429a;
        mp mpVar = this.f26430b;
        switch (i7) {
            case 0:
                mpVar.getNotificationCenter().k(2, 8192);
                return;
            case 1:
                mpVar.f25664h2 = false;
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
                mpVar.f25645f1.clear();
                mpVar.f25654g1.clear();
                mpVar.f25663h1.clear();
                mpVar.f25617c1.b();
                mpVar.f25626d1.b();
                mpVar.f25671i1 = 0L;
                mpVar.f25679j1 = 0L;
                mpVar.f25687k1 = 0L;
                mpVar.f25782v0.clear();
                mpVar.f25792w0.clear();
                mpVar.f25672i2 = false;
                mpVar.f25730p2 = null;
                mpVar.f25739q2 = null;
                return;
            case 5:
                a8.b("cleanup: isUpdating = false");
                mpVar.getConnectionsManager().setIsUpdating(false);
                mpVar.X0.b();
                mpVar.Y0.clear();
                mpVar.f25597a1.b();
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
                mpVar.f25704m2 = false;
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
