package ei;

import org.telegram.messenger.AndroidUtilities;
public final class c8 implements Runnable {
    public final int f8836a;
    public final j8 f8837b;

    public c8(j8 j8Var, int i10) {
        this.f8836a = i10;
        this.f8837b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f8836a) {
            case 0:
                j8.R(this.f8837b);
                return;
            case 1:
                this.f8837b.Y();
                return;
            default:
                j8 j8Var = this.f8837b;
                org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
                if (j8Var.isShowing()) {
                    i3Var.f22401b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22401b);
                    return;
                }
                return;
        }
    }
}
