package ai;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f1178a;
    public final x f1179b;
    public final TwoStepVerificationActivity f1180c;

    public e(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f1178a = i10;
        this.f1179b = xVar;
        this.f1180c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f1178a) {
            case 0:
                x xVar = this.f1179b;
                xVar.Y.setLoading(false);
                xVar.presentFragment(this.f1180c);
                return;
            default:
                x xVar2 = this.f1179b;
                xVar2.R.setLoading(false);
                xVar2.presentFragment(this.f1180c);
                return;
        }
    }
}
