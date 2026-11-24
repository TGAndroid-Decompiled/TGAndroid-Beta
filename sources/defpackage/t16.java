package defpackage;

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;
public final class t16 implements ed, e39 {
    public final byte a;
    public final h26 b;

    public t16(h26 h26Var, byte b) {
        this.a = b;
        this.b = h26Var;
    }

    @Override
    public final boolean d(int i, View view) {
        h26 h26Var = this.b;
        h26Var.n1.getOnItemClickListener().d(i, view);
        if (h26Var.c2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        h26 h26Var = this.b;
        switch (b) {
            case 0:
                h26Var.F2.presentFragment(new PremiumPreviewFragment(0, null));
                h26Var.dismiss();
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                h26Var.Z0();
                return;
        }
    }
}
