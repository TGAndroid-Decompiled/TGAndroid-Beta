package li;

import android.os.Bundle;
import org.telegram.ui.Components.c10;
public final class v implements Runnable {
    public final int f20005a;
    public final d0 f20006b;

    public v(d0 d0Var, int i7) {
        this.f20005a = i7;
        this.f20006b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f20005a) {
            case 0:
                d0 d0Var = this.f20006b;
                d0Var.f19909v1.d.f34606f3.h1(1, d0Var.P1.f15890b);
                d0Var.f19901m1.a(false, true);
                d0Var.f30221r0 = true;
                c10 c10Var = d0Var.f19912y1;
                org.telegram.messenger.g0.v1(c10Var.f33845r);
                c10Var.f33845r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f20006b;
                d0Var2.f19911x1.d.f34606f3.h1(1, d0Var2.P1.f15890b);
                d0Var2.n1.a(false, true);
                d0Var2.f30221r0 = true;
                c10 c10Var2 = d0Var2.f19913z1;
                org.telegram.messenger.g0.v1(c10Var2.f33845r);
                c10Var2.f33845r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f20006b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f19903p1);
                d0Var3.f19908u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
