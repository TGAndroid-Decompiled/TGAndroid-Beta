package ci;

import org.telegram.messenger.AndroidUtilities;
public final class n8 implements Runnable {
    public final int f5646a;
    public final u8 f5647b;

    public n8(u8 u8Var, int i10) {
        this.f5646a = i10;
        this.f5647b = u8Var;
    }

    @Override
    public final void run() {
        switch (this.f5646a) {
            case 0:
                u8.R(this.f5647b);
                return;
            case 1:
                this.f5647b.Y();
                return;
            default:
                u8 u8Var = this.f5647b;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    j3Var.f22297b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f22297b);
                    return;
                }
                return;
        }
    }
}
