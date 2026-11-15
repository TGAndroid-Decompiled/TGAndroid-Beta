package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j3 implements RequestDelegate {
    public final int f8852a;
    public final c6 f8853b;
    public final TwoStepVerificationActivity f8854c;
    public final boolean d;

    public j3(c6 c6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i7) {
        this.f8852a = i7;
        this.f8853b = c6Var;
        this.f8854c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8852a) {
            case 0:
                org.telegram.messenger.g0.h3(new j1(this.f8853b, tLObject, this.f8854c, this.d, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new j1(this.f8853b, tL_error, this.f8854c, tLObject, this.d));
                return;
        }
    }
}
