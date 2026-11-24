package defpackage;

import android.view.ActionProvider;
public final class d07 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public z24 b;

    public d07(g07 g07Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z) {
        z24 z24Var = this.b;
        if (z24Var != null) {
            yz6 yz6Var = ((c07) z24Var.b).n;
            yz6Var.h = true;
            yz6Var.p(true);
        }
    }
}
