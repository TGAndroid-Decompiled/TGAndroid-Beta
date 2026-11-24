package defpackage;

import android.content.Context;
public final class gw5 extends ew3 {
    public final rw5 D1;

    public gw5(rw5 rw5Var, Context context, tv5 tv5Var) {
        super(tv5Var, context, false, false);
        this.D1 = rw5Var;
    }

    @Override
    public final boolean E0(Integer num) {
        if (num.intValue() == 6) {
            yb1 yb1Var = this.D1.P1;
            if (yb1Var != null && yb1Var.c()) {
                return true;
            }
            return false;
        } else if (num.intValue() == 2) {
            return true;
        } else {
            return false;
        }
    }
}
