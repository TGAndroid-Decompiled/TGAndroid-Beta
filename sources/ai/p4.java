package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p4 implements Runnable {
    public final int f2004a = 0;
    public final k7 f2005b;
    public final TLRPC.TL_error f2006c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f2007f;

    public p4(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f2005b = k7Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f2007f = z10;
        this.f2006c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f2004a) {
            case 0:
                k7.f0(this.f2005b, this.e, this.d, this.f2007f, this.f2006c);
                return;
            default:
                if (this.f2006c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    this.f2005b.C2(twoStepVerificationActivity.l0(), twoStepVerificationActivity, this.f2007f);
                    return;
                }
                return;
        }
    }

    public p4(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f2005b = k7Var;
        this.f2006c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f2007f = z10;
    }
}
