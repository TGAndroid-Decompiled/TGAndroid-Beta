package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s2 implements RequestDelegate {
    public final int f14728a;
    public final g5 f14729b;
    public final TwoStepVerificationActivity f14730c;

    public s2(g5 g5Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f14728a = i10;
        this.f14729b = g5Var;
        this.f14730c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14728a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j1(this.f14729b, tL_error, this.f14730c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new j1(this.f14729b, tL_error, tLObject, this.f14730c));
                return;
        }
    }
}
