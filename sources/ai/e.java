package ai;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f1190a;
    public final x f1191b;
    public final TwoStepVerificationActivity f1192c;

    public e(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f1190a = i10;
        this.f1191b = xVar;
        this.f1192c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f1190a) {
            case 0:
                x xVar = this.f1191b;
                xVar.Y.setLoading(false);
                xVar.presentFragment(this.f1192c);
                return;
            default:
                x xVar2 = this.f1191b;
                xVar2.R.setLoading(false);
                xVar2.presentFragment(this.f1192c);
                return;
        }
    }
}
