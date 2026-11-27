package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class gc5 implements Runnable {
    public final byte a;
    public final rc5 b;

    public gc5(rc5 rc5Var, byte b) {
        this.a = b;
        this.b = rc5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rc5 rc5Var = this.b;
        switch (b) {
            case 0:
                rc5Var.finishFragment();
                return;
            case 1:
                rc5Var.j0();
                rc5Var.f0();
                return;
            case 2:
                rc5Var.getClass();
                rc5Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                rc5Var.n.postOnAnimation(new gc5(rc5Var, (byte) 1));
                return;
        }
    }
}
