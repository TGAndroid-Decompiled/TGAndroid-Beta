package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h4 implements RequestDelegate {
    public final int f4721a;
    public final h7 f4722b;
    public final TwoStepVerificationActivity f4723c;
    public final boolean d;

    public h4(h7 h7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f4721a = i10;
        this.f4722b = h7Var;
        this.f4723c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4721a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y1(this.f4722b, tLObject, this.f4723c, this.d, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new y1(this.f4722b, tL_error, this.f4723c, tLObject, this.d));
                return;
        }
    }
}
