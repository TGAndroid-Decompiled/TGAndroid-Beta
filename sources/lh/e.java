package lh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements Runnable {
    public final int f12312a;
    public final q f12313b;
    public final TwoStepVerificationActivity f12314c;

    public e(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f12312a = i10;
        this.f12313b = qVar;
        this.f12314c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f12312a) {
            case 0:
                q qVar = this.f12313b;
                qVar.V.setLoading(false);
                qVar.presentFragment(this.f12314c);
                return;
            default:
                q qVar2 = this.f12313b;
                qVar2.O.setLoading(false);
                qVar2.presentFragment(this.f12314c);
                return;
        }
    }
}
