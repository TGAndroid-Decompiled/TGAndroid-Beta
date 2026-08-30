package c2;

import android.os.Bundle;
public final class f0 {
    public final int f1938a;
    public final boolean f1939b;
    public final boolean f1940c;
    public final boolean d;
    public final Bundle e;

    public f0(e0 e0Var) {
        Bundle bundle;
        this.f1938a = e0Var.f1933a;
        this.f1939b = e0Var.f1934b;
        this.f1940c = e0Var.f1935c;
        this.d = e0Var.d;
        Bundle bundle2 = e0Var.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
