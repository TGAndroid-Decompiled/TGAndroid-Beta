package defpackage;

import android.content.Context;
public final class g14 extends tya {
    public final byte H3;
    public final h14 I3;

    public g14(h14 h14Var, Context context, int i, wjb wjbVar, int i2) {
        super(i, wjbVar, context);
        this.I3 = h14Var;
        this.H3 = i2;
    }

    @Override
    public final boolean B1() {
        return e66.e(8200);
    }

    @Override
    public final void H1(int i) {
        boolean z;
        gz3 gz3Var;
        yz3 yz3Var;
        super.H1(i);
        h14 h14Var = this.I3;
        t14 t14Var = h14Var.H;
        g14 g14Var = h14Var.r;
        boolean z2 = true;
        if (g14Var.getSelectedCategory() == null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = t14.U2;
        t14Var.M(z);
        byte b = this.H3;
        if (b == 1 && (yz3Var = t14Var.J) != null) {
            if (g14Var.getSelectedCategory() != null) {
                z2 = false;
            }
            yz3Var.n(z2);
        } else if (b == 0 && (gz3Var = t14Var.C0) != null) {
            if (g14Var.getSelectedCategory() != null) {
                z2 = false;
            }
            gz3Var.p0 = z2;
            gz3Var.invalidate();
        }
        h14Var.g(false);
    }
}
