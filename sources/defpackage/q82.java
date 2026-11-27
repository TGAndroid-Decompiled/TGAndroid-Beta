package defpackage;

import android.content.Context;
public final class q82 extends m53 {
    public final t82 j2;

    public q82(t82 t82Var, Context context, vnb vnbVar, int i) {
        super(i, vnbVar, context);
        this.j2 = t82Var;
    }

    @Override
    public final void G(int i, int i2) {
        if (i2 > i) {
            this.j2.F.y0(0, hl.L(30.0f), null);
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
        return this.j2.f0();
    }
}
