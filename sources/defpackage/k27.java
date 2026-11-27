package defpackage;

import android.view.ActionProvider;
public final class k27 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public xh4 b;

    public k27(n27 n27Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z) {
        xh4 xh4Var = this.b;
        if (xh4Var != null) {
            f27 f27Var = ((j27) xh4Var.b).n;
            f27Var.h = true;
            f27Var.p(true);
        }
    }
}
