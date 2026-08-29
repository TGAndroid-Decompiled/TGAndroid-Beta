package jh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class h3 implements Runnable {
    public final int f12157a;
    public final org.telegram.ui.ActionBar.c2 f12158b;

    public h3(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f12157a = i10;
        this.f12158b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f12157a) {
            case 0:
                this.f12158b.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    mc Q = tc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f30662t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                this.f12158b.dismiss();
                return;
        }
    }
}
