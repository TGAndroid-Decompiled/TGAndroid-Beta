package ci;

import org.telegram.messenger.AndroidUtilities;
public final class m8 implements Runnable {
    public final int f5576a;
    public final t8 f5577b;

    public m8(t8 t8Var, int i10) {
        this.f5576a = i10;
        this.f5577b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f5576a) {
            case 0:
                t8.O(this.f5577b);
                return;
            case 1:
                this.f5577b.W();
                return;
            default:
                t8 t8Var = this.f5577b;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                if (t8Var.isShowing()) {
                    j3Var.f22306b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f22306b);
                    return;
                }
                return;
        }
    }
}
