package hi;

import android.view.View;
import org.telegram.ui.Components.u81;
public final class c0 extends u81 {
    public final k0 f12135a;

    public c0(k0 k0Var) {
        this.f12135a = k0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ((h0) view).getClass();
    }

    @Override
    public final View d(int i10) {
        k0 k0Var = this.f12135a;
        if (i10 == 2) {
            return k0Var.f12176x;
        }
        if (i10 == 0) {
            return k0Var.v;
        }
        return k0Var.f12175w;
    }

    @Override
    public final int e() {
        if (this.f12135a.N) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (this.f12135a.N || i10 == 2) {
            return 2;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
