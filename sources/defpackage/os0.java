package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class os0 implements Runnable {
    public final byte a;
    public final at0 b;
    public final TwoStepVerificationActivity c;

    public os0(at0 at0Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = at0Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        at0 at0Var = this.b;
        switch (b) {
            case 0:
                at0Var.i0.setLoading(false);
                at0Var.presentFragment(twoStepVerificationActivity);
                return;
            default:
                at0Var.b0.setLoading(false);
                at0Var.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
