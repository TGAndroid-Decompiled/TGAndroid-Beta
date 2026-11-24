package defpackage;

import android.content.Context;
public abstract class et1 extends o39 implements n2b {
    public final mu1 f3;

    public et1(mu1 mu1Var, Context context, ku1 ku1Var) {
        super(context, ku1Var);
        this.f3 = mu1Var;
    }

    @Override
    public final void b(int[] iArr) {
        mu1 mu1Var = this.f3;
        iArr[0] = ((int) mu1Var.P9) - gl.L(4.0f);
        iArr[1] = de9.f(3.0f, mu1Var.A0.getPaddingBottom(), mu1Var.A0.getMeasuredHeight());
    }
}
