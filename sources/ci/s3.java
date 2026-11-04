package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s3 implements RequestDelegate {
    public final int f5950a;
    public final l6 f5951b;
    public final TwoStepVerificationActivity f5952c;
    public final boolean d;

    public s3(l6 l6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i3) {
        this.f5950a = i3;
        this.f5951b = l6Var;
        this.f5952c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5950a) {
            case 0:
                org.telegram.messenger.g0.h3(new q1(this.f5951b, tLObject, this.f5952c, this.d, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new q1(this.f5951b, tL_error, this.f5952c, tLObject, this.d));
                return;
        }
    }
}
