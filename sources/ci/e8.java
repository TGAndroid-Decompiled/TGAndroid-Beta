package ci;

import android.content.Context;
import android.view.View;
public final class e8 extends q4 {
    public final f8 f5362e4;

    public e8(f8 f8Var, Context context, aa aaVar, n4 n4Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, aaVar, n4Var, d6Var);
        this.f5362e4 = f8Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f5362e4.f5397g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (w.f6098c) {
            w.f6097b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.f6098c) {
            w.f6097b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
