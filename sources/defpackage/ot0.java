package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class ot0 implements Runnable {
    public final byte a;
    public final au0 b;
    public final TwoStepVerificationActivity c;

    public ot0(au0 au0Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = au0Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        au0 au0Var = this.b;
        switch (b) {
            case 0:
                au0Var.i0.setLoading(false);
                au0Var.presentFragment(twoStepVerificationActivity);
                return;
            default:
                au0Var.b0.setLoading(false);
                au0Var.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
