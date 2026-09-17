package di;

import android.view.ViewGroup;
public final class s8 extends s4.j {
    public final x8 F;

    public s8(x8 x8Var) {
        this.F = x8Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
