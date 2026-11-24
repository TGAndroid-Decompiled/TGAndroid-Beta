package defpackage;

import org.telegram.ui.Components.UndoView;
public final class ht1 implements Runnable {
    public final byte a;
    public final wt1 b;
    public final k27 c;

    public ht1(wt1 wt1Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = wt1Var;
        this.c = k27Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        k27 k27Var = this.c;
        wt1 wt1Var = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = wt1Var.a;
                mu1Var.Z5();
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    if (mu1Var.a0.getVisibility() == 0 && mu1Var.T.getVisibility() != 0) {
                        i = 16;
                    } else {
                        i = 17;
                    }
                    undoView.k(0L, i, k27Var.C0(), null, null, new ht1(wt1Var, k27Var, (byte) 2));
                    return;
                }
                return;
            case 1:
                mu1 mu1Var2 = wt1Var.a;
                mu1Var2.ac = k27Var.e1();
                mu1Var2.bc = 0;
                return;
            default:
                mu1 mu1Var3 = wt1Var.a;
                if (mu1Var3.k5()) {
                    x3a b2 = x3a.b(k27Var.C0(), mu1Var3.l6, mu1Var3.F5, mu1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b2.K = mu1Var3.O6();
                    mu1Var3.getSendMessagesHelper().q0(b2);
                    return;
                }
                return;
        }
    }
}
