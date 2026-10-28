package bi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class q4 implements Runnable {
    public final int f5265a;
    public final org.telegram.ui.ActionBar.e2 f5266b;

    public q4(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f5265a = i10;
        this.f5266b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f5265a) {
            case 0:
                this.f5266b.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(U).R(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    R.f31872u = true;
                    R.j();
                    return;
                }
                return;
            default:
                this.f5266b.dismiss();
                return;
        }
    }
}
