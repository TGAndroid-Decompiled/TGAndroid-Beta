package mh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j1 implements Runnable {
    public final int f14285a = 0;
    public final g5 f14286b;
    public final TLRPC.TL_error f14287c;
    public final TwoStepVerificationActivity d;
    public final TLObject f14288e;

    public j1(g5 g5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f14286b = g5Var;
        this.f14287c = tL_error;
        this.f14288e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f14285a) {
            case 0:
                g5 g5Var = this.f14286b;
                g5Var.getClass();
                if (this.f14287c == null) {
                    TL_account.Password password = (TL_account.Password) this.f14288e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    g5Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                g5.W0(this.f14286b, this.f14287c, this.f14288e, twoStepVerificationActivity2);
                return;
        }
    }

    public j1(g5 g5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f14286b = g5Var;
        this.f14287c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f14288e = tLObject;
    }
}
