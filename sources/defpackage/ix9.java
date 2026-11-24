package defpackage;

import android.content.Context;
public final class ix9 extends tya {
    public final lw9 H3;

    public ix9(lw9 lw9Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.H3 = lw9Var;
    }

    @Override
    public final boolean B1() {
        if (!e66.e(16388) && this.H3.G.a0 != 4) {
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
