package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class f2 implements Runnable {
    public final int f1272a = 1;
    public final k7 f1273b;
    public final TLObject f1274c;
    public final TwoStepVerificationActivity d;
    public final boolean e;
    public final TLRPC.TL_error f1275f;

    public f2(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f1273b = k7Var;
        this.f1274c = tLObject;
        this.d = twoStepVerificationActivity;
        this.e = z10;
        this.f1275f = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f1272a) {
            case 0:
                if (this.f1275f == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.f1274c;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    this.f1273b.C2(twoStepVerificationActivity.l0(), twoStepVerificationActivity, this.e);
                    return;
                }
                return;
            default:
                k7.e0(this.f1273b, this.f1274c, this.d, this.e, this.f1275f);
                return;
        }
    }

    public f2(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f1273b = k7Var;
        this.f1275f = tL_error;
        this.d = twoStepVerificationActivity;
        this.f1274c = tLObject;
        this.e = z10;
    }
}
