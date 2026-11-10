package ii;

import android.os.Bundle;
import org.telegram.ui.Components.r00;
public final class v implements Runnable {
    public final int f15610a;
    public final d0 f15611b;

    public v(d0 d0Var, int i7) {
        this.f15610a = i7;
        this.f15611b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f15610a) {
            case 0:
                d0 d0Var = this.f15611b;
                d0Var.f15512u1.d.f37495e3.h1(1, d0Var.O1.f15123b);
                d0Var.l1.a(false, true);
                d0Var.f28700q0 = true;
                r00 r00Var = d0Var.f15515x1;
                org.telegram.messenger.g0.v1(r00Var.f37446r);
                r00Var.f37446r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f15611b;
                d0Var2.f15514w1.d.f37495e3.h1(1, d0Var2.O1.f15123b);
                d0Var2.f15505m1.a(false, true);
                d0Var2.f28700q0 = true;
                r00 r00Var2 = d0Var2.f15516y1;
                org.telegram.messenger.g0.v1(r00Var2.f37446r);
                r00Var2.f37446r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f15611b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.f15506o1);
                d0Var3.f15511t1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
