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
                org.telegram.ui.Cells.j3 j3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    j3Var.f20455b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f20455b);
                    return;
                }
                return;
        }
    }
}
