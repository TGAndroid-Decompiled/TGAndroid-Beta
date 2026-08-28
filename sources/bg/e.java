package bg;

import android.view.View;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.PremiumPreviewFragment;
public final class e implements org.telegram.ui.ActionBar.b2, ok0 {
    public final int f1737a;
    public final zf.j0 f1738b;

    public e(zf.j0 j0Var, int i9) {
        this.f1737a = i9;
        this.f1738b = j0Var;
    }

    @Override
    public boolean a(int i9, View view) {
        zf.j0 j0Var = this.f1738b;
        j0Var.d.getOnItemClickListener().a(i9, view);
        if (j0Var.f50535d0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f1737a) {
            case 0:
                this.f1738b.dismiss();
                g3.d0(0, null);
                return;
            case 1:
                zf.j0 j0Var = this.f1738b;
                j0Var.G0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                this.f1738b.n1();
                return;
        }
    }
}
