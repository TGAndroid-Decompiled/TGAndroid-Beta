package oh;

import android.content.Context;
import android.view.View;
public final class n7 extends f4 {
    public final o7 f17503b4;

    public n7(o7 o7Var, Context context, i9 i9Var, c4 c4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i9Var, c4Var, g6Var);
        this.f17503b4 = o7Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f17503b4.f17560g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (t.f17755c) {
            t.f17754b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.f17755c) {
            t.f17754b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
