package ai;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class v4 implements Runnable {
    public final int f2296a;
    public final org.telegram.ui.ActionBar.b2 f2297b;

    public v4(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f2296a = i10;
        this.f2297b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f2296a) {
            case 0:
                this.f2297b.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f29544t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                this.f2297b.dismiss();
                return;
        }
    }
}
