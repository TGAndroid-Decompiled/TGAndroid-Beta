package defpackage;

import android.app.Activity;
public final class ak1 extends v59 {
    public final ek1 d0;

    public ak1(ek1 ek1Var, Activity activity, ylb ylbVar, ik1 ik1Var) {
        super(activity, ylbVar, ik1Var);
        this.d0 = ek1Var;
    }

    @Override
    public final boolean canScrollHorizontally(int i) {
        if (this.d0.x.Q0 && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }
}
