package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class eg3 implements Runnable {
    public final byte a;
    public final pg3 b;

    public eg3(pg3 pg3Var, byte b) {
        this.a = b;
        this.b = pg3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pg3 pg3Var = this.b;
        switch (b) {
            case 0:
                pg3Var.p(true, false);
                return;
            case 1:
                kg5 kg5Var = pg3Var.K;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                pg3Var.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                pg3Var.c();
                return;
        }
    }
}
