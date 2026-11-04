package ei;

import android.content.Context;
import android.view.View;
public final class t7 extends j4 {
    public final u7 P3;

    public t7(u7 u7Var, Context context, r9 r9Var, g4 g4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, r9Var, g4Var, e6Var);
        this.P3 = u7Var;
    }

    @Override
    public final boolean I0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f11092f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (w.f11144c) {
            w.f11143b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (w.f11144c) {
            w.f11143b.add(this);
        } else {
            super.invalidate(i3, i10, i11, i12);
        }
    }
}
