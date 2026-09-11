package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f9638a;
    public final org.telegram.ui.ActionBar.b2 f9639b;

    public e3(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9638a = i10;
        this.f9639b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f9638a) {
            case 0:
                this.f9639b.dismiss();
                return;
            default:
                this.f9639b.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    qc Q = yc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f29689t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
