package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f9251a;
    public final org.telegram.ui.ActionBar.a2 f9252b;

    public e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9251a = i10;
        this.f9252b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f9251a) {
            case 0:
                this.f9252b.dismiss();
                return;
            default:
                this.f9252b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    sc Q = zc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f28815t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
