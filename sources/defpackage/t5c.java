package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class t5c extends sd4 {
    public final d6c Y;

    public t5c(d6c d6cVar, int i, s5c s5cVar) {
        super(5, i, s5cVar);
        this.Y = d6cVar;
    }

    @Override
    public final boolean A1() {
        d6c d6cVar = this.Y;
        if (d6cVar.n.getAdapter() == d6cVar.w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean X0() {
        return ob6.a0;
    }

    @Override
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        int i2;
        View m;
        d6c d6cVar = this.Y;
        if (d6cVar.O) {
            return super.n0(i, oh2Var, c89Var);
        }
        int i3 = 0;
        if (d6cVar.M != null) {
            return 0;
        }
        if (d6cVar.N) {
            while (true) {
                i2 = 1;
                if (i3 >= r()) {
                    break;
                }
                s5c s5cVar = d6cVar.n;
                View q = q(i3);
                s5cVar.getClass();
                int S = RecyclerView.S(q);
                if (S < 1) {
                    i2 = S;
                    break;
                }
                i3++;
            }
            if (i2 == 0 && (m = d6cVar.r.m(i2)) != null && m.getTop() - i > hl.L(58.0f)) {
                i = m.getTop() - hl.L(58.0f);
            }
        }
        return super.n0(i, oh2Var, c89Var);
    }

    @Override
    public final boolean x0() {
        return false;
    }
}
