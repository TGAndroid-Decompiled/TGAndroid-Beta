package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class qc2 implements ed, z97, vc7 {
    public final byte a;
    public final zc2 b;

    public qc2(zc2 zc2Var, byte b) {
        this.a = b;
        this.b = zc2Var;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        zc2 zc2Var = this.b;
        switch (b) {
            case 2:
                zc2Var.p0(false);
                return true;
            case 3:
                zc2Var.p0(false);
                return true;
            default:
                return zc2Var.m0(tL_error);
        }
    }

    @Override
    public final void run(long j) {
        this.b.l0(j);
    }

    @Override
    public final void u(hd hdVar, int i) {
        TLRPC.TL_chatAdminRights d0;
        byte b = this.a;
        zc2 zc2Var = this.b;
        switch (b) {
            case 0:
                zc2Var.n0(true);
                return;
            case 1:
                zc2 zc2Var2 = this.b;
                zc2Var2.p0(true);
                sc2 sc2Var = new sc2(zc2Var2, (byte) 0);
                if (!zc2Var2.L && !zc2Var2.M) {
                    zc2Var2.getMessagesController().j(zc2Var2.x.id, zc2Var2.w, 0, zc2Var2.Z0, zc2Var2, true, sc2Var, new qc2(zc2Var2, (byte) 3), null);
                    return;
                }
                na7 messagesController = zc2Var2.getMessagesController();
                long j = zc2Var2.x.id;
                TLRPC.User user = zc2Var2.w;
                if (zc2Var2.L) {
                    d0 = zc2Var2.N;
                } else {
                    d0 = zc2.d0(false);
                }
                messagesController.V4(j, user, d0, zc2Var2.T, false, zc2Var2, zc2Var2.a1, zc2Var2.L, zc2Var2.Z0, sc2Var, new qc2(zc2Var2, (byte) 2));
                return;
            case 2:
            case 3:
            default:
                zc2Var.getClass();
                zc2Var.presentFragment(new p3c(6, null));
                return;
            case 4:
                zc2Var.finishFragment();
                return;
            case 5:
                zc2Var.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                v82 v82Var = new v82(zc2Var, twoStepVerificationActivity, (byte) 3);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = v82Var;
                zc2Var.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
