package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t2 implements RequestDelegate {
    public final int f13115a;
    public final g5 f13116b;
    public final TwoStepVerificationActivity f13117c;

    public t2(g5 g5Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f13115a = i10;
        this.f13116b = g5Var;
        this.f13117c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13115a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f13116b, tL_error, this.f13117c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k1(this.f13116b, tL_error, tLObject, this.f13117c));
                return;
        }
    }
}
