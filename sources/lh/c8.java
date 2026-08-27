package lh;

import org.telegram.messenger.AndroidUtilities;

public final class c8 implements Runnable {

    public final int f15756a;

    public final j8 f15757b;

    public c8(j8 j8Var, int i10) {
        this.f15756a = i10;
        this.f15757b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f15756a) {
            case 0:
                j8.Q(this.f15757b);
                break;
            case 1:
                this.f15757b.X();
                break;
            default:
                j8 j8Var = this.f15757b;
                org.telegram.ui.Cells.g3 g3Var = j8Var.U;
                if (j8Var.isShowing()) {
                    g3Var.f24370b.requestFocus();
                    AndroidUtilities.showKeyboard(g3Var.f24370b);
                    break;
                }
                break;
        }
    }
}
