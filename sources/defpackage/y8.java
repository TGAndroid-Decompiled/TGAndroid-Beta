package defpackage;

import android.content.Context;
import android.view.View;
public final class y8 extends l27 {
    public final byte l = 0;
    public final b9 m;

    public y8(b9 b9Var, Context context, dcb dcbVar, View view) {
        super(context, dcbVar, view, false, 2130968608, 0);
        this.m = b9Var;
        if ((dcbVar.A.x & 32) != 32) {
            View view2 = b9Var.r;
            this.e = view2 == null ? (View) b9Var.n : view2;
        }
        nl9 nl9Var = b9Var.N;
        this.h = nl9Var;
        i27 i27Var = this.i;
        if (i27Var != null) {
            i27Var.h(nl9Var);
        }
    }

    @Override
    public final void c() {
        byte b = this.l;
        b9 b9Var = this.m;
        switch (b) {
            case 0:
                b9Var.K = null;
                super.c();
                return;
            default:
                y17 y17Var = b9Var.c;
                if (y17Var != null) {
                    y17Var.c(true);
                }
                b9Var.J = null;
                super.c();
                return;
        }
    }

    public y8(b9 b9Var, Context context, y17 y17Var, View view) {
        super(context, y17Var, view, true, 2130968608, 0);
        this.m = b9Var;
        this.f = 8388613;
        nl9 nl9Var = b9Var.N;
        this.h = nl9Var;
        i27 i27Var = this.i;
        if (i27Var != null) {
            i27Var.h(nl9Var);
        }
    }
}
