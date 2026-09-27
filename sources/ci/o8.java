package ci;

import android.view.ViewGroup;
public final class o8 extends s4.j {
    public final t8 F;

    public o8(t8 t8Var) {
        this.F = t8Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
