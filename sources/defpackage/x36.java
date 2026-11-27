package defpackage;

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;
public final class x36 implements fd, t69 {
    public final byte a;
    public final l46 b;

    public x36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override
    public final boolean e(int i, View view) {
        l46 l46Var = this.b;
        l46Var.n1.getOnItemClickListener().e(i, view);
        if (l46Var.c2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                l46Var.F2.presentFragment(new PremiumPreviewFragment(0, null));
                l46Var.dismiss();
                idVar.dismiss();
                return;
            default:
                idVar.dismiss();
                l46Var.a1();
                return;
        }
    }
}
