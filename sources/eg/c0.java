package eg;

import android.view.View;
import gg.v2;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class c0 implements org.telegram.ui.ActionBar.c2, kl0 {
    public final int f5225a;
    public final v0 f5226b;

    public c0(v0 v0Var, int i10) {
        this.f5225a = i10;
        this.f5226b = v0Var;
    }

    @Override
    public boolean f(int i10, View view) {
        v0 v0Var = this.f5226b;
        v0Var.d.getOnItemClickListener().f(i10, view);
        if (v0Var.f5538e0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f5225a) {
            case 0:
                v0 v0Var = this.f5226b;
                v0Var.H0.presentFragment(new PremiumPreviewFragment(0, null));
                v0Var.dismiss();
                d2Var.dismiss();
                return;
            case 1:
                d2Var.dismiss();
                this.f5226b.n1();
                return;
            default:
                this.f5226b.dismiss();
                v2.e0(0, null);
                return;
        }
    }
}
