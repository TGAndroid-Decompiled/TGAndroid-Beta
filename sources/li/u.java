package li;

import android.os.Bundle;
import org.telegram.ui.Components.c10;
public final class u implements Runnable {
    public final int f20099a;
    public final c0 f20100b;

    public u(c0 c0Var, int i7) {
        this.f20099a = i7;
        this.f20100b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f20099a) {
            case 0:
                c0 c0Var = this.f20100b;
                c0Var.f20003v1.d.f35322f3.h1(1, c0Var.P1.f15979b);
                c0Var.f19995m1.a(false, true);
                c0Var.f30257r0 = true;
                c10 c10Var = c0Var.f20006y1;
                org.telegram.messenger.g0.v1(c10Var.f33883r);
                c10Var.f33883r.clearFocus();
                return;
            case 1:
                c0 c0Var2 = this.f20100b;
                c0Var2.f20005x1.d.f35322f3.h1(1, c0Var2.P1.f15979b);
                c0Var2.n1.a(false, true);
                c0Var2.f30257r0 = true;
                c10 c10Var2 = c0Var2.f20007z1;
                org.telegram.messenger.g0.v1(c10Var2.f33883r);
                c10Var2.f33883r.clearFocus();
                return;
            default:
                c0 c0Var3 = this.f20100b;
                c0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", c0Var3.f19997p1);
                c0Var3.f20002u1.presentFragment(new o(bundle));
                c0Var3.dismiss();
                return;
        }
    }
}
