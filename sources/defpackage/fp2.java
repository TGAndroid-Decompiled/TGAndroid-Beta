package defpackage;

import android.os.Bundle;
public final class fp2 implements Runnable {
    public final byte a;
    public final pp2 b;

    public fp2(pp2 pp2Var, byte b) {
        this.a = b;
        this.b = pp2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pp2 pp2Var = this.b;
        switch (b) {
            case 0:
                pp2Var.u1.d.f3.g1(1, pp2Var.O1.b);
                pp2Var.l1.a(false, true);
                pp2Var.r0 = true;
                oq4 oq4Var = pp2Var.x1;
                gm.t1(oq4Var.r);
                oq4Var.r.clearFocus();
                return;
            case 1:
                pp2Var.w1.d.f3.g1(1, pp2Var.O1.b);
                pp2Var.m1.a(false, true);
                pp2Var.r0 = true;
                oq4 oq4Var2 = pp2Var.y1;
                gm.t1(oq4Var2.r);
                oq4Var2.r.clearFocus();
                return;
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", pp2Var.o1);
                pp2Var.t1.presentFragment(new po2(bundle));
                pp2Var.dismiss();
                return;
        }
    }
}
