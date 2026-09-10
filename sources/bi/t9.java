package bi;

import org.telegram.messenger.AndroidUtilities;
public final class t9 implements Runnable {
    public final int f3688a;
    public final aa f3689b;

    public t9(aa aaVar, int i10) {
        this.f3688a = i10;
        this.f3689b = aaVar;
    }

    @Override
    public final void run() {
        switch (this.f3688a) {
            case 0:
                aa.Q(this.f3689b);
                return;
            case 1:
                this.f3689b.X();
                return;
            default:
                aa aaVar = this.f3689b;
                org.telegram.ui.Cells.i3 i3Var = aaVar.Y;
                if (aaVar.isShowing()) {
                    i3Var.f19293b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f19293b);
                    return;
                }
                return;
        }
    }
}
