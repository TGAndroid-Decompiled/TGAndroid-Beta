package defpackage;

import android.content.Context;
public final class k92 extends f63 {
    public final n92 i2;

    public k92(n92 n92Var, Context context, ylb ylbVar, int i) {
        super(i, ylbVar, context);
        this.i2 = n92Var;
    }

    @Override
    public final void G(int i, int i2) {
        if (i2 > i) {
            this.i2.F.x0(0, gm.L(30.0f), null);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        if (i != 2131296496 && i != 16908320) {
            if (i != 16908322 && i != 16908321) {
                return super.onTextContextMenuItem(i);
            }
            return false;
        }
        return this.i2.g0();
    }
}
