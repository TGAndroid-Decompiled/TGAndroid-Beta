package di;

import org.telegram.messenger.AndroidUtilities;
public final class q8 implements Runnable {
    public final int f8013a;
    public final x8 f8014b;

    public q8(x8 x8Var, int i10) {
        this.f8013a = i10;
        this.f8014b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f8013a) {
            case 0:
                x8.Q(this.f8014b);
                return;
            case 1:
                this.f8014b.X();
                return;
            default:
                x8 x8Var = this.f8014b;
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    i3Var.f22074b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22074b);
                    return;
                }
                return;
        }
    }
}
