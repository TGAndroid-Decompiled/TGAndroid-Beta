package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f8300a;
    public final org.telegram.ui.ActionBar.a2 f8301b;

    public e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f8300a = i10;
        this.f8301b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f8300a) {
            case 0:
                this.f8301b.dismiss();
                return;
            default:
                this.f8301b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    qc Q = xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f27588t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
