package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l4 implements RequestDelegate {
    public final int f1767a;
    public final k7 f1768b;
    public final TwoStepVerificationActivity f1769c;
    public final boolean d;

    public l4(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f1767a = i10;
        this.f1768b = k7Var;
        this.f1769c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1767a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y3(this.f1768b, tLObject, this.f1769c, this.d, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e2(this.f1768b, tL_error, tLObject, this.f1769c, this.d, 0));
                return;
        }
    }
}
