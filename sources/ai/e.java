package ai;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f1187a;
    public final x f1188b;
    public final TwoStepVerificationActivity f1189c;

    public e(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f1187a = i10;
        this.f1188b = xVar;
        this.f1189c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f1187a) {
            case 0:
                x xVar = this.f1188b;
                xVar.Y.setLoading(false);
                xVar.presentFragment(this.f1189c);
                return;
            default:
                x xVar2 = this.f1188b;
                xVar2.R.setLoading(false);
                xVar2.presentFragment(this.f1189c);
                return;
        }
    }
}
