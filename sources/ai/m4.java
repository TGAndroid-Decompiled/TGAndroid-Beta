package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class m4 implements RequestDelegate {
    public final int f1808a;
    public final l7 f1809b;
    public final TwoStepVerificationActivity f1810c;
    public final boolean d;

    public m4(l7 l7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f1808a = i10;
        this.f1809b = l7Var;
        this.f1810c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1808a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b2(this.f1809b, tLObject, this.f1810c, this.d, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b2(this.f1809b, tL_error, this.f1810c, tLObject, this.d));
                return;
        }
    }
}
