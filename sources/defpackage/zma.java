package defpackage;

import android.content.Context;
public final class zma extends fy0 {
    public vj3 S1;

    public zma(Context context) {
        super(context, null, true, false, null);
        K();
        this.y1 = true;
        this.x1 = true;
        T0();
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        this.n1.j(new n58(this, (byte) 23));
        this.n1.setOnItemClickListener(new f09(this, (byte) 10));
    }

    @Override
    public final n39 G0(o39 o39Var) {
        vj3 vj3Var = new vj3(o39Var, getContext(), this.a, 0, true, this.J0);
        this.S1 = vj3Var;
        vj3Var.r = false;
        return vj3Var;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131745629, null);
    }
}
