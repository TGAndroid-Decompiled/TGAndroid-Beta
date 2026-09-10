package fg;

import android.view.ViewGroup;
import bi.nc;
import org.telegram.ui.Components.ul0;
public final class r1 extends ul0 {
    public l1 f8191c;
    public Integer d;
    public nc e;
    public boolean f8192f;
    public int h;

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.f8191c.D(c1Var);
    }

    @Override
    public final int h() {
        l1 l1Var = this.f8191c;
        int K = l1Var.K();
        l1Var.L0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f8191c.j(i10 - 1);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.f8191c.v(c1Var, i10 - 1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            nc ncVar = new nc(this, viewGroup.getContext(), 4);
            this.e = ncVar;
            return new s4.c1(ncVar);
        }
        return this.f8191c.x(viewGroup, i10);
    }
}
