package hh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

public final class m1 implements Runnable {

    public final int f9704a = 0;

    public final i5 f9705b;

    public final TLRPC.TL_error f9706c;
    public final TwoStepVerificationActivity d;

    public final TLObject f9707e;

    public m1(i5 i5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f9705b = i5Var;
        this.f9706c = tL_error;
        this.f9707e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f9704a) {
            case 0:
                i5 i5Var = this.f9705b;
                i5Var.getClass();
                if (this.f9706c == null) {
                    TL_account.Password password = (TL_account.Password) this.f9707e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    i5Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                i5.W0(this.f9705b, this.f9706c, this.f9707e, twoStepVerificationActivity2);
                break;
        }
    }

    public m1(i5 i5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f9705b = i5Var;
        this.f9706c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f9707e = tLObject;
    }
}
