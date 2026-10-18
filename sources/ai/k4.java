package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k4 implements RequestDelegate {
    public final int f1631a;
    public final k7 f1632b;
    public final TwoStepVerificationActivity f1633c;
    public final boolean d;

    public k4(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f1631a = i10;
        this.f1632b = k7Var;
        this.f1633c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1631a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p4(this.f1632b, tLObject, this.f1633c, this.d, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p4(this.f1632b, tL_error, this.f1633c, tLObject, this.d));
                return;
        }
    }
}
