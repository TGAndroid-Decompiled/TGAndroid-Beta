package defpackage;

import android.content.Context;
public final class b24 extends t2b {
    public final byte H3;
    public final c24 I3;

    public b24(c24 c24Var, Context context, int i, vnb vnbVar, int i2) {
        super(i, vnbVar, context);
        this.I3 = c24Var;
        this.H3 = i2;
    }

    @Override
    public final boolean C1() {
        return i86.e(8200);
    }

    @Override
    public final void I1(int i) {
        boolean z;
        b04 b04Var;
        t04 t04Var;
        super.I1(i);
        c24 c24Var = this.I3;
        o24 o24Var = c24Var.H;
        b24 b24Var = c24Var.r;
        boolean z2 = true;
        if (b24Var.getSelectedCategory() == null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = o24.U2;
        o24Var.L(z);
        byte b = this.H3;
        if (b == 1 && (t04Var = o24Var.J) != null) {
            if (b24Var.getSelectedCategory() != null) {
                z2 = false;
            }
            t04Var.n(z2);
        } else if (b == 0 && (b04Var = o24Var.C0) != null) {
            if (b24Var.getSelectedCategory() != null) {
                z2 = false;
            }
            b04Var.p0 = z2;
            b04Var.invalidate();
        }
        c24Var.g(false);
    }
}
