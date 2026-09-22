package ai;

import android.content.Context;
import android.view.View;
public final class ja extends f6 {
    public final ka f1059e4;

    public ja(ka kaVar, Context context, jc jcVar, c6 c6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, jcVar, c6Var, e6Var);
        this.f1059e4 = kaVar;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f1059e4.f1150g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (i0.f965c) {
            i0.f964b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.f965c) {
            i0.f964b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
