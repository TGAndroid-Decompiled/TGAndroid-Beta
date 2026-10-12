package di;

import android.view.ViewGroup;
public final class o8 extends s4.k {
    public final t8 F;

    public o8(t8 t8Var) {
        this.F = t8Var;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
