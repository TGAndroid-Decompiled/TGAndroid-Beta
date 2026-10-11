package ci;

import org.telegram.messenger.AndroidUtilities;
public final class n8 implements Runnable {
    public final int f5645a;
    public final u8 f5646b;

    public n8(u8 u8Var, int i10) {
        this.f5645a = i10;
        this.f5646b = u8Var;
    }

    @Override
    public final void run() {
        switch (this.f5645a) {
            case 0:
                u8.R(this.f5646b);
                return;
            case 1:
                this.f5646b.Y();
                return;
            default:
                u8 u8Var = this.f5646b;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    j3Var.f22289b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f22289b);
                    return;
                }
                return;
        }
    }
}
