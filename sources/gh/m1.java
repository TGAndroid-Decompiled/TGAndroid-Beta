package gh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class m1 implements Runnable {
    public final int f8531a = 0;
    public final k5 f8532b;
    public final TLRPC.TL_error f8533c;
    public final TwoStepVerificationActivity d;
    public final TLObject f8534e;

    public m1(k5 k5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f8532b = k5Var;
        this.f8533c = tL_error;
        this.f8534e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8531a) {
            case 0:
                k5 k5Var = this.f8532b;
                k5Var.getClass();
                if (this.f8533c == null) {
                    TL_account.Password password = (TL_account.Password) this.f8534e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    k5Var.M1(twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                k5.W0(this.f8532b, this.f8533c, this.f8534e, twoStepVerificationActivity2);
                return;
        }
    }

    public m1(k5 k5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f8532b = k5Var;
        this.f8533c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f8534e = tLObject;
    }
}
