package ai;

import org.telegram.ui.PremiumPreviewFragment;
public final class h implements Runnable {
    public final int f925a;
    public final b0 f926b;

    public h(b0 b0Var, int i10) {
        this.f925a = i10;
        this.f926b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f925a) {
            case 0:
                this.f926b.p(true, false);
                return;
            case 1:
                b0 b0Var = this.f926b;
                ci.e4 e4Var = b0Var.J;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                b0Var.f551e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f926b.c();
                return;
        }
    }
}
