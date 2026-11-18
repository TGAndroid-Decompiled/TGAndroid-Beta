package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8845a;
    public final t f8846b;
    public final TwoStepVerificationActivity f8847c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8845a = i7;
        this.f8846b = tVar;
        this.f8847c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8845a) {
            case 0:
                t tVar = this.f8846b;
                tVar.f9763i0.setLoading(false);
                tVar.presentFragment(this.f8847c);
                return;
            default:
                t tVar2 = this.f8846b;
                tVar2.f9753b0.setLoading(false);
                tVar2.presentFragment(this.f8847c);
                return;
        }
    }
}
