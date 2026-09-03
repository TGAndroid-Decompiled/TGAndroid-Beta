package c2;

import android.os.Bundle;
public final class g0 {
    public final int f1969a;
    public final boolean f1970b;
    public final boolean f1971c;
    public final boolean d;
    public final Bundle e;

    public g0(f0 f0Var) {
        Bundle bundle;
        this.f1969a = f0Var.f1965a;
        this.f1970b = f0Var.f1966b;
        this.f1971c = f0Var.f1967c;
        this.d = f0Var.d;
        Bundle bundle2 = f0Var.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
