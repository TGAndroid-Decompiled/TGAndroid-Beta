package bi;

import android.content.Context;
import android.view.View;
public final class t9 extends q5 {
    public final u9 f3760e4;

    public t9(u9 u9Var, Context context, sb sbVar, n5 n5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, sbVar, n5Var, c6Var);
        this.f3760e4 = u9Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f3760e4.f3801g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (b0.f2853c) {
            b0.f2852b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (b0.f2853c) {
            b0.f2852b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
