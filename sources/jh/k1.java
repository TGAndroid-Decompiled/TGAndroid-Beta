package jh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k1 implements Runnable {
    public final int f12354a = 0;
    public final h5 f12355b;
    public final TLRPC.TL_error f12356c;
    public final TwoStepVerificationActivity d;
    public final TLObject f12357e;

    public k1(h5 h5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f12355b = h5Var;
        this.f12356c = tL_error;
        this.f12357e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f12354a) {
            case 0:
                h5 h5Var = this.f12355b;
                h5Var.getClass();
                if (this.f12356c == null) {
                    TL_account.Password password = (TL_account.Password) this.f12357e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    h5Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                h5.W0(this.f12355b, this.f12356c, this.f12357e, twoStepVerificationActivity2);
                return;
        }
    }

    public k1(h5 h5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f12355b = h5Var;
        this.f12356c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f12357e = tLObject;
    }
}
