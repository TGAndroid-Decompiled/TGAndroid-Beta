package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class kf3 implements Runnable {
    public final byte a;
    public final vf3 b;

    public kf3(vf3 vf3Var, byte b) {
        this.a = b;
        this.b = vf3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vf3 vf3Var = this.b;
        switch (b) {
            case 0:
                vf3Var.q(true, false);
                return;
            case 1:
                je5 je5Var = vf3Var.K;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                vf3Var.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                vf3Var.c();
                return;
        }
    }
}
