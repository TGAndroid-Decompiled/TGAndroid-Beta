package ci;

import org.telegram.messenger.AndroidUtilities;
public final class m8 implements Runnable {
    public final int f5178a;
    public final t8 f5179b;

    public m8(t8 t8Var, int i10) {
        this.f5178a = i10;
        this.f5179b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f5178a) {
            case 0:
                t8.Q(this.f5179b);
                return;
            case 1:
                this.f5179b.X();
                return;
            default:
                t8 t8Var = this.f5179b;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                if (t8Var.isShowing()) {
                    j3Var.f20493b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f20493b);
                    return;
                }
                return;
        }
    }
}
