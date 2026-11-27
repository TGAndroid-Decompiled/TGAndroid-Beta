package defpackage;

import android.app.Activity;
public final class fb0 extends nb0 {
    public final eb0 H;

    public fb0(ob0 ob0Var, Activity activity, eb0 eb0Var) {
        super(ob0Var, activity);
        this.H = eb0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
