package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8575a;
    public final t f8576b;
    public final TwoStepVerificationActivity f8577c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8575a = i7;
        this.f8576b = tVar;
        this.f8577c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8575a) {
            case 0:
                t tVar = this.f8576b;
                tVar.f9424i0.setLoading(false);
                tVar.presentFragment(this.f8577c);
                return;
            default:
                t tVar2 = this.f8576b;
                tVar2.f9414b0.setLoading(false);
                tVar2.presentFragment(this.f8577c);
                return;
        }
    }
}
