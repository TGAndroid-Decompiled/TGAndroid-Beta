package kg;

import android.view.View;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.PremiumPreviewFragment;
public final class b0 implements org.telegram.ui.ActionBar.u1, jk0 {
    public final int f11006a;
    public final q0 f11007b;

    public b0(q0 q0Var, int i10) {
        this.f11006a = i10;
        this.f11007b = q0Var;
    }

    @Override
    public boolean f(int i10, View view) {
        q0 q0Var = this.f11007b;
        q0Var.f26724k1.getOnItemClickListener().f(i10, view);
        if (q0Var.Z1 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f11006a) {
            case 0:
                q0 q0Var = this.f11007b;
                q0Var.C2.presentFragment(new PremiumPreviewFragment(0, null));
                q0Var.dismiss();
                x1Var.dismiss();
                return;
            default:
                x1Var.dismiss();
                this.f11007b.i1();
                return;
        }
    }
}
