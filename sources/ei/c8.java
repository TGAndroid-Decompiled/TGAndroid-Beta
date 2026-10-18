package ei;

import org.telegram.messenger.AndroidUtilities;
public final class c8 implements Runnable {
    public final int f8837a;
    public final j8 f8838b;

    public c8(j8 j8Var, int i10) {
        this.f8837a = i10;
        this.f8838b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f8837a) {
            case 0:
                j8.R(this.f8838b);
                return;
            case 1:
                this.f8838b.Y();
                return;
            default:
                j8 j8Var = this.f8838b;
                org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
                if (j8Var.isShowing()) {
                    i3Var.f22405b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22405b);
                    return;
                }
                return;
        }
    }
}
