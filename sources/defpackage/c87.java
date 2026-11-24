package defpackage;

import org.telegram.tgnet.TLRPC;
public final class c87 implements Runnable {
    public final byte a;
    public final na7 b;

    public c87(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.getNotificationCenter().k(2, 64);
                return;
            case 1:
                TLRPC.Dialog dialog = na7Var.q2;
                if (dialog != null) {
                    long j = dialog.id;
                    if (j < 0) {
                        TLRPC.Chat K0 = na7Var.K0(Long.valueOf(-j));
                        if (hc2.r0(K0) || K0.restricted) {
                            na7Var.i4(na7Var.q2);
                        }
                    } else {
                        na7Var.i4(dialog);
                    }
                    na7Var.q2 = null;
                    na7Var.Z4(null);
                    na7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 2:
                na7Var.j3();
                return;
            case 3:
                na7Var.getNotificationCenter().k(2, 8192);
                return;
            case 4:
                na7Var.getNotificationCenter().k(2, 8192);
                return;
            case 5:
                na7Var.E(true);
                return;
            case 6:
                na7Var.X1 = false;
                return;
            case 7:
                na7Var.getMessagesController().Z4(null);
                na7Var.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 8:
                na7Var.getNotificationCenter().k(2, 8192);
                return;
            case 9:
                na7Var.X1 = false;
                return;
            case 10:
                na7Var.getNotificationCenter().k(2, 8192);
                return;
            case 11:
                na7Var.J(true);
                return;
            case 12:
                na7Var.getNotificationCenter().k(2, 4);
                return;
            case 13:
                na7Var.I1.clear();
                na7Var.J1.b();
                na7Var.K1.clear();
                na7Var.L1.clear();
                na7Var.V0.clear();
                na7Var.W0.clear();
                na7Var.X0.clear();
                na7Var.S0.b();
                na7Var.T0.b();
                na7Var.Y0 = 0L;
                na7Var.Z0 = 0L;
                na7Var.a1 = 0L;
                na7Var.l0.clear();
                na7Var.m0.clear();
                na7Var.Y1 = false;
                na7Var.f2 = null;
                na7Var.g2 = null;
                return;
            case 14:
                fa4.b("cleanup: isUpdating = false");
                na7Var.getConnectionsManager().setIsUpdating(false);
                na7Var.N0.b();
                na7Var.O0.clear();
                na7Var.Q0.b();
                na7Var.P0.clear();
                na7Var.q0.clear();
                na7Var.r0.b();
                na7Var.s0.clear();
                na7Var.t0.b();
                return;
            case 15:
                na7Var.getNotificationCenter().k(188, new Object[0]);
                na7Var.getNotificationCenter().k(184, new Object[0]);
                na7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 16:
                na7Var.m4();
                return;
            case 17:
                na7Var.getNotificationCenter().k(2, 4);
                return;
            default:
                na7Var.getNotificationCenter().k(46, new Object[0]);
                na7Var.getNotificationCenter().k(2, 2);
                na7Var.getUserConfig().u(true);
                return;
        }
    }
}
