package ci;

import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements Runnable {
    public final int f5200a;
    public final v f5201b;
    public final TwoStepVerificationActivity f5202c;

    public h(v vVar, TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.f5200a = i3;
        this.f5201b = vVar;
        this.f5202c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f5200a) {
            case 0:
                v vVar = this.f5201b;
                vVar.f6143i0.setLoading(false);
                vVar.presentFragment(this.f5202c);
                return;
            default:
                v vVar2 = this.f5201b;
                vVar2.f6133b0.setLoading(false);
                vVar2.presentFragment(this.f5202c);
                return;
        }
    }
}
