package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f9248a;
    public final org.telegram.ui.ActionBar.a2 f9249b;

    public e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9248a = i10;
        this.f9249b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f9248a) {
            case 0:
                this.f9249b.dismiss();
                return;
            default:
                this.f9249b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    sc Q = zc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f29112t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
