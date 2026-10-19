package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q4 implements Runnable {
    public final int f2056a = 0;
    public final k7 f2057b;
    public final TLRPC.TL_error f2058c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f2059f;

    public q4(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f2057b = k7Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f2059f = z10;
        this.f2058c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f2056a) {
            case 0:
                k7.B0(this.f2057b, this.e, this.d, this.f2059f, this.f2058c);
                return;
            default:
                if (this.f2058c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    this.f2057b.J2(twoStepVerificationActivity.l0(), twoStepVerificationActivity, this.f2059f);
                    return;
                }
                return;
        }
    }

    public q4(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f2057b = k7Var;
        this.f2058c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f2059f = z10;
    }
}
