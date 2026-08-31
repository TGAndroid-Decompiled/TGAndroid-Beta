package mh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f13874a;
    public final p f13875b;
    public final TwoStepVerificationActivity f13876c;

    public d(p pVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f13874a = i10;
        this.f13875b = pVar;
        this.f13876c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f13874a) {
            case 0:
                p pVar = this.f13875b;
                pVar.V.setLoading(false);
                pVar.presentFragment(this.f13876c);
                return;
            default:
                p pVar2 = this.f13875b;
                pVar2.O.setLoading(false);
                pVar2.presentFragment(this.f13876c);
                return;
        }
    }
}
