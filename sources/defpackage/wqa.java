package defpackage;

import android.content.Context;
public final class wqa extends ny0 {
    public nk3 S1;

    public wqa(Context context) {
        super(context, null, true, false, null);
        J();
        this.y1 = true;
        this.x1 = true;
        U0();
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        this.n1.j(new e98(this, (byte) 23));
        this.n1.setOnItemClickListener(new t39(this, (byte) 10));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        nk3 nk3Var = new nk3(d79Var, getContext(), this.a, 0, true, this.J0);
        this.S1 = nk3Var;
        nk3Var.r = false;
        return nk3Var;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131745549, null);
    }
}
