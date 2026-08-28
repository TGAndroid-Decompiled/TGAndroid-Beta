package kh;

import android.view.ViewGroup;
public final class f8 extends f2.n {
    public final k8 F;

    public f8(k8 k8Var) {
        this.F = k8Var;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
