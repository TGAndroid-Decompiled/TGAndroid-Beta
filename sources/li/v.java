package li;

import android.os.Bundle;
import org.telegram.ui.Components.c10;
public final class v implements Runnable {
    public final int f20008a;
    public final d0 f20009b;

    public v(d0 d0Var, int i7) {
        this.f20008a = i7;
        this.f20009b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f20008a) {
            case 0:
                d0 d0Var = this.f20009b;
                d0Var.f19912v1.d.f34606f3.h1(1, d0Var.P1.f15893b);
                d0Var.f19904m1.a(false, true);
                d0Var.f30223r0 = true;
                c10 c10Var = d0Var.f19915y1;
                org.telegram.messenger.g0.v1(c10Var.f33845r);
                c10Var.f33845r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f20009b;
                d0Var2.f19914x1.d.f34606f3.h1(1, d0Var2.P1.f15893b);
                d0Var2.n1.a(false, true);
                d0Var2.f30223r0 = true;
                c10 c10Var2 = d0Var2.f19916z1;
                org.telegram.messenger.g0.v1(c10Var2.f33845r);
                c10Var2.f33845r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f20009b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f19906p1);
                d0Var3.f19911u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
