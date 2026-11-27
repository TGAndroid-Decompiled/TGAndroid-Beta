package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class ya0 implements Runnable {
    public final byte a;
    public final ob0 b;

    public ya0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                if (!ob0Var.V) {
                    if (ob0Var.O > 0.0f) {
                        if (ob0Var.N != null) {
                            ob0Var.F = 1.0f;
                            ob0Var.G = true;
                        }
                        hl.t1(ob0Var.fragmentView);
                        return;
                    }
                    ob0Var.k0(!ob0Var.a.w, true, false);
                    return;
                }
                return;
            default:
                ob0Var.getClass();
                ob0Var.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
