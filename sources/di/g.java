package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8840a;
    public final t f8841b;
    public final TwoStepVerificationActivity f8842c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8840a = i7;
        this.f8841b = tVar;
        this.f8842c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8840a) {
            case 0:
                t tVar = this.f8841b;
                tVar.f9745i0.setLoading(false);
                tVar.presentFragment(this.f8842c);
                return;
            default:
                t tVar2 = this.f8841b;
                tVar2.f9735b0.setLoading(false);
                tVar2.presentFragment(this.f8842c);
                return;
        }
    }
}
