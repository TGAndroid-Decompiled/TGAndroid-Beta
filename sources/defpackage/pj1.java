package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class pj1 implements Runnable {
    public final byte a;
    public final ik1 b;
    public final xza c;
    public final TwoStepVerificationActivity d;

    public pj1(ik1 ik1Var, xza xzaVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ik1Var;
        this.c = xzaVar;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        xza xzaVar = this.c;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                ik1Var.A0.setLoading(false);
                xzaVar.presentFragment(twoStepVerificationActivity);
                return;
            case 1:
                ik1Var.G0.setLoading(false);
                xzaVar.presentFragment(twoStepVerificationActivity);
                return;
            default:
                ik1Var.G0.setLoading(false);
                xzaVar.presentFragment(twoStepVerificationActivity);
                return;
        }
    }
}
