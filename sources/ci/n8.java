package ci;

import org.telegram.messenger.AndroidUtilities;
public final class n8 implements Runnable {
    public final int f5222a;
    public final u8 f5223b;

    public n8(u8 u8Var, int i10) {
        this.f5222a = i10;
        this.f5223b = u8Var;
    }

    @Override
    public final void run() {
        switch (this.f5222a) {
            case 0:
                u8.Q(this.f5223b);
                return;
            case 1:
                this.f5223b.X();
                return;
            default:
                u8 u8Var = this.f5223b;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    j3Var.f20508b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f20508b);
                    return;
                }
                return;
        }
    }
}
