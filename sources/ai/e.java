package ai;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f1185a;
    public final x f1186b;
    public final TwoStepVerificationActivity f1187c;

    public e(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f1185a = i10;
        this.f1186b = xVar;
        this.f1187c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f1185a) {
            case 0:
                x xVar = this.f1186b;
                xVar.Y.setLoading(false);
                xVar.presentFragment(this.f1187c);
                return;
            default:
                x xVar2 = this.f1186b;
                xVar2.R.setLoading(false);
                xVar2.presentFragment(this.f1187c);
                return;
        }
    }
}
