package ei;

import android.view.ViewGroup;
public final class e8 extends s4.k {
    public final j8 F;

    public e8(j8 j8Var) {
        this.F = j8Var;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
