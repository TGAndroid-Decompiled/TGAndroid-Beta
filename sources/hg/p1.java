package hg;

import ai.hc;
import android.view.ViewGroup;
import org.telegram.ui.Components.hm0;
public final class p1 extends hm0 {
    public j1 f12011c;
    public Integer d;
    public hc e;
    public boolean f12012f;
    public int h;

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() == 0) {
            return false;
        }
        return this.f12011c.D(b1Var);
    }

    @Override
    public final int h() {
        j1 j1Var = this.f12011c;
        int K = j1Var.K();
        j1Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f12011c.j(i10 - 1);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (i10 > 0) {
            this.f12011c.v(b1Var, i10 - 1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            hc hcVar = new hc(this, viewGroup.getContext(), 4);
            this.e = hcVar;
            return new s4.b1(hcVar);
        }
        return this.f12011c.x(viewGroup, i10);
    }
}
