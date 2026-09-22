package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f8315a;
    public final org.telegram.ui.ActionBar.b2 f8316b;

    public e3(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8315a = i10;
        this.f8316b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f8315a) {
            case 0:
                this.f8316b.dismiss();
                return;
            default:
                this.f8316b.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    oc Q = vc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f26761t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
