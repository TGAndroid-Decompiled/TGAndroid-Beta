package defpackage;

import android.view.View;
public final class d18 implements View.OnLongClickListener {
    public final byte a;
    public final y28 b;

    public d18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        boolean z = false;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                if (y28Var.v0(true)) {
                    return false;
                }
                cs5 G = cs5.G(y28Var.z0.w, y28Var.r0, view);
                G.b(2131232121, k96.M0(2131748618, null), new e18(y28Var, (byte) 6), false);
                if (y28Var.A3 > 0) {
                    z = true;
                }
                G.k(2131231790, k96.M0(2131748617, null), new e18(y28Var, (byte) 7), z);
                G.W(5);
                G.X = true;
                G.a0();
                return true;
            default:
                y28Var.B0.j(y28Var.v0(false));
                return true;
        }
    }
}
