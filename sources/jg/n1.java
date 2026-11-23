package jg;

import android.view.ViewGroup;
import bi.o3;
import org.telegram.ui.Components.dk0;
public final class n1 extends dk0 {
    public h1 f17591c;
    public Integer d;
    public o3 f17592e;
    public boolean f17593f;
    public int h;

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.b() == 0) {
            return false;
        }
        return this.f17591c.D(e1Var);
    }

    @Override
    public final int b() {
        h1 h1Var = this.f17591c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.f17591c.d(i7 - 1);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        if (i7 > 0) {
            this.f17591c.t(e1Var, i7 - 1);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 == -983904) {
            o3 o3Var = new o3(5, viewGroup.getContext(), this);
            this.f17592e = o3Var;
            return new v4.e1(o3Var);
        }
        return this.f17591c.x(viewGroup, i7);
    }
}
