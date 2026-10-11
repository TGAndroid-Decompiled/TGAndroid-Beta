package gg;

import android.view.ViewGroup;
import ci.bb;
import org.telegram.ui.Components.qm0;
public final class p1 extends qm0 {
    public j1 f10765c;
    public Integer d;
    public bb f10766e;
    public boolean f10767f;
    public int h;

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.b() == 0) {
            return false;
        }
        return this.f10765c.D(d1Var);
    }

    @Override
    public final int h() {
        j1 j1Var = this.f10765c;
        int K = j1Var.K();
        j1Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f10765c.j(i10 - 1);
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (i10 > 0) {
            this.f10765c.v(d1Var, i10 - 1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            bb bbVar = new bb(this, viewGroup.getContext(), 4);
            this.f10766e = bbVar;
            return new s4.d1(bbVar);
        }
        return this.f10765c.x(viewGroup, i10);
    }
}
