package ci;

import org.telegram.messenger.AndroidUtilities;
public final class q8 implements Runnable {
    public final int f5354a;
    public final x8 f5355b;

    public q8(x8 x8Var, int i10) {
        this.f5354a = i10;
        this.f5355b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f5354a) {
            case 0:
                x8.Q(this.f5355b);
                return;
            case 1:
                this.f5355b.X();
                return;
            default:
                x8 x8Var = this.f5355b;
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    i3Var.f20229b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f20229b);
                    return;
                }
                return;
        }
    }
}
