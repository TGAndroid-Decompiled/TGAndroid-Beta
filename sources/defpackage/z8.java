package defpackage;

import android.content.Context;
import android.view.View;
public final class z8 extends s27 {
    public final byte l = 1;
    public final c9 m;

    public z8(c9 c9Var, Context context, zdb zdbVar, View view) {
        super(context, zdbVar, view, false, 2130968608, 0);
        this.m = c9Var;
        if ((zdbVar.A.x & 32) != 32) {
            View view2 = c9Var.r;
            this.e = view2 == null ? (View) c9Var.n : view2;
        }
        zm9 zm9Var = c9Var.N;
        this.h = zm9Var;
        p27 p27Var = this.i;
        if (p27Var != null) {
            p27Var.h(zm9Var);
        }
    }

    @Override
    public final void c() {
        byte b = this.l;
        c9 c9Var = this.m;
        switch (b) {
            case 0:
                c9Var.K = null;
                super.c();
                return;
            default:
                f27 f27Var = c9Var.c;
                if (f27Var != null) {
                    f27Var.c(true);
                }
                c9Var.J = null;
                super.c();
                return;
        }
    }

    public z8(c9 c9Var, Context context, f27 f27Var, View view) {
        super(context, f27Var, view, true, 2130968608, 0);
        this.m = c9Var;
        this.f = 8388613;
        zm9 zm9Var = c9Var.N;
        this.h = zm9Var;
        p27 p27Var = this.i;
        if (p27Var != null) {
            p27Var.h(zm9Var);
        }
    }
}
