package di;

import org.telegram.messenger.AndroidUtilities;
public final class m8 implements Runnable {
    public final int f7431a;
    public final t8 f7432b;

    public m8(t8 t8Var, int i10) {
        this.f7431a = i10;
        this.f7432b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f7431a) {
            case 0:
                t8.R(this.f7432b);
                return;
            case 1:
                this.f7432b.Y();
                return;
            default:
                t8 t8Var = this.f7432b;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                if (t8Var.isShowing()) {
                    j3Var.f21083b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f21083b);
                    return;
                }
                return;
        }
    }
}
