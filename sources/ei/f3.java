package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f9034a;
    public final org.telegram.ui.ActionBar.b2 f9035b;

    public f3(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9034a = i10;
        this.f9035b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f9034a) {
            case 0:
                this.f9035b.dismiss();
                return;
            default:
                this.f9035b.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    rc Q = yc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f30348t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
