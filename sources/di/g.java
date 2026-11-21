package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8875a;
    public final t f8876b;
    public final TwoStepVerificationActivity f8877c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8875a = i7;
        this.f8876b = tVar;
        this.f8877c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8875a) {
            case 0:
                t tVar = this.f8876b;
                tVar.f9779i0.setLoading(false);
                tVar.presentFragment(this.f8877c);
                return;
            default:
                t tVar2 = this.f8876b;
                tVar2.f9769b0.setLoading(false);
                tVar2.presentFragment(this.f8877c);
                return;
        }
    }
}
