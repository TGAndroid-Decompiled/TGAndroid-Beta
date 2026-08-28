package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u2 implements RequestDelegate {
    public final int f8948a;
    public final k5 f8949b;
    public final TwoStepVerificationActivity f8950c;

    public u2(k5 k5Var, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.f8948a = i9;
        this.f8949b = k5Var;
        this.f8950c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8948a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m1(this.f8949b, tL_error, this.f8950c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m1(this.f8949b, tL_error, tLObject, this.f8950c));
                return;
        }
    }
}
