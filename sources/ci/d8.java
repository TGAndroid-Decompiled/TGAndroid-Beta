package ci;

import android.content.Context;
import android.view.View;
public final class d8 extends p4 {
    public final e8 f5260e4;

    public d8(e8 e8Var, Context context, z9 z9Var, m4 m4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, z9Var, m4Var, g6Var);
        this.f5260e4 = e8Var;
    }

    @Override
    public final boolean J0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f5260e4.f5297g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (w.f6035c) {
            w.f6034b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.f6035c) {
            w.f6034b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
