package defpackage;

import android.content.Context;
public final class ly5 extends zw3 {
    public final wy5 D1;

    public ly5(wy5 wy5Var, Context context, yx5 yx5Var) {
        super(yx5Var, context, false, false);
        this.D1 = wy5Var;
    }

    @Override
    public final boolean F0(Integer num) {
        if (num.intValue() == 6) {
            gc1 gc1Var = this.D1.J1;
            if (gc1Var != null && gc1Var.c()) {
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
