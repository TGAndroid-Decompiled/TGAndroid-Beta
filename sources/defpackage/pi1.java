package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class pi1 implements b7c {
    public final byte a;
    public final ij1 b;
    public final TwoStepVerificationActivity c;

    public pi1(ij1 ij1Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ij1Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                ij1Var.G(false, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
            case 1:
                ij1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
            default:
                ij1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
        }
    }
}
