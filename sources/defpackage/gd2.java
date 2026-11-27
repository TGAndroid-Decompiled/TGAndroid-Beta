package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class gd2 implements fd, gc7, ef7 {
    public final byte a;
    public final pd2 b;

    public gd2(pd2 pd2Var, byte b) {
        this.a = b;
        this.b = pd2Var;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        pd2 pd2Var = this.b;
        switch (b) {
            case 2:
                pd2Var.p0(false);
                return true;
            case 3:
                pd2Var.p0(false);
                return true;
            default:
                return pd2Var.m0(tL_error);
        }
    }

    @Override
    public final void run(long j) {
        this.b.l0(j);
    }

    @Override
    public final void w(id idVar, int i) {
        TLRPC.TL_chatAdminRights d0;
        byte b = this.a;
        pd2 pd2Var = this.b;
        switch (b) {
            case 0:
                pd2Var.n0(true);
                return;
            case 1:
                pd2 pd2Var2 = this.b;
                pd2Var2.p0(true);
                id2 id2Var = new id2(pd2Var2, (byte) 0);
                if (!pd2Var2.L && !pd2Var2.M) {
                    pd2Var2.getMessagesController().k(pd2Var2.x.id, pd2Var2.w, pd2Var2.Z0, pd2Var2, true, id2Var, new gd2(pd2Var2, (byte) 3));
                    return;
                }
                uc7 messagesController = pd2Var2.getMessagesController();
                long j = pd2Var2.x.id;
                TLRPC.User user = pd2Var2.w;
                if (pd2Var2.L) {
                    d0 = pd2Var2.N;
                } else {
                    d0 = pd2.d0(false);
                }
                messagesController.d5(j, user, d0, pd2Var2.T, false, pd2Var2, pd2Var2.a1, pd2Var2.L, pd2Var2.Z0, id2Var, new gd2(pd2Var2, (byte) 2));
                return;
            case 2:
            case 3:
            default:
                pd2Var.getClass();
                pd2Var.presentFragment(new o7c(6, null));
                return;
            case 4:
                pd2Var.finishFragment();
                return;
            case 5:
                pd2Var.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                q72 q72Var = new q72(pd2Var, twoStepVerificationActivity, (byte) 5);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = q72Var;
                pd2Var.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
