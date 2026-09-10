package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public final class h3 implements Runnable {
    public final int f6666a;
    public final org.telegram.ui.ActionBar.d2 f6667b;

    public h3(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f6666a = i10;
        this.f6667b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f6666a) {
            case 0:
                this.f6667b.dismiss();
                return;
            default:
                this.f6667b.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    pc Q = wc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.f26091t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
