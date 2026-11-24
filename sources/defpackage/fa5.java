package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class fa5 implements Runnable {
    public final byte a;
    public final qa5 b;

    public fa5(qa5 qa5Var, byte b) {
        this.a = b;
        this.b = qa5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qa5 qa5Var = this.b;
        switch (b) {
            case 0:
                qa5Var.finishFragment();
                return;
            case 1:
                qa5Var.j0();
                qa5Var.f0();
                return;
            case 2:
                qa5Var.getClass();
                qa5Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                qa5Var.n.postOnAnimation(new fa5(qa5Var, (byte) 1));
                return;
        }
    }
}
