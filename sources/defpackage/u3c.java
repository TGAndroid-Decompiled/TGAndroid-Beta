package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u3c extends vd4 {
    public final d4c Y;

    public u3c(d4c d4cVar, int i, t3c t3cVar) {
        super(5, i, t3cVar);
        this.Y = d4cVar;
    }

    @Override
    public final boolean A1() {
        d4c d4cVar = this.Y;
        if (d4cVar.n.getAdapter() == d4cVar.w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean X0() {
        return jb6.a0;
    }

    @Override
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int i2;
        View m;
        d4c d4cVar = this.Y;
        if (d4cVar.O) {
            return super.n0(i, ki2Var, r69Var);
        }
        int i3 = 0;
        if (d4cVar.M != null) {
            return 0;
        }
        if (d4cVar.N) {
            while (true) {
                i2 = 1;
                if (i3 >= r()) {
                    break;
                }
                t3c t3cVar = d4cVar.n;
                View q = q(i3);
                t3cVar.getClass();
                int R = RecyclerView.R(q);
                if (R < 1) {
                    i2 = R;
                    break;
                }
                i3++;
            }
            if (i2 == 0 && (m = d4cVar.r.m(i2)) != null && m.getTop() - i > gm.L(58.0f)) {
                i = m.getTop() - gm.L(58.0f);
            }
        }
        return super.n0(i, ki2Var, r69Var);
    }

    @Override
    public final boolean x0() {
        return false;
    }
}
