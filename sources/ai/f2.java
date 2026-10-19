package ai;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class f2 implements Runnable {
    public final int f1271a;
    public final org.telegram.ui.ActionBar.b2 f1272b;

    public f2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f1271a = i10;
        this.f1272b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f1271a) {
            case 0:
                this.f1272b.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f29606t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                this.f1272b.dismiss();
                return;
        }
    }
}
