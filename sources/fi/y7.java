package fi;

import org.telegram.messenger.AndroidUtilities;
public final class y7 implements Runnable {
    public final int f12002a;
    public final f8 f12003b;

    public y7(f8 f8Var, int i10) {
        this.f12002a = i10;
        this.f12003b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f12002a) {
            case 0:
                f8.Q(this.f12003b);
                return;
            case 1:
                this.f12003b.X();
                return;
            default:
                f8 f8Var = this.f12003b;
                org.telegram.ui.Cells.g3 g3Var = f8Var.Y;
                if (f8Var.isShowing()) {
                    g3Var.d.requestFocus();
                    AndroidUtilities.showKeyboard(g3Var.d);
                    return;
                }
                return;
        }
    }
}
