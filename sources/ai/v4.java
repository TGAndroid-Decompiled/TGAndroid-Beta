package ai;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class v4 implements Runnable {
    public final int f2298a;
    public final org.telegram.ui.ActionBar.c2 f2299b;

    public v4(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f2298a = i10;
        this.f2299b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f2298a) {
            case 0:
                this.f2299b.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.oc Q = org.telegram.ui.Components.vc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f29213t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                this.f2299b.dismiss();
                return;
        }
    }
}
