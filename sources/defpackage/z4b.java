package defpackage;

import android.content.Context;
import android.view.View;
public final class z4b extends a58 {
    public final a5b V3;

    public z4b(a5b a5bVar, Context context, oab oabVar, y48 y48Var, r63 r63Var) {
        super(context, oabVar, y48Var, r63Var);
        this.V3 = a5bVar;
    }

    @Override
    public final boolean C0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.V3.f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
