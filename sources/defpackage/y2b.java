package defpackage;

import android.content.Context;
import android.view.View;
public final class y2b extends y28 {
    public final z2b V3;

    public y2b(z2b z2bVar, Context context, m8b m8bVar, w28 w28Var, f53 f53Var) {
        super(context, m8bVar, w28Var, f53Var);
        this.V3 = z2bVar;
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
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
