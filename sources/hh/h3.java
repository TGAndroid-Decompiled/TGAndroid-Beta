package hh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

public final class h3 implements Runnable {

    public final int f9379a;

    public final org.telegram.ui.ActionBar.b2 f9380b;

    public h3(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9379a = i10;
        this.f9380b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f9379a) {
            case 0:
                this.f9380b.dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    ec ecVarQ = mc.a0(n2VarU).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    ecVarQ.f28030t = true;
                    ecVarQ.j();
                }
                break;
            default:
                this.f9380b.dismiss();
                break;
        }
    }
}
