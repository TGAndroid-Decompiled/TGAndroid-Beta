package nh;

import android.view.View;
import org.telegram.ui.Components.e71;
public final class b0 extends e71 {
    public final j0 f18617a;

    public b0(j0 j0Var) {
        this.f18617a = j0Var;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        ((g0) view).getClass();
    }

    @Override
    public final View d(int i9) {
        j0 j0Var = this.f18617a;
        if (i9 == 2) {
            return j0Var.f18657x;
        }
        if (i9 == 0) {
            return j0Var.v;
        }
        return j0Var.f18656w;
    }

    @Override
    public final int e() {
        if (this.f18617a.J) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i9) {
        if (this.f18617a.J || i9 == 2) {
            return 2;
        }
        if (i9 == 0) {
            return 0;
        }
        return 1;
    }
}
