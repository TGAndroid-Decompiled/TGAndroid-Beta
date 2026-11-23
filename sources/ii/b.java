package ii;

import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b implements Runnable {
    public final int f16288a;
    public final g2 f16289b;
    public final TwoStepVerificationActivity f16290c;

    public b(g2 g2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f16288a = i7;
        this.f16289b = g2Var;
        this.f16290c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f16288a) {
            case 0:
                this.f16289b.presentFragment(this.f16290c);
                return;
            default:
                ?? obj = new Object();
                obj.f28905a = true;
                this.f16289b.showAsSheet(this.f16290c, obj);
                return;
        }
    }
}
