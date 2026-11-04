package ei;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f60;
public final class z1 implements View.OnLongClickListener {
    public final int f11263a;
    public final j4 f11264b;

    public z1(j4 j4Var, int i3) {
        this.f11263a = i3;
        this.f11264b = j4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i3 = this.f11263a;
        boolean z10 = false;
        j4 j4Var = this.f11264b;
        switch (i3) {
            case 0:
                if (j4Var.B0(true)) {
                    return false;
                }
                f60 F = f60.F(j4Var.f10506t0.f10957w, j4Var.f10476l0, view);
                F.c(2131232116, bd.M0(2131748818, null), new a2(j4Var, 6), false);
                if (j4Var.f10517v3 > 0) {
                    z10 = true;
                }
                F.l(2131231786, bd.M0(2131748817, null), new a2(j4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                j4Var.f10514v0.k(j4Var.B0(false));
                return true;
        }
    }
}
