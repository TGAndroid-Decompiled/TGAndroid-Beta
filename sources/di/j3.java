package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j3 implements RequestDelegate {
    public final int f8847a;
    public final c6 f8848b;
    public final TwoStepVerificationActivity f8849c;
    public final boolean d;

    public j3(c6 c6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i7) {
        this.f8847a = i7;
        this.f8848b = c6Var;
        this.f8849c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8847a) {
            case 0:
                org.telegram.messenger.g0.h3(new j1(this.f8848b, tLObject, this.f8849c, this.d, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new j1(this.f8848b, tL_error, this.f8849c, tLObject, this.d));
                return;
        }
    }
}
