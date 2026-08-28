package of;

import android.view.ViewGroup;
import fh.l2;
import org.telegram.ui.Components.vk0;
public final class k1 extends vk0 {
    public f1 f19398c;
    public Integer d;
    public l2 f19399e;
    public boolean f19400f;
    public int h;

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.b() == 0) {
            return false;
        }
        return this.f19398c.D(q1Var);
    }

    @Override
    public final int h() {
        f1 f1Var = this.f19398c;
        int K = f1Var.K();
        f1Var.H0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return -983904;
        }
        return this.f19398c.j(i9 - 1);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (i9 > 0) {
            this.f19398c.v(q1Var, i9 - 1);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (i9 == -983904) {
            l2 l2Var = new l2(this, viewGroup.getContext(), 6);
            this.f19399e = l2Var;
            return new f2.q1(l2Var);
        }
        return this.f19398c.x(viewGroup, i9);
    }
}
