package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f8301a;
    public final org.telegram.ui.ActionBar.b2 f8302b;

    public e3(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8301a = i10;
        this.f8302b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f8301a) {
            case 0:
                this.f8302b.dismiss();
                return;
            default:
                this.f8302b.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    qc Q = xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f27316t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
