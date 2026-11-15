package fi;

import android.content.Context;
import android.view.View;
public final class m7 extends b4 {
    public final n7 P3;

    public m7(n7 n7Var, Context context, i9 i9Var, y3 y3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i9Var, y3Var, e6Var);
        this.P3 = n7Var;
    }

    @Override
    public final boolean I0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f12080f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (v.f12407c) {
            v.f12406b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (v.f12407c) {
            v.f12406b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
