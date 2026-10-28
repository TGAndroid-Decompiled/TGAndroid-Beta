package ig;

import android.view.ViewGroup;
import bi.cc;
import org.telegram.ui.Components.mm0;
public final class p1 extends mm0 {
    public j1 f14202c;
    public Integer d;
    public cc e;
    public boolean f14203f;
    public int h;

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.b() == 0) {
            return false;
        }
        return this.f14202c.D(e1Var);
    }

    @Override
    public final int h() {
        j1 j1Var = this.f14202c;
        int K = j1Var.K();
        j1Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f14202c.j(i10 - 1);
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        if (i10 > 0) {
            this.f14202c.v(e1Var, i10 - 1);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            cc ccVar = new cc(this, viewGroup.getContext(), 4);
            this.e = ccVar;
            return new s4.e1(ccVar);
        }
        return this.f14202c.x(viewGroup, i10);
    }
}
