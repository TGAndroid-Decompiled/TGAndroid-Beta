package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class n4 implements RequestDelegate {
    public final int f1883a;
    public final k7 f1884b;
    public final TwoStepVerificationActivity f1885c;
    public final boolean d;

    public n4(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f1883a = i10;
        this.f1884b = k7Var;
        this.f1885c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1883a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4(this.f1884b, tLObject, this.f1885c, this.d, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4(this.f1884b, tL_error, this.f1885c, tLObject, this.d));
                return;
        }
    }
}
