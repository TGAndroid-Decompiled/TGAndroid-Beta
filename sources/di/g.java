package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8842a;
    public final t f8843b;
    public final TwoStepVerificationActivity f8844c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8842a = i7;
        this.f8843b = tVar;
        this.f8844c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8842a) {
            case 0:
                t tVar = this.f8843b;
                tVar.f9760i0.setLoading(false);
                tVar.presentFragment(this.f8844c);
                return;
            default:
                t tVar2 = this.f8843b;
                tVar2.f9750b0.setLoading(false);
                tVar2.presentFragment(this.f8844c);
                return;
        }
    }
}
