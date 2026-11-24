package defpackage;

import org.telegram.ui.LaunchActivity;
public final class e75 extends tr8 {
    public final g95 t1;

    public e75(g95 g95Var, LaunchActivity launchActivity, a85 a85Var, p85 p85Var, d75 d75Var) {
        super(launchActivity, a85Var, p85Var, d75Var);
        this.t1 = g95Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
