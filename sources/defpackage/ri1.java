package defpackage;

import android.app.Activity;
public final class ri1 extends s39 {
    public final vi1 d0;

    public ri1(vi1 vi1Var, Activity activity, wjb wjbVar, zi1 zi1Var) {
        super(activity, wjbVar, zi1Var);
        this.d0 = vi1Var;
    }

    @Override
    public final boolean canScrollHorizontally(int i) {
        if (this.d0.x.Q0 && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }
}
