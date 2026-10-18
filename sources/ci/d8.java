package ci;

import android.content.Context;
import android.view.View;
public final class d8 extends p4 {
    public final e8 f5258e4;

    public d8(e8 e8Var, Context context, z9 z9Var, m4 m4Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, z9Var, m4Var, d6Var);
        this.f5258e4 = e8Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f5258e4.f5295g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (w.f6028c) {
            w.f6027b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.f6028c) {
            w.f6027b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
