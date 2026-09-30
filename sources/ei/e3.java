package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f8312a;
    public final org.telegram.ui.ActionBar.a2 f8313b;

    public e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f8312a = i10;
        this.f8313b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f8312a) {
            case 0:
                this.f8313b.dismiss();
                return;
            default:
                this.f8313b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    rc Q = yc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f27956t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
