package org.telegram.messenger;
public final class eo implements Runnable {
    public final int f15437a;
    public final vp f15438b;

    public eo(vp vpVar, int i10) {
        this.f15437a = i10;
        this.f15438b = vpVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15437a;
        vp vpVar = this.f15438b;
        switch (i10) {
            case 0:
                vpVar.f18773e2 = false;
                return;
            case 1:
                vpVar.getNotificationCenter().k(2, 8192);
                return;
            case 2:
                vpVar.getNotificationCenter().k(2, 524288);
                vpVar.f5();
                return;
            case 3:
                vpVar.getNotificationCenter().k(2, 4);
                return;
            case 4:
                vpVar.getNotificationCenter().k(2, 4);
                return;
            case 5:
                vpVar.P1.clear();
                vpVar.Q1.b();
                vpVar.R1.clear();
                vpVar.S1.clear();
                vpVar.f18772e1.clear();
                vpVar.f18781f1.clear();
                vpVar.f18789g1.clear();
                vpVar.f18744b1.b();
                vpVar.f18754c1.b();
                vpVar.f18798h1 = 0L;
                vpVar.f18807i1 = 0L;
                vpVar.f18816j1 = 0L;
                vpVar.f18912u0.clear();
                vpVar.f18921v0.clear();
                vpVar.f18782f2 = false;
                vpVar.f18841m2 = null;
                vpVar.f18851n2 = null;
                return;
            case 6:
                f8.b("cleanup: isUpdating = false");
                vpVar.getConnectionsManager().setIsUpdating(false);
                vpVar.W0.b();
                vpVar.X0.clear();
                vpVar.Z0.b();
                vpVar.Y0.clear();
                vpVar.f18959z0.clear();
                vpVar.A0.b();
                vpVar.B0.clear();
                vpVar.C0.b();
                return;
            case 7:
                vpVar.getNotificationCenter().k(186, new Object[0]);
                vpVar.getNotificationCenter().k(184, new Object[0]);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                vpVar.g4();
                return;
            case 9:
                vpVar.f18817j2 = false;
                return;
            case 10:
                q20 q20Var = vpVar.I7;
                if (q20Var != null) {
                    q20Var.a(Boolean.TRUE);
                    vpVar.I7 = null;
                    return;
                }
                return;
            case 11:
                vpVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                q20 q20Var2 = vpVar.I7;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    vpVar.I7 = null;
                    return;
                }
                return;
            default:
                q20 q20Var3 = vpVar.I7;
                if (q20Var3 != null) {
                    q20Var3.a(Boolean.FALSE);
                    vpVar.I7 = null;
                    return;
                }
                return;
        }
    }
}
