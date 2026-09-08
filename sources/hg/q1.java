package hg;

import android.view.ViewGroup;
import di.eb;
import org.telegram.ui.Components.kl0;
public final class q1 extends kl0 {
    public k1 f11247c;
    public Integer d;
    public eb f11248e;
    public boolean f11249f;
    public int h;

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.f11247c.D(c1Var);
    }

    @Override
    public final int h() {
        k1 k1Var = this.f11247c;
        int K = k1Var.K();
        k1Var.L0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f11247c.j(i10 - 1);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.f11247c.v(c1Var, i10 - 1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            eb ebVar = new eb(this, viewGroup.getContext(), 4);
            this.f11248e = ebVar;
            return new s4.c1(ebVar);
        }
        return this.f11247c.x(viewGroup, i10);
    }
}
