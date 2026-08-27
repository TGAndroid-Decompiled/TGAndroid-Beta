package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

public final class u2 implements RequestDelegate {

    public final int f10133a;

    public final i5 f10134b;

    public final TwoStepVerificationActivity f10135c;

    public u2(i5 i5Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f10133a = i10;
        this.f10134b = i5Var;
        this.f10135c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10133a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m1(this.f10134b, tL_error, this.f10135c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m1(this.f10134b, tL_error, tLObject, this.f10135c));
                break;
        }
    }
}
