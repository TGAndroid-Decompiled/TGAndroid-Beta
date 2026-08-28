package gh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f7945a;
    public final r f7946b;
    public final TwoStepVerificationActivity f7947c;

    public d(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.f7945a = i9;
        this.f7946b = rVar;
        this.f7947c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f7945a) {
            case 0:
                r rVar = this.f7946b;
                rVar.U.setLoading(false);
                rVar.presentFragment(this.f7947c);
                return;
            default:
                r rVar2 = this.f7946b;
                rVar2.N.setLoading(false);
                rVar2.presentFragment(this.f7947c);
                return;
        }
    }
}
