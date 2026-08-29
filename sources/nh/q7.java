package nh;

import org.telegram.messenger.AndroidUtilities;
public final class q7 implements Runnable {
    public final int f18402a;
    public final y7 f18403b;

    public q7(y7 y7Var, int i10) {
        this.f18402a = i10;
        this.f18403b = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f18402a) {
            case 0:
                y7.Q(this.f18403b);
                return;
            case 1:
                this.f18403b.X();
                return;
            default:
                y7 y7Var = this.f18403b;
                org.telegram.ui.Cells.g3 g3Var = y7Var.U;
                if (y7Var.isShowing()) {
                    g3Var.f24387b.requestFocus();
                    AndroidUtilities.showKeyboard(g3Var.f24387b);
                    return;
                }
                return;
        }
    }
}
