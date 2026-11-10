package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i4 implements RequestDelegate {
    public final int f4036a;
    public final k7 f4037b;
    public final TwoStepVerificationActivity f4038c;
    public final boolean d;

    public i4(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, int i7) {
        this.f4036a = i7;
        this.f4037b = k7Var;
        this.f4038c = twoStepVerificationActivity;
        this.d = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4036a) {
            case 0:
                org.telegram.messenger.g0.h3(new x1(this.f4037b, tLObject, this.f4038c, this.d, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new x1(this.f4037b, tL_error, this.f4038c, tLObject, this.d));
                return;
        }
    }
}
