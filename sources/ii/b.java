package ii;

import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b implements Runnable {
    public final int f16263a;
    public final h2 f16264b;
    public final TwoStepVerificationActivity f16265c;

    public b(h2 h2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f16263a = i7;
        this.f16264b = h2Var;
        this.f16265c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f16263a) {
            case 0:
                this.f16264b.presentFragment(this.f16265c);
                return;
            default:
                ?? obj = new Object();
                obj.f28923a = true;
                this.f16264b.showAsSheet(this.f16265c, obj);
                return;
        }
    }
}
