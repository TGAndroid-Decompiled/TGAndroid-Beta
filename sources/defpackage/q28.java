package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class q28 extends k69 {
    public final boolean a;
    public final w28 b;

    public q28(w28 w28Var, int i) {
        this.b = w28Var;
        this.a = i;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ava avaVar;
        w28 w28Var = this.b;
        w28Var.h();
        if (w28Var.L != null) {
            if (w28Var.K != null && w28Var.b()) {
                w28Var.K.l(false);
                return;
            }
            return;
        }
        d38 d38Var = w28Var.q0;
        if (this.a) {
            avaVar = d38Var.c;
        } else {
            avaVar = d38Var.b;
        }
        if (avaVar != null && w28Var.b()) {
            avaVar.a();
        }
    }
}
