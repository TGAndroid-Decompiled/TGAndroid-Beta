package defpackage;

import org.telegram.ui.Components.UndoView;
public final class tu1 implements Runnable {
    public final byte a;
    public final iv1 b;
    public final k47 c;

    public tu1(iv1 iv1Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = iv1Var;
        this.c = k47Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        k47 k47Var = this.c;
        iv1 iv1Var = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = iv1Var.a;
                yv1Var.i6();
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    if (yv1Var.a0.getVisibility() == 0 && yv1Var.T.getVisibility() != 0) {
                        i = 16;
                    } else {
                        i = 17;
                    }
                    undoView.k(0L, i, k47Var.C0(), null, null, new tu1(iv1Var, k47Var, (byte) 2));
                    return;
                }
                return;
            case 1:
                yv1 yv1Var2 = iv1Var.a;
                yv1Var2.kc = k47Var.e1();
                yv1Var2.lc = 0;
                return;
            default:
                yv1 yv1Var3 = iv1Var.a;
                if (yv1Var3.s5()) {
                    y5a b2 = y5a.b(k47Var.C0(), yv1Var3.l6, yv1Var3.F5, yv1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b2.K = yv1Var3.X6();
                    yv1Var3.getSendMessagesHelper().q0(b2);
                    return;
                }
                return;
        }
    }
}
