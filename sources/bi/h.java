package bi;

import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements Runnable {
    public final int f3967a;
    public final z f3968b;
    public final TwoStepVerificationActivity f3969c;

    public h(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f3967a = i7;
        this.f3968b = zVar;
        this.f3969c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f3967a) {
            case 0:
                z zVar = this.f3968b;
                zVar.f5118h0.setLoading(false);
                zVar.presentFragment(this.f3969c);
                return;
            default:
                z zVar2 = this.f3968b;
                zVar2.f5107a0.setLoading(false);
                zVar2.presentFragment(this.f3969c);
                return;
        }
    }
}
