package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s2 implements RequestDelegate {
    public final int f12755a;
    public final h5 f12756b;
    public final TwoStepVerificationActivity f12757c;

    public s2(h5 h5Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f12755a = i10;
        this.f12756b = h5Var;
        this.f12757c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12755a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f12756b, tL_error, this.f12757c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k1(this.f12756b, tL_error, tLObject, this.f12757c));
                return;
        }
    }
}
