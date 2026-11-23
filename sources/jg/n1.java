package jg;

import android.view.ViewGroup;
import bi.o3;
import org.telegram.ui.Components.dk0;
public final class n1 extends dk0 {
    public h1 f17693c;
    public Integer d;
    public o3 f17694e;
    public boolean f17695f;
    public int h;

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.b() == 0) {
            return false;
        }
        return this.f17693c.D(f1Var);
    }

    @Override
    public final int b() {
        h1 h1Var = this.f17693c;
        int K = h1Var.K();
        h1Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.f17693c.d(i7 - 1);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 > 0) {
            this.f17693c.t(f1Var, i7 - 1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == -983904) {
            o3 o3Var = new o3(5, viewGroup.getContext(), this);
            this.f17694e = o3Var;
            return new v4.f1(o3Var);
        }
        return this.f17693c.x(viewGroup, i7);
    }
}
