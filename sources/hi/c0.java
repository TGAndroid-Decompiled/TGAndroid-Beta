package hi;

import android.view.View;
import org.telegram.ui.Components.w81;
public final class c0 extends w81 {
    public final k0 f12134a;

    public c0(k0 k0Var) {
        this.f12134a = k0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ((h0) view).getClass();
    }

    @Override
    public final View d(int i10) {
        k0 k0Var = this.f12134a;
        if (i10 == 2) {
            return k0Var.f12175x;
        }
        if (i10 == 0) {
            return k0Var.v;
        }
        return k0Var.f12174w;
    }

    @Override
    public final int e() {
        if (this.f12134a.N) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (this.f12134a.N || i10 == 2) {
            return 2;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
