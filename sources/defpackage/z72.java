package defpackage;

import android.content.Context;
public final class z72 extends u43 {
    public final c82 i2;

    public z72(c82 c82Var, Context context, wjb wjbVar, int i) {
        super(i, wjbVar, context);
        this.i2 = c82Var;
    }

    @Override
    public final void G(int i, int i2) {
        if (i2 > i) {
            this.i2.F.x0(0, gl.L(30.0f), null);
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
        return this.i2.f0();
    }
}
