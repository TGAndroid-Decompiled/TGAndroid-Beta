package ii;

import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b implements Runnable {
    public final int f16285a;
    public final g2 f16286b;
    public final TwoStepVerificationActivity f16287c;

    public b(g2 g2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f16285a = i7;
        this.f16286b = g2Var;
        this.f16287c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f16285a) {
            case 0:
                this.f16286b.presentFragment(this.f16287c);
                return;
            default:
                ?? obj = new Object();
                obj.f28902a = true;
                this.f16286b.showAsSheet(this.f16287c, obj);
                return;
        }
    }
}
