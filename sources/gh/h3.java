package gh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
public final class h3 implements Runnable {
    public final int f8201a;
    public final org.telegram.ui.ActionBar.c2 f8202b;

    public h3(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f8201a = i9;
        this.f8202b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f8201a) {
            case 0:
                this.f8202b.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    gc Q = oc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f28747t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                this.f8202b.dismiss();
                return;
        }
    }
}
