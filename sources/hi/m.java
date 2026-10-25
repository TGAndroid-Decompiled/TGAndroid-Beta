package hi;

import org.telegram.messenger.AndroidUtilities;
public final class m implements Runnable {
    public final int f13090a;
    public final q f13091b;

    public m(q qVar, int i10) {
        this.f13090a = i10;
        this.f13091b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f13090a) {
            case 0:
                this.f13091b.R();
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = this.f13091b.f13219l0;
                g3Var.d.requestFocus();
                AndroidUtilities.showKeyboard(g3Var.d);
                return;
        }
    }
}
