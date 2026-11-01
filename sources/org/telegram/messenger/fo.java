package org.telegram.messenger;
public final class fo implements Runnable {
    public final int f15778a;
    public final wp f15779b;

    public fo(wp wpVar, int i10) {
        this.f15778a = i10;
        this.f15779b = wpVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15778a;
        wp wpVar = this.f15779b;
        switch (i10) {
            case 0:
                wpVar.f19116e2 = false;
                return;
            case 1:
                wpVar.getNotificationCenter().k(2, 8192);
                return;
            case 2:
                wpVar.getNotificationCenter().k(2, 524288);
                wpVar.f5();
                return;
            case 3:
                wpVar.getNotificationCenter().k(2, 4);
                return;
            case 4:
                wpVar.getNotificationCenter().k(2, 4);
                return;
            case 5:
                wpVar.P1.clear();
                wpVar.Q1.b();
                wpVar.R1.clear();
                wpVar.S1.clear();
                wpVar.f19115e1.clear();
                wpVar.f19124f1.clear();
                wpVar.f19132g1.clear();
                wpVar.f19087b1.b();
                wpVar.f19097c1.b();
                wpVar.f19141h1 = 0L;
                wpVar.f19150i1 = 0L;
                wpVar.f19159j1 = 0L;
                wpVar.f19255u0.clear();
                wpVar.f19264v0.clear();
                wpVar.f19125f2 = false;
                wpVar.f19184m2 = null;
                wpVar.f19194n2 = null;
                return;
            case 6:
                f8.b("cleanup: isUpdating = false");
                wpVar.getConnectionsManager().setIsUpdating(false);
                wpVar.W0.b();
                wpVar.X0.clear();
                wpVar.Z0.b();
                wpVar.Y0.clear();
                wpVar.f19302z0.clear();
                wpVar.A0.b();
                wpVar.B0.clear();
                wpVar.C0.b();
                return;
            case 7:
                wpVar.getNotificationCenter().k(186, new Object[0]);
                wpVar.getNotificationCenter().k(184, new Object[0]);
                wpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                wpVar.g4();
                return;
            case 9:
                wpVar.f19160j2 = false;
                return;
            case 10:
                r20 r20Var = wpVar.I7;
                if (r20Var != null) {
                    r20Var.a(Boolean.TRUE);
                    wpVar.I7 = null;
                    return;
                }
                return;
            case 11:
                wpVar.getNotificationCenter().k(184, new Object[0]);
                return;
            case 12:
                r20 r20Var2 = wpVar.I7;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.TRUE);
                    wpVar.I7 = null;
                    return;
                }
                return;
            default:
                r20 r20Var3 = wpVar.I7;
                if (r20Var3 != null) {
                    r20Var3.a(Boolean.FALSE);
                    wpVar.I7 = null;
                    return;
                }
                return;
        }
    }
}
