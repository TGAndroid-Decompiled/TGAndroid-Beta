package ai;

import org.telegram.ui.PremiumPreviewFragment;
public final class h implements Runnable {
    public final int f922a;
    public final b0 f923b;

    public h(b0 b0Var, int i10) {
        this.f922a = i10;
        this.f923b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f922a) {
            case 0:
                this.f923b.p(true, false);
                return;
            case 1:
                b0 b0Var = this.f923b;
                ci.f4 f4Var = b0Var.J;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                b0Var.f542e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f923b.c();
                return;
        }
    }
}
