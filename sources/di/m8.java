package di;

import org.telegram.messenger.AndroidUtilities;
public final class m8 implements Runnable {
    public final int f7428a;
    public final t8 f7429b;

    public m8(t8 t8Var, int i10) {
        this.f7428a = i10;
        this.f7429b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f7428a) {
            case 0:
                t8.R(this.f7429b);
                return;
            case 1:
                this.f7429b.Y();
                return;
            default:
                t8 t8Var = this.f7429b;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                if (t8Var.isShowing()) {
                    j3Var.f21368b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f21368b);
                    return;
                }
                return;
        }
    }
}
