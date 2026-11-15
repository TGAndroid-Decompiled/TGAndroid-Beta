package li;

import android.os.Bundle;
import org.telegram.ui.Components.v00;
public final class u implements Runnable {
    public final int f19638a;
    public final d0 f19639b;

    public u(d0 d0Var, int i7) {
        this.f19638a = i7;
        this.f19639b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f19638a) {
            case 0:
                d0 d0Var = this.f19639b;
                d0Var.f19548v1.d.f39891f3.h1(1, d0Var.P1.f15575b);
                d0Var.f19540m1.a(false, true);
                d0Var.f29713r0 = true;
                v00 v00Var = d0Var.f19551y1;
                org.telegram.messenger.g0.v1(v00Var.f40202r);
                v00Var.f40202r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f19639b;
                d0Var2.f19550x1.d.f39891f3.h1(1, d0Var2.P1.f15575b);
                d0Var2.n1.a(false, true);
                d0Var2.f29713r0 = true;
                v00 v00Var2 = d0Var2.f19552z1;
                org.telegram.messenger.g0.v1(v00Var2.f40202r);
                v00Var2.f40202r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f19639b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f19542p1);
                d0Var3.f19547u1.presentFragment(new n(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
