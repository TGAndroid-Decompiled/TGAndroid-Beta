package defpackage;

import android.view.View;
public final class g38 implements View.OnLongClickListener {
    public final byte a;
    public final a58 b;

    public g38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        boolean z = false;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                if (a58Var.v0(true)) {
                    return false;
                }
                bu5 G = bu5.G(a58Var.z0.w, a58Var.r0, view);
                G.b(2131232122, jb6.M0(2131748567, null), new h38(a58Var, (byte) 6), false);
                if (a58Var.A3 > 0) {
                    z = true;
                }
                G.k(2131231791, jb6.M0(2131748566, null), new h38(a58Var, (byte) 7), z);
                G.W(5);
                G.X = true;
                G.a0();
                return true;
            default:
                a58Var.B0.j(a58Var.v0(false));
                return true;
        }
    }
}
