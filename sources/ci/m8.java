package ci;

import org.telegram.messenger.AndroidUtilities;
public final class m8 implements Runnable {
    public final int f5577a;
    public final t8 f5578b;

    public m8(t8 t8Var, int i10) {
        this.f5577a = i10;
        this.f5578b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f5577a) {
            case 0:
                t8.O(this.f5578b);
                return;
            case 1:
                this.f5578b.W();
                return;
            default:
                t8 t8Var = this.f5578b;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                if (t8Var.isShowing()) {
                    j3Var.f22311b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f22311b);
                    return;
                }
                return;
        }
    }
}
