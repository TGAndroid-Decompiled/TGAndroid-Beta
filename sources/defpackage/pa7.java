package defpackage;
public final class pa7 implements Runnable {
    public final byte a;
    public final uc7 b;

    public pa7(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.p3();
                return;
            case 1:
                uc7Var.p3();
                return;
            case 2:
                uc7Var.getMessagesStorage().q1(false);
                hl.c3(new pa7(uc7Var, (byte) 10));
                return;
            case 3:
                uc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 4:
                uc7Var.X1 = false;
                return;
            case 5:
                uc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 6:
                uc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 7:
                uc7Var.G(true);
                return;
            case 8:
                uc7Var.X1 = false;
                return;
            case 9:
                uc7Var.L(true);
                return;
            case 10:
                uc7Var.getMessagesController().h5(null);
                uc7Var.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 11:
                uc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 12:
                uc7Var.getNotificationCenter().k(2, 4);
                return;
            case 13:
                uc7Var.I1.clear();
                uc7Var.J1.b();
                uc7Var.K1.clear();
                uc7Var.L1.clear();
                uc7Var.V0.clear();
                uc7Var.W0.clear();
                uc7Var.X0.clear();
                uc7Var.S0.b();
                uc7Var.T0.b();
                uc7Var.Y0 = 0L;
                uc7Var.Z0 = 0L;
                uc7Var.a1 = 0L;
                uc7Var.l0.clear();
                uc7Var.m0.clear();
                uc7Var.Y1 = false;
                uc7Var.f2 = null;
                uc7Var.g2 = null;
                return;
            case 14:
                cc4.b("cleanup: isUpdating = false");
                uc7Var.getConnectionsManager().setIsUpdating(false);
                uc7Var.N0.b();
                uc7Var.O0.clear();
                uc7Var.Q0.b();
                uc7Var.P0.clear();
                uc7Var.q0.clear();
                uc7Var.r0.b();
                uc7Var.s0.clear();
                uc7Var.t0.b();
                return;
            case 15:
                uc7Var.getNotificationCenter().k(189, new Object[0]);
                uc7Var.getNotificationCenter().k(185, new Object[0]);
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 16:
                uc7Var.u4();
                return;
            case 17:
                uc7Var.getNotificationCenter().k(2, 4);
                return;
            default:
                uc7Var.c2 = false;
                return;
        }
    }
}
