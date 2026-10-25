package bi;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class y1 implements Runnable {
    public final int f5746a = 0;
    public final h7 f5747b;
    public final TLRPC.TL_error f5748c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f5749f;

    public y1(h7 h7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f5747b = h7Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f5749f = z10;
        this.f5748c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f5746a) {
            case 0:
                h7.X0(this.f5747b, this.e, this.d, this.f5749f, this.f5748c);
                return;
            default:
                if (this.f5748c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.n0(password);
                    this.f5747b.I2(twoStepVerificationActivity.m0(), twoStepVerificationActivity, this.f5749f);
                    return;
                }
                return;
        }
    }

    public y1(h7 h7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f5747b = h7Var;
        this.f5748c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f5749f = z10;
    }
}
