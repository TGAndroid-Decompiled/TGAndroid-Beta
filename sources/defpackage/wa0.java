package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class wa0 implements Runnable {
    public final byte a;
    public final mb0 b;

    public wa0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                if (!mb0Var.V) {
                    if (mb0Var.O > 0.0f) {
                        if (mb0Var.N != null) {
                            mb0Var.F = 1.0f;
                            mb0Var.G = true;
                        }
                        gl.t1(mb0Var.fragmentView);
                        return;
                    }
                    mb0Var.k0(!mb0Var.a.w, true, false);
                    return;
                }
                return;
            default:
                mb0Var.getClass();
                mb0Var.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
