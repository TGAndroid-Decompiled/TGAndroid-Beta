package ii;

import android.os.Bundle;
import org.telegram.ui.Components.r00;
public final class v implements Runnable {
    public final int f15608a;
    public final d0 f15609b;

    public v(d0 d0Var, int i7) {
        this.f15608a = i7;
        this.f15609b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f15608a) {
            case 0:
                d0 d0Var = this.f15609b;
                d0Var.f15507r1.d.f37159e3.h1(1, d0Var.L1.f15118b);
                d0Var.f15500i1.a(false, true);
                d0Var.f28641q0 = true;
                r00 r00Var = d0Var.f15510u1;
                org.telegram.messenger.g0.v1(r00Var.f37441r);
                r00Var.f37441r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f15609b;
                d0Var2.f15509t1.d.f37159e3.h1(1, d0Var2.L1.f15118b);
                d0Var2.f15501j1.a(false, true);
                d0Var2.f28641q0 = true;
                r00 r00Var2 = d0Var2.f15511v1;
                org.telegram.messenger.g0.v1(r00Var2.f37441r);
                r00Var2.f37441r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f15609b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.l1);
                d0Var3.f15506q1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
