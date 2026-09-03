package eg;

import android.view.View;
import gg.v2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class c0 implements org.telegram.ui.ActionBar.c2, jl0 {
    public final int f5214a;
    public final v0 f5215b;

    public c0(v0 v0Var, int i10) {
        this.f5214a = i10;
        this.f5215b = v0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        v0 v0Var = this.f5215b;
        v0Var.d.getOnItemClickListener().d(i10, view);
        if (v0Var.f5527e0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f5214a) {
            case 0:
                v0 v0Var = this.f5215b;
                v0Var.H0.presentFragment(new PremiumPreviewFragment(0, null));
                v0Var.dismiss();
                d2Var.dismiss();
                return;
            case 1:
                d2Var.dismiss();
                this.f5215b.n1();
                return;
            default:
                this.f5215b.dismiss();
                v2.e0(0, null);
                return;
        }
    }
}
