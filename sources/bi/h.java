package bi;

import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements Runnable {
    public final int f4697a;
    public final y f4698b;
    public final TwoStepVerificationActivity f4699c;

    public h(y yVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f4697a = i10;
        this.f4698b = yVar;
        this.f4699c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f4697a) {
            case 0:
                y yVar = this.f4698b;
                yVar.f5725h0.setLoading(false);
                yVar.presentFragment(this.f4699c);
                return;
            default:
                y yVar2 = this.f4698b;
                yVar2.f5715a0.setLoading(false);
                yVar2.presentFragment(this.f4699c);
                return;
        }
    }
}
