package mh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j1 implements Runnable {
    public final int f14287a = 0;
    public final g5 f14288b;
    public final TLRPC.TL_error f14289c;
    public final TwoStepVerificationActivity d;
    public final TLObject f14290e;

    public j1(g5 g5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f14288b = g5Var;
        this.f14289c = tL_error;
        this.f14290e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f14287a) {
            case 0:
                g5 g5Var = this.f14288b;
                g5Var.getClass();
                if (this.f14289c == null) {
                    TL_account.Password password = (TL_account.Password) this.f14290e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    g5Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                g5.W0(this.f14288b, this.f14289c, this.f14290e, twoStepVerificationActivity2);
                return;
        }
    }

    public j1(g5 g5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f14288b = g5Var;
        this.f14289c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f14290e = tLObject;
    }
}
