package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l3 implements RequestDelegate {
    public final int f9278a;
    public final f6 f9279b;
    public final TwoStepVerificationActivity f9280c;
    public final boolean d;

    public l3(f6 f6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i7) {
        this.f9278a = i7;
        this.f9279b = f6Var;
        this.f9280c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9278a) {
            case 0:
                org.telegram.messenger.g0.g3(new q3(this.f9279b, tLObject, this.f9280c, this.d, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new q3(this.f9279b, tL_error, this.f9280c, tLObject, this.d));
                return;
        }
    }
}
