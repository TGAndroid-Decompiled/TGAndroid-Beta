package ci;

import org.telegram.messenger.AndroidUtilities;
public final class q8 implements Runnable {
    public final int f5359a;
    public final x8 f5360b;

    public q8(x8 x8Var, int i10) {
        this.f5359a = i10;
        this.f5360b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f5359a) {
            case 0:
                x8.Q(this.f5360b);
                return;
            case 1:
                this.f5360b.X();
                return;
            default:
                x8 x8Var = this.f5360b;
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    i3Var.f20239b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f20239b);
                    return;
                }
                return;
        }
    }
}
