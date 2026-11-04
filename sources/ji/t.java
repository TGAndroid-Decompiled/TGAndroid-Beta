package ji;

import android.os.Bundle;
import org.telegram.ui.Components.n00;
public final class t implements Runnable {
    public final int f16370a;
    public final b0 f16371b;

    public t(b0 b0Var, int i3) {
        this.f16370a = i3;
        this.f16371b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f16370a) {
            case 0:
                b0 b0Var = this.f16371b;
                b0Var.f16271s1.d.f35593f3.h1(1, b0Var.M1.f14496b);
                b0Var.f16264j1.a(false, true);
                b0Var.f28614r0 = true;
                n00 n00Var = b0Var.f16274v1;
                org.telegram.messenger.g0.v1(n00Var.f36302r);
                n00Var.f36302r.clearFocus();
                return;
            case 1:
                b0 b0Var2 = this.f16371b;
                b0Var2.f16273u1.d.f35593f3.h1(1, b0Var2.M1.f14496b);
                b0Var2.k1.a(false, true);
                b0Var2.f28614r0 = true;
                n00 n00Var2 = b0Var2.f16275w1;
                org.telegram.messenger.g0.v1(n00Var2.f36302r);
                n00Var2.f36302r.clearFocus();
                return;
            default:
                b0 b0Var3 = this.f16371b;
                b0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", b0Var3.m1);
                b0Var3.f16270r1.presentFragment(new n(bundle));
                b0Var3.dismiss();
                return;
        }
    }
}
