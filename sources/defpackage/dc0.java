package defpackage;

import android.app.Activity;
public final class dc0 extends lc0 {
    public final cc0 H;

    public dc0(mc0 mc0Var, Activity activity, cc0 cc0Var) {
        super(mc0Var, activity);
        this.H = cc0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
