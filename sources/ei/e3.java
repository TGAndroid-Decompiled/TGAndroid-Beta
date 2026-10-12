package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f9031a;
    public final org.telegram.ui.ActionBar.a2 f9032b;

    public e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9031a = i10;
        this.f9032b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f9031a) {
            case 0:
                this.f9032b.dismiss();
                return;
            default:
                this.f9032b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    sc Q = zc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f30550t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
