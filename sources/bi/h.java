package bi;

import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements Runnable {
    public final int f3964a;
    public final z f3965b;
    public final TwoStepVerificationActivity f3966c;

    public h(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f3964a = i7;
        this.f3965b = zVar;
        this.f3966c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f3964a) {
            case 0:
                z zVar = this.f3965b;
                zVar.f5123h0.setLoading(false);
                zVar.presentFragment(this.f3966c);
                return;
            default:
                z zVar2 = this.f3965b;
                zVar2.f5112a0.setLoading(false);
                zVar2.presentFragment(this.f3966c);
                return;
        }
    }
}
