package fi;

import android.view.ViewGroup;
public final class b9 extends s4.l {
    public final g9 F;

    public b9(g9 g9Var) {
        this.F = g9Var;
    }

    @Override
    public final void M() {
        ViewGroup viewGroup;
        g9 g9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.k3) g9Var.W).containerView;
        viewGroup.invalidate();
        g9Var.e.invalidate();
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        g9 g9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.k3) g9Var.W).containerView;
        viewGroup.invalidate();
        g9Var.e.invalidate();
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        g9 g9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.k3) g9Var.W).containerView;
        viewGroup.invalidate();
        g9Var.e.invalidate();
        g9Var.f10923f.invalidate();
    }

    @Override
    public final void Q() {
        ViewGroup viewGroup;
        g9 g9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.k3) g9Var.W).containerView;
        viewGroup.invalidate();
        g9Var.e.invalidate();
    }

    @Override
    public final boolean t(s4.e1 e1Var) {
        return true;
    }
}
