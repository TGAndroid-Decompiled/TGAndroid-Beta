package ai;

import org.telegram.ui.PremiumPreviewFragment;
public final class h implements Runnable {
    public final int f1067a;
    public final b0 f1068b;

    public h(b0 b0Var, int i10) {
        this.f1067a = i10;
        this.f1068b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f1067a) {
            case 0:
                this.f1068b.q(true, false);
                return;
            case 1:
                b0 b0Var = this.f1068b;
                ci.d4 d4Var = b0Var.J;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                b0Var.f668e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f1068b.c();
                return;
        }
    }
}
