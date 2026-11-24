package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class be2 implements ee, ac7, xe7 {
    public final byte a;
    public final ke2 b;

    public be2(ke2 ke2Var, byte b) {
        this.a = b;
        this.b = ke2Var;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        ke2 ke2Var = this.b;
        switch (b) {
            case 2:
                ke2Var.q0(false);
                return true;
            case 3:
                ke2Var.q0(false);
                return true;
            default:
                return ke2Var.n0(tL_error);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        TLRPC.TL_chatAdminRights e0;
        byte b = this.a;
        ke2 ke2Var = this.b;
        switch (b) {
            case 0:
                ke2Var.o0(true);
                return;
            case 1:
                ke2 ke2Var2 = this.b;
                ke2Var2.q0(true);
                de2 de2Var = new de2(ke2Var2, (byte) 0);
                if (!ke2Var2.L && !ke2Var2.M) {
                    ke2Var2.getMessagesController().k(ke2Var2.x.id, ke2Var2.w, ke2Var2.Z0, ke2Var2, true, de2Var, new be2(ke2Var2, (byte) 3));
                    return;
                }
                oc7 messagesController = ke2Var2.getMessagesController();
                long j = ke2Var2.x.id;
                TLRPC.User user = ke2Var2.w;
                if (ke2Var2.L) {
                    e0 = ke2Var2.N;
                } else {
                    e0 = ke2.e0(false);
                }
                messagesController.X4(j, user, e0, ke2Var2.T, false, ke2Var2, ke2Var2.a1, ke2Var2.L, ke2Var2.Z0, de2Var, new be2(ke2Var2, (byte) 2));
                return;
            case 2:
            case 3:
            default:
                ke2Var.getClass();
                ke2Var.presentFragment(new p5c(6, null));
                return;
            case 4:
                ke2Var.finishFragment();
                return;
            case 5:
                ke2Var.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                x92 x92Var = new x92(ke2Var, twoStepVerificationActivity, (byte) 4);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = x92Var;
                ke2Var.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public final void run(long j) {
        this.b.m0(j);
    }
}
