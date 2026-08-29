package c2;

import android.os.Bundle;
public final class g0 {
    public final int f2838a;
    public final boolean f2839b;
    public final boolean f2840c;
    public final boolean d;
    public final Bundle f2841e;

    public g0(f0 f0Var) {
        Bundle bundle;
        this.f2838a = f0Var.f2833a;
        this.f2839b = f0Var.f2834b;
        this.f2840c = f0Var.f2835c;
        this.d = f0Var.d;
        Bundle bundle2 = f0Var.f2836e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f2841e = bundle;
    }
}
