package ai;

import org.telegram.ui.PremiumPreviewFragment;
public final class h implements Runnable {
    public final int f1002a;
    public final b0 f1003b;

    public h(b0 b0Var, int i10) {
        this.f1002a = i10;
        this.f1003b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f1002a) {
            case 0:
                this.f1003b.p(true, false);
                return;
            case 1:
                b0 b0Var = this.f1003b;
                ci.e4 e4Var = b0Var.J;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                b0Var.f601e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f1003b.c();
                return;
        }
    }
}
