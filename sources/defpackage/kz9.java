package defpackage;

import android.content.Context;
public final class kz9 extends u0b {
    public final ny9 H3;

    public kz9(ny9 ny9Var, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context);
        this.H3 = ny9Var;
    }

    @Override
    public final boolean B1() {
        if (!e86.e(16388) && this.H3.G.a0 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void H1(int i) {
        super.H1(i);
        this.H3.d(false);
    }
}
