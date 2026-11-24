package defpackage;

import android.content.Context;
public final class r24 extends u0b {
    public final byte H3;
    public final s24 I3;

    public r24(s24 s24Var, Context context, int i, ylb ylbVar, int i2) {
        super(i, ylbVar, context);
        this.I3 = s24Var;
        this.H3 = i2;
    }

    @Override
    public final boolean B1() {
        return e86.e(8200);
    }

    @Override
    public final void H1(int i) {
        boolean z;
        q04 q04Var;
        j14 j14Var;
        super.H1(i);
        s24 s24Var = this.I3;
        e34 e34Var = s24Var.H;
        r24 r24Var = s24Var.r;
        boolean z2 = true;
        if (r24Var.getSelectedCategory() == null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = e34.U2;
        e34Var.L(z);
        byte b = this.H3;
        if (b == 1 && (j14Var = e34Var.J) != null) {
            if (r24Var.getSelectedCategory() != null) {
                z2 = false;
            }
            j14Var.n(z2);
        } else if (b == 0 && (q04Var = e34Var.C0) != null) {
            if (r24Var.getSelectedCategory() != null) {
                z2 = false;
            }
            q04Var.p0 = z2;
            q04Var.invalidate();
        }
        s24Var.g(false);
    }
}
