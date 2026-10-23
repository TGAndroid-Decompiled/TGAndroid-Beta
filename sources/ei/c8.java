package ei;

import org.telegram.messenger.AndroidUtilities;
public final class c8 implements Runnable {
    public final int f8843a;
    public final j8 f8844b;

    public c8(j8 j8Var, int i10) {
        this.f8843a = i10;
        this.f8844b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f8843a) {
            case 0:
                j8.Q(this.f8844b);
                return;
            case 1:
                this.f8844b.X();
                return;
            default:
                j8 j8Var = this.f8844b;
                org.telegram.ui.Cells.h3 h3Var = j8Var.Y;
                if (j8Var.isShowing()) {
                    h3Var.d.requestFocus();
                    AndroidUtilities.showKeyboard(h3Var.d);
                    return;
                }
                return;
        }
    }
}
