package li;

import android.os.Bundle;
import org.telegram.ui.Components.e10;
public final class v implements Runnable {
    public final int f20033a;
    public final d0 f20034b;

    public v(d0 d0Var, int i7) {
        this.f20033a = i7;
        this.f20034b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f20033a) {
            case 0:
                d0 d0Var = this.f20034b;
                d0Var.f19937v1.d.f35795f3.h1(1, d0Var.P1.f15915b);
                d0Var.f19929m1.a(false, true);
                d0Var.f30204r0 = true;
                e10 e10Var = d0Var.f19940y1;
                org.telegram.messenger.g0.v1(e10Var.f34647r);
                e10Var.f34647r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f20034b;
                d0Var2.f19939x1.d.f35795f3.h1(1, d0Var2.P1.f15915b);
                d0Var2.n1.a(false, true);
                d0Var2.f30204r0 = true;
                e10 e10Var2 = d0Var2.f19941z1;
                org.telegram.messenger.g0.v1(e10Var2.f34647r);
                e10Var2.f34647r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f20034b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f19931p1);
                d0Var3.f19936u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
