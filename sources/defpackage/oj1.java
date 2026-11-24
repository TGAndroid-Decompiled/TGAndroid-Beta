package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class oj1 implements c5c {
    public final byte a;
    public final ik1 b;
    public final TwoStepVerificationActivity c;

    public oj1(ik1 ik1Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ik1Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                ik1Var.G(false, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
            case 1:
                ik1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
            default:
                ik1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                return;
        }
    }
}
