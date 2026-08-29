package jh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f11894a;
    public final q f11895b;
    public final TwoStepVerificationActivity f11896c;

    public d(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f11894a = i10;
        this.f11895b = qVar;
        this.f11896c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f11894a) {
            case 0:
                q qVar = this.f11895b;
                qVar.U.setLoading(false);
                qVar.presentFragment(this.f11896c);
                return;
            default:
                q qVar2 = this.f11895b;
                qVar2.N.setLoading(false);
                qVar2.presentFragment(this.f11896c);
                return;
        }
    }
}
