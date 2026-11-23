package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8878a;
    public final t f8879b;
    public final TwoStepVerificationActivity f8880c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8878a = i7;
        this.f8879b = tVar;
        this.f8880c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8878a) {
            case 0:
                t tVar = this.f8879b;
                tVar.f9782i0.setLoading(false);
                tVar.presentFragment(this.f8880c);
                return;
            default:
                t tVar2 = this.f8879b;
                tVar2.f9772b0.setLoading(false);
                tVar2.presentFragment(this.f8880c);
                return;
        }
    }
}
