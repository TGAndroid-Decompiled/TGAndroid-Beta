package defpackage;

import org.telegram.ui.LaunchActivity;
public final class g55 extends sp8 {
    public final h75 t1;

    public g55(h75 h75Var, LaunchActivity launchActivity, c65 c65Var, r65 r65Var, f55 f55Var) {
        super(launchActivity, c65Var, r65Var, f55Var);
        this.t1 = h75Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
