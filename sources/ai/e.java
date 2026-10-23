package ai;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f1171a;
    public final x f1172b;
    public final TwoStepVerificationActivity f1173c;

    public e(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f1171a = i10;
        this.f1172b = xVar;
        this.f1173c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f1171a) {
            case 0:
                x xVar = this.f1172b;
                xVar.Y.setLoading(false);
                xVar.presentFragment(this.f1173c);
                return;
            default:
                x xVar2 = this.f1172b;
                xVar2.R.setLoading(false);
                xVar2.presentFragment(this.f1173c);
                return;
        }
    }
}
