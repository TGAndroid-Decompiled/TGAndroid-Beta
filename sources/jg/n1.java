package jg;

import android.view.ViewGroup;
import bi.i3;
import org.telegram.ui.Components.bk0;
public final class n1 extends bk0 {
    public h1 f17597c;
    public Integer d;
    public i3 f17598e;
    public boolean f17599f;
    public int h;

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.b() == 0) {
            return false;
        }
        return this.f17597c.D(f1Var);
    }

    @Override
    public final int b() {
        h1 h1Var = this.f17597c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.f17597c.d(i7 - 1);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 > 0) {
            this.f17597c.t(f1Var, i7 - 1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == -983904) {
            i3 i3Var = new i3(5, viewGroup.getContext(), this);
            this.f17598e = i3Var;
            return new v4.f1(i3Var);
        }
        return this.f17597c.x(viewGroup, i7);
    }
}
