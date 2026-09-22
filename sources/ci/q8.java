package ci;

import org.telegram.messenger.AndroidUtilities;
public final class q8 implements Runnable {
    public final int f5358a;
    public final x8 f5359b;

    public q8(x8 x8Var, int i10) {
        this.f5358a = i10;
        this.f5359b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f5358a) {
            case 0:
                x8.Q(this.f5359b);
                return;
            case 1:
                this.f5359b.X();
                return;
            default:
                x8 x8Var = this.f5359b;
                org.telegram.ui.Cells.k3 k3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    k3Var.f20542b.requestFocus();
                    AndroidUtilities.showKeyboard(k3Var.f20542b);
                    return;
                }
                return;
        }
    }
}
