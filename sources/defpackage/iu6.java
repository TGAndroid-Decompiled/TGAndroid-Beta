package defpackage;

import android.os.Bundle;
public final class iu6 {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Bundle e;

    public iu6(hu6 hu6Var) {
        Bundle bundle;
        this.a = hu6Var.a;
        this.b = hu6Var.b;
        this.c = hu6Var.c;
        this.d = hu6Var.d;
        Bundle bundle2 = hu6Var.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
