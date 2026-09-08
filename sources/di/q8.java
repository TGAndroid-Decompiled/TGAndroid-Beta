package di;

import org.telegram.messenger.AndroidUtilities;
public final class q8 implements Runnable {
    public final int f8041a;
    public final x8 f8042b;

    public q8(x8 x8Var, int i10) {
        this.f8041a = i10;
        this.f8042b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f8041a) {
            case 0:
                x8.Q(this.f8042b);
                return;
            case 1:
                this.f8042b.X();
                return;
            default:
                x8 x8Var = this.f8042b;
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    i3Var.f22101b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22101b);
                    return;
                }
                return;
        }
    }
}
