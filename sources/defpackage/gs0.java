package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class gs0 implements Runnable {
    public final byte a;
    public final ss0 b;
    public final TwoStepVerificationActivity c;

    public gs0(ss0 ss0Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ss0Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        ss0 ss0Var = this.b;
        switch (b) {
            case 0:
                ss0Var.i0.setLoading(false);
                ss0Var.presentFragment(twoStepVerificationActivity);
                return;
            default:
                ss0Var.b0.setLoading(false);
                ss0Var.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
