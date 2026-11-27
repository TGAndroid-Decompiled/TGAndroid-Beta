package defpackage;

import android.view.View;
public final class x48 implements View.OnLongClickListener {
    public final byte a;
    public final o68 b;

    public x48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        boolean z = false;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                if (o68Var.v0(true)) {
                    return false;
                }
                fu5 G = fu5.G(o68Var.t0.w, o68Var.l0, view);
                G.b(2131232121, ob6.M0(2131748564, null), new u48(o68Var, (byte) 6), false);
                if (o68Var.u3 > 0) {
                    z = true;
                }
                G.k(2131231790, ob6.M0(2131748563, null), new u48(o68Var, (byte) 7), z);
                G.W(5);
                G.a0 = true;
                G.a0();
                return true;
            default:
                o68Var.v0.j(o68Var.v0(false));
                return true;
        }
    }
}
