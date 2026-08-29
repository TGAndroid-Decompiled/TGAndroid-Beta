package cg;

import android.view.View;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class c0 implements org.telegram.ui.ActionBar.b2, bl0 {
    public final int f3077a;
    public final v0 f3078b;

    public c0(v0 v0Var, int i10) {
        this.f3077a = i10;
        this.f3078b = v0Var;
    }

    @Override
    public boolean c(int i10, View view) {
        v0 v0Var = this.f3078b;
        v0Var.d.getOnItemClickListener().c(i10, view);
        if (v0Var.f3404d0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f3077a) {
            case 0:
                v0 v0Var = this.f3078b;
                v0Var.G0.presentFragment(new PremiumPreviewFragment(0, null));
                v0Var.dismiss();
                c2Var.dismiss();
                return;
            case 1:
                c2Var.dismiss();
                this.f3078b.n1();
                return;
            default:
                this.f3078b.dismiss();
                eg.w2.e0(0, null);
                return;
        }
    }
}
