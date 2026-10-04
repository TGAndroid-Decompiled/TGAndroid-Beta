package gg;

import android.view.ViewGroup;
import ci.ab;
import org.telegram.ui.Components.yl0;
public final class q1 extends yl0 {
    public k1 f10760c;
    public Integer d;
    public ab f10761e;
    public boolean f10762f;
    public int h;

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.f10760c.D(c1Var);
    }

    @Override
    public final int h() {
        k1 k1Var = this.f10760c;
        int K = k1Var.K();
        k1Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f10760c.j(i10 - 1);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.f10760c.v(c1Var, i10 - 1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            ab abVar = new ab(this, viewGroup.getContext(), 4);
            this.f10761e = abVar;
            return new s4.c1(abVar);
        }
        return this.f10760c.x(viewGroup, i10);
    }
}
