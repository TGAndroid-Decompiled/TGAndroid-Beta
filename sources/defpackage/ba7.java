package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ba7 implements Runnable {
    public final byte a;
    public final oc7 b;

    public ba7(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.getNotificationCenter().k(2, 64);
                return;
            case 1:
                oc7Var.l3();
                return;
            case 2:
                TLRPC.Dialog dialog = oc7Var.q2;
                if (dialog != null) {
                    long j = dialog.id;
                    if (j < 0) {
                        TLRPC.Chat L0 = oc7Var.L0(Long.valueOf(-j));
                        if (sd2.r0(L0) || L0.restricted) {
                            oc7Var.k4(oc7Var.q2);
                        }
                    } else {
                        oc7Var.k4(dialog);
                    }
                    oc7Var.q2 = null;
                    oc7Var.b5(null);
                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 3:
                oc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 4:
                oc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 5:
                oc7Var.E(true);
                return;
            case 6:
                oc7Var.X1 = false;
                return;
            case 7:
                oc7Var.getMessagesController().b5(null);
                oc7Var.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 8:
                oc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 9:
                oc7Var.X1 = false;
                return;
            case 10:
                oc7Var.J(true);
                return;
            case 11:
                oc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 12:
                oc7Var.getNotificationCenter().k(2, 4);
                return;
            case 13:
                oc7Var.I1.clear();
                oc7Var.J1.b();
                oc7Var.K1.clear();
                oc7Var.L1.clear();
                oc7Var.V0.clear();
                oc7Var.W0.clear();
                oc7Var.X0.clear();
                oc7Var.S0.b();
                oc7Var.T0.b();
                oc7Var.Y0 = 0L;
                oc7Var.Z0 = 0L;
                oc7Var.a1 = 0L;
                oc7Var.l0.clear();
                oc7Var.m0.clear();
                oc7Var.Y1 = false;
                oc7Var.f2 = null;
                oc7Var.g2 = null;
                return;
            case 14:
                fc4.b("cleanup: isUpdating = false");
                oc7Var.getConnectionsManager().setIsUpdating(false);
                oc7Var.N0.b();
                oc7Var.O0.clear();
                oc7Var.Q0.b();
                oc7Var.P0.clear();
                oc7Var.q0.clear();
                oc7Var.r0.b();
                oc7Var.s0.clear();
                oc7Var.t0.b();
                return;
            case 15:
                oc7Var.getNotificationCenter().k(189, new Object[0]);
                oc7Var.getNotificationCenter().k(185, new Object[0]);
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 16:
                oc7Var.getNotificationCenter().k(2, 4);
                return;
            case 17:
                oc7Var.o4();
                return;
            default:
                oc7Var.getNotificationCenter().k(47, new Object[0]);
                oc7Var.getNotificationCenter().k(2, 2);
                oc7Var.getUserConfig().u(true);
                return;
        }
    }
}
