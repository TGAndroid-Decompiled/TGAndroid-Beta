package defpackage;

import android.view.View;
public final class h93 implements x56, e39 {
    public final byte a;
    public final Object b;

    public h93(tj tjVar, int i, nc8 nc8Var, nc8 nc8Var2) {
        this.b = tjVar;
        this.a = i;
    }

    @Override
    public final boolean d(int i, View view) {
        s09 s09Var;
        t09 t09Var = (t09) this.b;
        if (this.a == 5 || (s09Var = t09Var.h0) == null || !(view instanceof r09)) {
            return false;
        }
        s09Var.q(t09Var, ((r09) view).e, true, false);
        return true;
    }

    @Override
    public final void invoke(Object obj) {
        uj ujVar = (uj) obj;
        ujVar.getClass();
        ujVar.y((tj) this.b, this.a);
    }

    public h93(t09 t09Var, int i) {
        this.b = t09Var;
        this.a = i;
    }
}
