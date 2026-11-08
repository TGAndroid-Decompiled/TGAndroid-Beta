package ii;

import android.os.Bundle;
import org.telegram.ui.Components.s00;
public final class v implements Runnable {
    public final int f15611a;
    public final d0 f15612b;

    public v(d0 d0Var, int i7) {
        this.f15611a = i7;
        this.f15612b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f15611a) {
            case 0:
                d0 d0Var = this.f15612b;
                d0Var.f15510r1.d.f37189e3.h1(1, d0Var.L1.f15121b);
                d0Var.f15503i1.a(false, true);
                d0Var.f28644q0 = true;
                s00 s00Var = d0Var.f15513u1;
                org.telegram.messenger.g0.v1(s00Var.f37824r);
                s00Var.f37824r.clearFocus();
                return;
            case 1:
                d0 d0Var2 = this.f15612b;
                d0Var2.f15512t1.d.f37189e3.h1(1, d0Var2.L1.f15121b);
                d0Var2.f15504j1.a(false, true);
                d0Var2.f28644q0 = true;
                s00 s00Var2 = d0Var2.f15514v1;
                org.telegram.messenger.g0.v1(s00Var2.f37824r);
                s00Var2.f37824r.clearFocus();
                return;
            default:
                d0 d0Var3 = this.f15612b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.l1);
                d0Var3.f15509q1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                return;
        }
    }
}
