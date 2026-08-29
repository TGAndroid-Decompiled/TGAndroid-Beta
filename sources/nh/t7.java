package nh;

import android.view.ViewGroup;
public final class t7 extends f2.l {
    public final y7 F;

    public t7(y7 y7Var) {
        this.F = y7Var;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
