package defpackage;

import android.app.Activity;
public final class aj1 extends h79 {
    public final ej1 d0;

    public aj1(ej1 ej1Var, Activity activity, vnb vnbVar, ij1 ij1Var) {
        super(activity, vnbVar, ij1Var);
        this.d0 = ej1Var;
    }

    @Override
    public final boolean canScrollHorizontally(int i) {
        if (this.d0.x.Q0 && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }
}
