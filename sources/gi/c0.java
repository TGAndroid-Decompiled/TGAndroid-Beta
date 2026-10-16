package gi;

import android.view.View;
import org.telegram.ui.Components.d91;
public final class c0 extends d91 {
    public final k0 f10170a;

    public c0(k0 k0Var) {
        this.f10170a = k0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ((h0) view).getClass();
    }

    @Override
    public final View d(int i10) {
        k0 k0Var = this.f10170a;
        if (i10 == 2) {
            return k0Var.f10211x;
        }
        if (i10 == 0) {
            return k0Var.v;
        }
        return k0Var.f10210w;
    }

    @Override
    public final int e() {
        if (this.f10170a.N) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (this.f10170a.N || i10 == 2) {
            return 2;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
