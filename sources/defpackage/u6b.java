package defpackage;

import android.content.Context;
import android.view.View;
public final class u6b extends o68 {
    public final v6b P3;

    public u6b(v6b v6bVar, Context context, lcb lcbVar, m68 m68Var, x53 x53Var) {
        super(context, lcbVar, m68Var, x53Var);
        this.P3 = v6bVar;
    }

    @Override
    public final boolean C0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
