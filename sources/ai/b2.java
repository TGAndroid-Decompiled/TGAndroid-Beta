package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b2 implements Runnable {
    public final int f1024a = 0;
    public final l7 f1025b;
    public final TLRPC.TL_error f1026c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f1027f;

    public b2(l7 l7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f1025b = l7Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f1027f = z10;
        this.f1026c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f1024a) {
            case 0:
                l7.Y0(this.f1025b, this.e, this.d, this.f1027f, this.f1026c);
                return;
            default:
                if (this.f1026c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    this.f1025b.J2(twoStepVerificationActivity.l0(), twoStepVerificationActivity, this.f1027f);
                    return;
                }
                return;
        }
    }

    public b2(l7 l7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f1025b = l7Var;
        this.f1026c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f1027f = z10;
    }
}
