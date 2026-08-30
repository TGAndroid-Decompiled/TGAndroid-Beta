package lh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f12328a;
    public final q f12329b;
    public final TwoStepVerificationActivity f12330c;

    public e(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f12328a = i10;
        this.f12329b = qVar;
        this.f12330c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f12328a) {
            case 0:
                q qVar = this.f12329b;
                qVar.V.setLoading(false);
                qVar.presentFragment(this.f12330c);
                return;
            default:
                q qVar2 = this.f12329b;
                qVar2.O.setLoading(false);
                qVar2.presentFragment(this.f12330c);
                return;
        }
    }
}
