package defpackage;

import android.content.Context;
public abstract class qu1 extends r59 implements o4b {
    public final yv1 f3;

    public qu1(yv1 yv1Var, Context context, wv1 wv1Var) {
        super(context, wv1Var);
        this.f3 = yv1Var;
    }

    @Override
    public final void b(int[] iArr) {
        yv1 yv1Var = this.f3;
        iArr[0] = ((int) yv1Var.P9) - gm.L(4.0f);
        iArr[1] = hg9.f(3.0f, yv1Var.A0.getPaddingBottom(), yv1Var.A0.getMeasuredHeight());
    }
}
