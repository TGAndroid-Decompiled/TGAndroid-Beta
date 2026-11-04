package kg;

import ai.x2;
import android.view.ViewGroup;
import org.telegram.ui.Components.sj0;
public final class k1 extends sj0 {
    public e1 f17075c;
    public Integer d;
    public x2 f17076e;
    public boolean f17077f;
    public int h;

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.b() == 0) {
            return false;
        }
        return this.f17075c.D(d1Var);
    }

    @Override
    public final int b() {
        e1 e1Var = this.f17075c;
        int K = e1Var.K();
        e1Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return -983904;
        }
        return this.f17075c.d(i3 - 1);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        if (i3 > 0) {
            this.f17075c.t(d1Var, i3 - 1);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (i3 == -983904) {
            x2 x2Var = new x2(7, viewGroup.getContext(), this);
            this.f17076e = x2Var;
            return new u4.d1(x2Var);
        }
        return this.f17075c.x(viewGroup, i3);
    }
}
