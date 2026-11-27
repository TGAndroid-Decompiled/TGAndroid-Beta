package defpackage;

import android.content.Context;
public final class mi7 extends b3a {
    public final byte L;
    public boolean M;
    public final ny0 N;

    public mi7(ny0 ny0Var, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.L = b;
        this.N = ny0Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.L;
        ny0 ny0Var = this.N;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                pi7 pi7Var = (pi7) ny0Var;
                pi7Var.g2 = hl.L(64.0f) + getMeasuredHeight();
                pi7Var.f2.G();
                boolean z2 = this.M;
                boolean z3 = pi7Var.d;
                if (z2 != z3) {
                    this.M = z3;
                    if (z3) {
                        d79 d79Var = pi7Var.n1;
                        z46 z46Var = new z46(pi7Var.getContext(), 2, 0.6f);
                        z46Var.a = 1;
                        z46Var.p = hl.L(36.0f);
                        d79Var.getLayoutManager().v0(z46Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                sbc sbcVar = (sbc) ny0Var;
                sbcVar.k2 = hl.L(64.0f) + getMeasuredHeight();
                sbcVar.j2.G();
                boolean z4 = this.M;
                boolean z5 = sbcVar.d;
                if (z4 != z5) {
                    this.M = z5;
                    if (z5) {
                        d79 d79Var2 = sbcVar.n1;
                        z46 z46Var2 = new z46(sbcVar.getContext(), 2, 0.6f);
                        z46Var2.a = 1;
                        z46Var2.p = hl.L(36.0f);
                        d79Var2.getLayoutManager().v0(z46Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
