package mh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class g3 implements Runnable {
    public final int f14077a;
    public final org.telegram.ui.ActionBar.d2 f14078b;

    public g3(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f14077a = i10;
        this.f14078b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f14077a) {
            case 0:
                this.f14078b.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    ic Q = qc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f27755t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                this.f14078b.dismiss();
                return;
        }
    }
}
