package mh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f13876a;
    public final p f13877b;
    public final TwoStepVerificationActivity f13878c;

    public d(p pVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f13876a = i10;
        this.f13877b = pVar;
        this.f13878c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f13876a) {
            case 0:
                p pVar = this.f13877b;
                pVar.V.setLoading(false);
                pVar.presentFragment(this.f13878c);
                return;
            default:
                p pVar2 = this.f13877b;
                pVar2.O.setLoading(false);
                pVar2.presentFragment(this.f13878c);
                return;
        }
    }
}
