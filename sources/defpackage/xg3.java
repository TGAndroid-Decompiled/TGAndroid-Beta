package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class xg3 implements Runnable {
    public final byte a;
    public final ih3 b;

    public xg3(ih3 ih3Var, byte b) {
        this.a = b;
        this.b = ih3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ih3 ih3Var = this.b;
        switch (b) {
            case 0:
                ih3Var.p(true, false);
                return;
            case 1:
                hg5 hg5Var = ih3Var.K;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                ih3Var.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                ih3Var.c();
                return;
        }
    }
}
