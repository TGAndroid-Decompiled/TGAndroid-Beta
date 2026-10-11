package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f9033a;
    public final org.telegram.ui.ActionBar.a2 f9034b;

    public e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9033a = i10;
        this.f9034b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f9033a) {
            case 0:
                this.f9034b.dismiss();
                return;
            default:
                this.f9034b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    sc Q = ad.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f30843t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
