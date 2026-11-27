package defpackage;

import android.view.View;
public final class ba3 implements b86, t69 {
    public final byte a;
    public final Object b;

    public ba3(uj ujVar, int i, cg8 cg8Var, cg8 cg8Var2) {
        this.b = ujVar;
        this.a = i;
    }

    @Override
    public final boolean e(int i, View view) {
        h49 h49Var;
        i49 i49Var = (i49) this.b;
        if (this.a == 5 || (h49Var = i49Var.h0) == null || !(view instanceof g49)) {
            return false;
        }
        h49Var.e(i49Var, ((g49) view).e, true, false);
        return true;
    }

    @Override
    public final void invoke(Object obj) {
        vj vjVar = (vj) obj;
        vjVar.getClass();
        vjVar.y((uj) this.b, this.a);
    }

    public ba3(i49 i49Var, int i) {
        this.b = i49Var;
        this.a = i;
    }
}
