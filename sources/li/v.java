package li;

import android.os.Bundle;
import org.telegram.ui.Components.e10;
public final class v implements Runnable {
    public final int f20002a;
    public final d0 f20003b;

    public v(d0 d0Var, int i7) {
        this.f20002a = i7;
        this.f20003b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f20002a) {
            case 0:
                d0 d0Var = this.f20003b;
                d0Var.f19906v1.d.f35741f3.h1(1, d0Var.P1.f15884b);
                d0Var.f19898m1.a(false, true);
                d0Var.f30173r0 = true;
                e10 e10Var = d0Var.f19909y1;
                org.telegram.messenger.g0.v1(e10Var.f34632r);
                e10Var.f34632r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f20003b;
                d0Var2.f19908x1.d.f35741f3.h1(1, d0Var2.P1.f15884b);
                d0Var2.n1.a(false, true);
                d0Var2.f30173r0 = true;
                e10 e10Var2 = d0Var2.f19910z1;
                org.telegram.messenger.g0.v1(e10Var2.f34632r);
                e10Var2.f34632r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f20003b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f19900p1);
                d0Var3.f19905u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
