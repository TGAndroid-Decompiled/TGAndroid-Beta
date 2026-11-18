package ii;

import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b implements Runnable {
    public final int f16260a;
    public final h2 f16261b;
    public final TwoStepVerificationActivity f16262c;

    public b(h2 h2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f16260a = i7;
        this.f16261b = h2Var;
        this.f16262c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f16260a) {
            case 0:
                this.f16261b.presentFragment(this.f16262c);
                return;
            default:
                ?? obj = new Object();
                obj.f28921a = true;
                this.f16261b.showAsSheet(this.f16262c, obj);
                return;
        }
    }
}
