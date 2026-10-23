package ei;

import org.telegram.messenger.AndroidUtilities;
public final class c8 implements Runnable {
    public final int f8834a;
    public final j8 f8835b;

    public c8(j8 j8Var, int i10) {
        this.f8834a = i10;
        this.f8835b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f8834a) {
            case 0:
                j8.R(this.f8835b);
                return;
            case 1:
                this.f8835b.Y();
                return;
            default:
                j8 j8Var = this.f8835b;
                org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
                if (j8Var.isShowing()) {
                    i3Var.f22406b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22406b);
                    return;
                }
                return;
        }
    }
}
