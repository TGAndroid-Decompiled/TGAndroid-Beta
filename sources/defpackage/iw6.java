package defpackage;

import android.os.Bundle;
public final class iw6 {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Bundle e;

    public iw6(hw6 hw6Var) {
        Bundle bundle;
        this.a = hw6Var.a;
        this.b = hw6Var.b;
        this.c = hw6Var.c;
        this.d = hw6Var.d;
        Bundle bundle2 = hw6Var.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }
}
