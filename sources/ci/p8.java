package ci;

import android.view.ViewGroup;
public final class p8 extends s4.j {
    public final u8 F;

    public p8(u8 u8Var) {
        this.F = u8Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
