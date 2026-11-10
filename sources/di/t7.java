package di;

import android.content.Context;
import android.view.View;
public final class t7 extends j4 {
    public final u7 O3;

    public t7(u7 u7Var, Context context, q9 q9Var, g4 g4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, q9Var, g4Var, h6Var);
        this.O3 = u7Var;
    }

    @Override
    public final boolean I0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.O3.f9840f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (v.f9856c) {
            v.f9855b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (v.f9856c) {
            v.f9855b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
