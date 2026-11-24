package defpackage;

import android.os.Bundle;
public final class un2 implements Runnable {
    public final byte a;
    public final eo2 b;

    public un2(eo2 eo2Var, byte b) {
        this.a = b;
        this.b = eo2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eo2 eo2Var = this.b;
        switch (b) {
            case 0:
                eo2Var.u1.d.f3.g1(1, eo2Var.O1.b);
                eo2Var.l1.a(false, true);
                eo2Var.r0 = true;
                no4 no4Var = eo2Var.x1;
                gl.t1(no4Var.r);
                no4Var.r.clearFocus();
                return;
            case 1:
                eo2Var.w1.d.f3.g1(1, eo2Var.O1.b);
                eo2Var.m1.a(false, true);
                eo2Var.r0 = true;
                no4 no4Var2 = eo2Var.y1;
                gl.t1(no4Var2.r);
                no4Var2.r.clearFocus();
                return;
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", eo2Var.o1);
                eo2Var.t1.presentFragment(new en2(bundle));
                eo2Var.dismiss();
                return;
        }
    }
}
