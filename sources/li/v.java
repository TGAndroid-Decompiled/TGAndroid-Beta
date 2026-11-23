package li;

import android.os.Bundle;
import org.telegram.ui.Components.e10;
public final class v implements Runnable {
    public final int f20036a;
    public final d0 f20037b;

    public v(d0 d0Var, int i7) {
        this.f20036a = i7;
        this.f20037b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f20036a) {
            case 0:
                d0 d0Var = this.f20037b;
                d0Var.f19940v1.d.f35789f3.h1(1, d0Var.P1.f15918b);
                d0Var.f19932m1.a(false, true);
                d0Var.f30207r0 = true;
                e10 e10Var = d0Var.f19943y1;
                org.telegram.messenger.g0.v1(e10Var.f34642r);
                e10Var.f34642r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f20037b;
                d0Var2.f19942x1.d.f35789f3.h1(1, d0Var2.P1.f15918b);
                d0Var2.n1.a(false, true);
                d0Var2.f30207r0 = true;
                e10 e10Var2 = d0Var2.f19944z1;
                org.telegram.messenger.g0.v1(e10Var2.f34642r);
                e10Var2.f34642r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f20037b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f19934p1);
                d0Var3.f19939u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
