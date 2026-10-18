package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class n4 implements RequestDelegate {
    public final int f1890a;
    public final k7 f1891b;
    public final TwoStepVerificationActivity f1892c;
    public final boolean d;

    public n4(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f1890a = i10;
        this.f1891b = k7Var;
        this.f1892c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1890a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f2(this.f1891b, tLObject, this.f1892c, this.d, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f2(this.f1891b, tL_error, this.f1892c, tLObject, this.d));
                return;
        }
    }
}
