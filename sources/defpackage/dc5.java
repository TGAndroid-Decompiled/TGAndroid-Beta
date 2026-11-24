package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class dc5 implements Runnable {
    public final byte a;
    public final oc5 b;

    public dc5(oc5 oc5Var, byte b) {
        this.a = b;
        this.b = oc5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oc5 oc5Var = this.b;
        switch (b) {
            case 0:
                oc5Var.finishFragment();
                return;
            case 1:
                oc5Var.k0();
                oc5Var.g0();
                return;
            case 2:
                oc5Var.getClass();
                oc5Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                oc5Var.n.postOnAnimation(new dc5(oc5Var, (byte) 1));
                return;
        }
    }
}
