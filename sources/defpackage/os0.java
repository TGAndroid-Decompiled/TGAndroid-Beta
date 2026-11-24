package defpackage;

import org.telegram.ui.ActionBar.d;
public final class os0 {
    public final rs0 a;

    public os0(rs0 rs0Var) {
        this.a = rs0Var;
    }

    public final void a() {
        sy4 sy4Var;
        rs0 rs0Var = this.a;
        ls0 ls0Var = rs0Var.n;
        sy4Var = ((d) rs0Var).glassEngine;
        sy4Var.g();
        su suVar = rs0Var.c;
        if (suVar != null) {
            suVar.invalidate();
        }
        if (rs0Var.s == null) {
            gm.r(ls0Var);
            gm.d3(ls0Var, 300L);
        }
    }
}
