package ii;

import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b implements Runnable {
    public final int f16254a;
    public final g2 f16255b;
    public final TwoStepVerificationActivity f16256c;

    public b(g2 g2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f16254a = i7;
        this.f16255b = g2Var;
        this.f16256c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f16254a) {
            case 0:
                this.f16255b.presentFragment(this.f16256c);
                return;
            default:
                ?? obj = new Object();
                obj.f28871a = true;
                this.f16255b.showAsSheet(this.f16256c, obj);
                return;
        }
    }
}
