package ai;

import org.telegram.ui.PremiumPreviewFragment;
public final class h implements Runnable {
    public final int f928a;
    public final b0 f929b;

    public h(b0 b0Var, int i10) {
        this.f928a = i10;
        this.f929b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f928a) {
            case 0:
                this.f929b.p(true, false);
                return;
            case 1:
                b0 b0Var = this.f929b;
                ci.e4 e4Var = b0Var.J;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                b0Var.f554e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f929b.c();
                return;
        }
    }
}
