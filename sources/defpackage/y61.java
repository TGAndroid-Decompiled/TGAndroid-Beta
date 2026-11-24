package defpackage;

import android.view.View;
public final class y61 implements c39 {
    public final o39 a;
    public final z61 b;

    public y61(z61 z61Var, o39 o39Var) {
        this.b = z61Var;
        this.a = o39Var;
    }

    @Override
    public final void d(int i, View view) {
        o71 o71Var = this.b.f;
        o39 o39Var = this.a;
        a71 a71Var = (a71) o39Var.getAdapter();
        h71 h71Var = (h71) a71Var.e.get(i);
        if (view instanceof qfa) {
            int i2 = o71.H;
            o71Var.c(h71Var, (j71) a71Var, o39Var);
            return;
        }
        d71 d71Var = o71Var.G;
        if (d71Var != null) {
            d71Var.i(h71Var.c, h71Var.d, false);
        }
    }
}
