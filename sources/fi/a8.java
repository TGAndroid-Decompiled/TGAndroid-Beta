package fi;

import android.view.ViewGroup;
public final class a8 extends s4.l {
    public final f8 F;

    public a8(f8 f8Var) {
        this.F = f8Var;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }
}
