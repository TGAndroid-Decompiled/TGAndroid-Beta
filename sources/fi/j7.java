package fi;

import android.content.Context;
import android.view.View;
public final class j7 extends z3 {
    public final k7 P3;

    public j7(k7 k7Var, Context context, f9 f9Var, w3 w3Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f9Var, w3Var, h6Var);
        this.P3 = k7Var;
    }

    @Override
    public final boolean I0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f12231f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (v.f12673c) {
            v.f12672b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (v.f12673c) {
            v.f12672b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
