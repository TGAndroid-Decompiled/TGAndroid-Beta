package di;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f8592a;
    public final t f8593b;
    public final TwoStepVerificationActivity f8594c;

    public g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f8592a = i7;
        this.f8593b = tVar;
        this.f8594c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f8592a) {
            case 0:
                t tVar = this.f8593b;
                tVar.f9424i0.setLoading(false);
                tVar.presentFragment(this.f8594c);
                return;
            default:
                t tVar2 = this.f8593b;
                tVar2.f9414b0.setLoading(false);
                tVar2.presentFragment(this.f8594c);
                return;
        }
    }
}
