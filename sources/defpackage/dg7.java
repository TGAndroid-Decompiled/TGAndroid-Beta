package defpackage;

import android.content.Context;
public final class dg7 extends hz9 {
    public final byte L;
    public boolean M;
    public final fy0 N;

    public dg7(fy0 fy0Var, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.L = b;
        this.N = fy0Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.L;
        fy0 fy0Var = this.N;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                gg7 gg7Var = (gg7) fy0Var;
                gg7Var.g2 = gl.L(64.0f) + getMeasuredHeight();
                gg7Var.f2.G();
                boolean z2 = this.M;
                boolean z3 = gg7Var.d;
                if (z2 != z3) {
                    this.M = z3;
                    if (z3) {
                        o39 o39Var = gg7Var.n1;
                        v26 v26Var = new v26(gg7Var.getContext(), 2, 0.6f);
                        v26Var.a = 1;
                        v26Var.p = gl.L(36.0f);
                        o39Var.getLayoutManager().v0(v26Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                s7c s7cVar = (s7c) fy0Var;
                s7cVar.k2 = gl.L(64.0f) + getMeasuredHeight();
                s7cVar.j2.G();
                boolean z4 = this.M;
                boolean z5 = s7cVar.d;
                if (z4 != z5) {
                    this.M = z5;
                    if (z5) {
                        o39 o39Var2 = s7cVar.n1;
                        v26 v26Var2 = new v26(s7cVar.getContext(), 2, 0.6f);
                        v26Var2.a = 1;
                        v26Var2.p = gl.L(36.0f);
                        o39Var2.getLayoutManager().v0(v26Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
