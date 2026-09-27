package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f8302a;
    public final org.telegram.ui.ActionBar.c2 f8303b;

    public e3(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f8302a = i10;
        this.f8303b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f8302a) {
            case 0:
                this.f8303b.dismiss();
                return;
            default:
                this.f8303b.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    qc Q = xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f27701t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
