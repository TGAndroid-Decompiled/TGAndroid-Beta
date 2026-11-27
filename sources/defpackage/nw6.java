package defpackage;

import android.os.Bundle;
public final class nw6 {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Bundle e;

    public nw6(mw6 mw6Var) {
        Bundle bundle;
        this.a = mw6Var.a;
        this.b = mw6Var.b;
        this.c = mw6Var.c;
        this.d = mw6Var.d;
        Bundle bundle2 = mw6Var.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
