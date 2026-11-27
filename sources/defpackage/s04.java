package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class s04 extends n24 {
    public final o24 d;

    public s04(o24 o24Var) {
        super(o24Var, 1);
        this.d = o24Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        o24 o24Var = this.d;
        p04 p04Var = o24Var.R;
        o24Var.U(p04Var.H0());
        super.b(recyclerView, i, i2);
        o14 o14Var = o24Var.T;
        if (o14Var != null && o24Var.Q.getAdapter() == o14Var) {
            o14 o14Var2 = o14Var.y.a;
            if (!o14Var2.G.W.G && !o14Var2.F) {
                if (p04Var.M0() + 20 > o14Var.b()) {
                    n14 n14Var = o14Var.y;
                    Objects.requireNonNull(n14Var);
                    hl.c3(new lw3(n14Var, (byte) 5));
                }
            }
        }
    }
}
