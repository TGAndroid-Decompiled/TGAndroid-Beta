package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class gi1 implements b3c {
    public final byte a;
    public final zi1 b;
    public final TwoStepVerificationActivity c;

    public gi1(zi1 zi1Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = zi1Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                zi1Var.G(false, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
            case 1:
                zi1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
            default:
                zi1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
        }
    }
}
