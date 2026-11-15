package jg;

import android.view.ViewGroup;
import bi.o2;
import org.telegram.ui.Components.tj0;
public final class n1 extends tj0 {
    public h1 f17214c;
    public Integer d;
    public o2 f17215e;
    public boolean f17216f;
    public int h;

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.b() == 0) {
            return false;
        }
        return this.f17214c.D(e1Var);
    }

    @Override
    public final int b() {
        h1 h1Var = this.f17214c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.f17214c.d(i7 - 1);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        if (i7 > 0) {
            this.f17214c.t(e1Var, i7 - 1);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 == -983904) {
            o2 o2Var = new o2(5, viewGroup.getContext(), this);
            this.f17215e = o2Var;
            return new v4.e1(o2Var);
        }
        return this.f17214c.x(viewGroup, i7);
    }
}
