package hg;

import android.view.ViewGroup;
import di.ab;
import org.telegram.ui.Components.lm0;
public final class p1 extends lm0 {
    public j1 f10704c;
    public Integer d;
    public ab e;
    public boolean f10705f;
    public int h;

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() == 0) {
            return false;
        }
        return this.f10704c.D(b1Var);
    }

    @Override
    public final int h() {
        j1 j1Var = this.f10704c;
        int K = j1Var.K();
        j1Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f10704c.j(i10 - 1);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (i10 > 0) {
            this.f10704c.v(b1Var, i10 - 1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            ab abVar = new ab(this, viewGroup.getContext(), 4);
            this.e = abVar;
            return new s4.b1(abVar);
        }
        return this.f10704c.x(viewGroup, i10);
    }
}
