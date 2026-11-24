package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class xz3 extends s14 {
    public final t14 d;

    public xz3(t14 t14Var) {
        super(t14Var, 1);
        this.d = t14Var;
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
        t14 t14Var = this.d;
        uz3 uz3Var = t14Var.R;
        t14Var.V(uz3Var.H0());
        super.b(recyclerView, i, i2);
        t04 t04Var = t14Var.T;
        if (t04Var != null && t14Var.Q.getAdapter() == t04Var) {
            t04 t04Var2 = t04Var.y.a;
            if (!t04Var2.G.W.G && !t04Var2.F) {
                if (uz3Var.M0() + 20 > t04Var.b()) {
                    s04 s04Var = t04Var.y;
                    Objects.requireNonNull(s04Var);
                    gl.c3(new li3(s04Var, (byte) 26));
                }
            }
        }
    }
}
