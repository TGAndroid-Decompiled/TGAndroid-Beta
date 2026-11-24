package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class wb0 implements Runnable {
    public final byte a;
    public final mc0 b;

    public wb0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                if (!mc0Var.V) {
                    if (mc0Var.O > 0.0f) {
                        if (mc0Var.N != null) {
                            mc0Var.F = 1.0f;
                            mc0Var.G = true;
                        }
                        gm.t1(mc0Var.fragmentView);
                        return;
                    }
                    mc0Var.l0(!mc0Var.a.w, true, false);
                    return;
                }
                return;
            default:
                mc0Var.getClass();
                mc0Var.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
