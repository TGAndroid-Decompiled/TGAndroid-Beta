package lh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k1 implements Runnable {
    public final int f12678a = 0;
    public final g5 f12679b;
    public final TLRPC.TL_error f12680c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;

    public k1(g5 g5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f12679b = g5Var;
        this.f12680c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f12678a) {
            case 0:
                g5 g5Var = this.f12679b;
                g5Var.getClass();
                if (this.f12680c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    g5Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                g5.W0(this.f12679b, this.f12680c, this.e, twoStepVerificationActivity2);
                return;
        }
    }

    public k1(g5 g5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f12679b = g5Var;
        this.f12680c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}
