package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class qi1 implements Runnable {
    public final byte a;
    public final ij1 b;
    public final w1b c;
    public final TwoStepVerificationActivity d;

    public qi1(ij1 ij1Var, w1b w1bVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ij1Var;
        this.c = w1bVar;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        w1b w1bVar = this.c;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                ij1Var.A0.setLoading(false);
                w1bVar.presentFragment(twoStepVerificationActivity);
                return;
            case 1:
                ij1Var.G0.setLoading(false);
                w1bVar.presentFragment(twoStepVerificationActivity);
                return;
            default:
                ij1Var.G0.setLoading(false);
                w1bVar.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
