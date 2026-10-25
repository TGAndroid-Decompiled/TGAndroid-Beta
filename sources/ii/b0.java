package ii;

import android.view.View;
import org.telegram.ui.Components.m91;
public final class b0 extends m91 {
    public final j0 f14328a;

    public b0(j0 j0Var) {
        this.f14328a = j0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ((g0) view).getClass();
    }

    @Override
    public final View d(int i10) {
        j0 j0Var = this.f14328a;
        if (i10 == 2) {
            return j0Var.f14365x;
        }
        if (i10 == 0) {
            return j0Var.v;
        }
        return j0Var.f14364w;
    }

    @Override
    public final int e() {
        if (this.f14328a.N) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (this.f14328a.N || i10 == 2) {
            return 2;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
