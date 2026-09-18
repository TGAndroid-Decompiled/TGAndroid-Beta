package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f8318a;
    public final org.telegram.ui.ActionBar.c2 f8319b;

    public e3(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f8318a = i10;
        this.f8319b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f8318a) {
            case 0:
                this.f8319b.dismiss();
                return;
            default:
                this.f8319b.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    oc Q = vc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f26715t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
