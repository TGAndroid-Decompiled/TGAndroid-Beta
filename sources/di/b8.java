package di;

import android.content.Context;
import android.view.View;
public final class b8 extends q4 {
    public final c8 U3;

    public b8(c8 c8Var, Context context, y9 y9Var, n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, y9Var, n4Var, u6Var);
        this.U3 = c8Var;
    }

    @Override
    public final boolean I0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.U3.f8461f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (w.f9281c) {
            w.f9280b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.f9281c) {
            w.f9280b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
