package jg;

import android.view.ViewGroup;
import bi.ec;
import org.telegram.ui.Components.oj0;
public final class o1 extends oj0 {
    public i1 f16873c;
    public Integer d;
    public ec f16874e;
    public boolean f16875f;
    public int h;

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.b() == 0) {
            return false;
        }
        return this.f16873c.D(d1Var);
    }

    @Override
    public final int b() {
        i1 i1Var = this.f16873c;
        int K = i1Var.K();
        i1Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.f16873c.d(i7 - 1);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (i7 > 0) {
            this.f16873c.t(d1Var, i7 - 1);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 == -983904) {
            ec ecVar = new ec(6, viewGroup.getContext(), this);
            this.f16874e = ecVar;
            return new v4.d1(ecVar);
        }
        return this.f16873c.x(viewGroup, i7);
    }
}
