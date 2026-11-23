package ii;

import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b implements Runnable {
    public final int f16351a;
    public final g2 f16352b;
    public final TwoStepVerificationActivity f16353c;

    public b(g2 g2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f16351a = i7;
        this.f16352b = g2Var;
        this.f16353c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f16351a) {
            case 0:
                this.f16352b.presentFragment(this.f16353c);
                return;
            default:
                ?? obj = new Object();
                obj.f28948a = true;
                this.f16352b.showAsSheet(this.f16353c, obj);
                return;
        }
    }
}
