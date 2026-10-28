package hi;

import org.telegram.messenger.AndroidUtilities;
public final class m implements Runnable {
    public final int f13089a;
    public final q f13090b;

    public m(q qVar, int i10) {
        this.f13089a = i10;
        this.f13090b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f13089a) {
            case 0:
                this.f13090b.R();
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = this.f13090b.f13218l0;
                g3Var.d.requestFocus();
                AndroidUtilities.showKeyboard(g3Var.d);
                return;
        }
    }
}
