package defpackage;

import android.content.Context;
public final class gy5 extends px3 {
    public final ry5 D1;

    public gy5(ry5 ry5Var, Context context, tx5 tx5Var) {
        super(tx5Var, context, false, false);
        this.D1 = ry5Var;
    }

    @Override
    public final boolean E0(Integer num) {
        if (num.intValue() == 6) {
            gd1 gd1Var = this.D1.P1;
            if (gd1Var != null && gd1Var.c()) {
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
