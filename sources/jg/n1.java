package jg;

import android.view.ViewGroup;
import bi.m3;
import org.telegram.ui.Components.dk0;
public final class n1 extends dk0 {
    public h1 f17622c;
    public Integer d;
    public m3 f17623e;
    public boolean f17624f;
    public int h;

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.b() == 0) {
            return false;
        }
        return this.f17622c.D(f1Var);
    }

    @Override
    public final int b() {
        h1 h1Var = this.f17622c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.f17622c.d(i7 - 1);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 > 0) {
            this.f17622c.t(f1Var, i7 - 1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == -983904) {
            m3 m3Var = new m3(5, viewGroup.getContext(), this);
            this.f17623e = m3Var;
            return new v4.f1(m3Var);
        }
        return this.f17622c.x(viewGroup, i7);
    }
}
