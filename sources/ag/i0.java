package ag;

import android.view.View;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.PremiumPreviewFragment;

public final class i0 implements org.telegram.ui.ActionBar.a2, rk0 {

    public final int f427a;

    public final i1 f428b;

    public i0(i1 i1Var, int i10) {
        this.f427a = i10;
        this.f428b = i1Var;
    }

    @Override
    public boolean a(int i10, View view) {
        i1 i1Var = this.f428b;
        i1Var.d.getOnItemClickListener().a(i10, view);
        if (i1Var.f432d0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f427a) {
            case 0:
                i1 i1Var = this.f428b;
                i1Var.G0.presentFragment(new PremiumPreviewFragment(0, null));
                i1Var.dismiss();
                b2Var.dismiss();
                break;
            case 1:
                b2Var.dismiss();
                this.f428b.n1();
                break;
            default:
                this.f428b.dismiss();
                cg.y2.e0(0, null);
                break;
        }
    }
}
