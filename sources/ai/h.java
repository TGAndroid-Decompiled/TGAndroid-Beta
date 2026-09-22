package ai;

import org.telegram.ui.PremiumPreviewFragment;
public final class h implements Runnable {
    public final int f924a;
    public final b0 f925b;

    public h(b0 b0Var, int i10) {
        this.f924a = i10;
        this.f925b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f924a) {
            case 0:
                this.f925b.p(true, false);
                return;
            case 1:
                b0 b0Var = this.f925b;
                ci.f4 f4Var = b0Var.J;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                b0Var.f544e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f925b.c();
                return;
        }
    }
}
