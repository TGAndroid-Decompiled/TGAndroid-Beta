package ci;

import org.telegram.messenger.AndroidUtilities;
public final class n8 implements Runnable {
    public final int f5644a;
    public final u8 f5645b;

    public n8(u8 u8Var, int i10) {
        this.f5644a = i10;
        this.f5645b = u8Var;
    }

    @Override
    public final void run() {
        switch (this.f5644a) {
            case 0:
                u8.R(this.f5645b);
                return;
            case 1:
                this.f5645b.Y();
                return;
            default:
                u8 u8Var = this.f5645b;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    j3Var.f22081b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f22081b);
                    return;
                }
                return;
        }
    }
}
