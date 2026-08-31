package c2;

import android.os.Bundle;
public final class f0 {
    public final int f2105a;
    public final boolean f2106b;
    public final boolean f2107c;
    public final boolean d;
    public final Bundle f2108e;

    public f0(e0 e0Var) {
        Bundle bundle;
        this.f2105a = e0Var.f2099a;
        this.f2106b = e0Var.f2100b;
        this.f2107c = e0Var.f2101c;
        this.d = e0Var.d;
        Bundle bundle2 = e0Var.f2102e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f2108e = bundle;
    }
}
