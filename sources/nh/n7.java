package nh;

import android.content.Context;
import android.view.View;
public final class n7 extends d4 {
    public final o7 f15647b4;

    public n7(o7 o7Var, Context context, i9 i9Var, a4 a4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i9Var, a4Var, f6Var);
        this.f15647b4 = o7Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f15647b4.f15692g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (u.f15925c) {
            u.f15924b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (u.f15925c) {
            u.f15924b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
