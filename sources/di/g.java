package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8839a;
    public final t f8840b;
    public final TwoStepVerificationActivity f8841c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8839a = i7;
        this.f8840b = tVar;
        this.f8841c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8839a) {
            case 0:
                t tVar = this.f8840b;
                tVar.f9743i0.setLoading(false);
                tVar.presentFragment(this.f8841c);
                return;
            default:
                t tVar2 = this.f8840b;
                tVar2.f9733b0.setLoading(false);
                tVar2.presentFragment(this.f8841c);
                return;
        }
    }
}
