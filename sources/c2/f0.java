package c2;

import android.os.Bundle;
public final class f0 {
    public final int f2163a;
    public final boolean f2164b;
    public final boolean f2165c;
    public final boolean d;
    public final Bundle f2166e;

    public f0(e0 e0Var) {
        Bundle bundle;
        this.f2163a = e0Var.f2157a;
        this.f2164b = e0Var.f2158b;
        this.f2165c = e0Var.f2159c;
        this.d = e0Var.d;
        Bundle bundle2 = e0Var.f2160e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.f2166e = bundle;
    }
}
