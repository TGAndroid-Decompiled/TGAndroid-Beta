package defpackage;

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;
public final class t36 implements ee, h59 {
    public final byte a;
    public final i46 b;

    public t36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override
    public final boolean g(int i, View view) {
        i46 i46Var = this.b;
        i46Var.n1.getOnItemClickListener().g(i, view);
        if (i46Var.c2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                i46Var.F2.presentFragment(new PremiumPreviewFragment(0, null));
                i46Var.dismiss();
                heVar.dismiss();
                return;
            default:
                heVar.dismiss();
                i46Var.Z0();
                return;
        }
    }
}
