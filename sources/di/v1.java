package di;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.k60;
public final class v1 implements View.OnLongClickListener {
    public final int f9862a;
    public final i4 f9863b;

    public v1(i4 i4Var, int i7) {
        this.f9862a = i7;
        this.f9863b = i4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f9862a;
        boolean z9 = false;
        i4 i4Var = this.f9863b;
        switch (i7) {
            case 0:
                if (i4Var.B0(true)) {
                    return false;
                }
                k60 F = k60.F(i4Var.f9192s0.f9578w, i4Var.f9163k0, view);
                F.c(2131232116, id.M0(2131748811, null), new w1(i4Var, 6), false);
                if (i4Var.f9203u3 > 0) {
                    z9 = true;
                }
                F.l(2131231786, id.M0(2131748810, null), new w1(i4Var, 7), z9);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                i4Var.f9200u0.k(i4Var.B0(false));
                return true;
        }
    }
}
