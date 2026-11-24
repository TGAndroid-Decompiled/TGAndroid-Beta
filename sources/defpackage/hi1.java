package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class hi1 implements Runnable {
    public final byte a;
    public final zi1 b;
    public final uxa c;
    public final TwoStepVerificationActivity d;

    public hi1(zi1 zi1Var, uxa uxaVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = zi1Var;
        this.c = uxaVar;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        uxa uxaVar = this.c;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                zi1Var.A0.setLoading(false);
                uxaVar.presentFragment(twoStepVerificationActivity);
                return;
            case 1:
                zi1Var.G0.setLoading(false);
                uxaVar.presentFragment(twoStepVerificationActivity);
                return;
            default:
                zi1Var.G0.setLoading(false);
                uxaVar.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
