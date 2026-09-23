package ci;

import org.telegram.messenger.AndroidUtilities;
public final class n8 implements Runnable {
    public final int f5215a;
    public final u8 f5216b;

    public n8(u8 u8Var, int i10) {
        this.f5215a = i10;
        this.f5216b = u8Var;
    }

    @Override
    public final void run() {
        switch (this.f5215a) {
            case 0:
                u8.Q(this.f5216b);
                return;
            case 1:
                this.f5216b.X();
                return;
            default:
                u8 u8Var = this.f5216b;
                org.telegram.ui.Cells.i3 i3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    i3Var.f20177b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f20177b);
                    return;
                }
                return;
        }
    }
}
