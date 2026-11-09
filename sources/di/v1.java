package di;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.l60;
public final class v1 implements View.OnLongClickListener {
    public final int f9855a;
    public final j4 f9856b;

    public v1(j4 j4Var, int i7) {
        this.f9855a = i7;
        this.f9856b = j4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f9855a;
        boolean z9 = false;
        j4 j4Var = this.f9856b;
        switch (i7) {
            case 0:
                if (j4Var.B0(true)) {
                    return false;
                }
                l60 F = l60.F(j4Var.f9224s0.f9643w, j4Var.f9195k0, view);
                F.c(2131232116, id.M0(2131748810, null), new w1(j4Var, 6), false);
                if (j4Var.f9235u3 > 0) {
                    z9 = true;
                }
                F.l(2131231786, id.M0(2131748809, null), new w1(j4Var, 7), z9);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                j4Var.f9232u0.k(j4Var.B0(false));
                return true;
        }
    }
}
