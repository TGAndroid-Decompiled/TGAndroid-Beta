package defpackage;

import org.telegram.ui.LaunchActivity;
public final class i75 extends et8 {
    public final j95 t1;

    public i75(j95 j95Var, LaunchActivity launchActivity, e85 e85Var, t85 t85Var, h75 h75Var) {
        super(launchActivity, e85Var, t85Var, h75Var);
        this.t1 = j95Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
