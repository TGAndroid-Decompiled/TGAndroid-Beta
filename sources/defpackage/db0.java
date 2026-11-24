package defpackage;

import android.app.Activity;
public final class db0 extends lb0 {
    public final cb0 H;

    public db0(mb0 mb0Var, Activity activity, cb0 cb0Var) {
        super(mb0Var, activity);
        this.H = cb0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
