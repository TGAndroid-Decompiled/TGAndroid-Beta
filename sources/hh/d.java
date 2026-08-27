package hh;

import org.telegram.ui.TwoStepVerificationActivity;

public final class d implements Runnable {

    public final int f9108a;

    public final r f9109b;

    public final TwoStepVerificationActivity f9110c;

    public d(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f9108a = i10;
        this.f9109b = rVar;
        this.f9110c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f9108a) {
            case 0:
                r rVar = this.f9109b;
                rVar.U.setLoading(false);
                rVar.presentFragment(this.f9110c);
                break;
            default:
                r rVar2 = this.f9109b;
                rVar2.N.setLoading(false);
                rVar2.presentFragment(this.f9110c);
                break;
        }
    }
}
