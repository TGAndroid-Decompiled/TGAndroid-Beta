package defpackage;

import android.content.Context;
public abstract class rt1 extends d79 implements j6b {
    public final zu1 f3;

    public rt1(zu1 zu1Var, Context context, xu1 xu1Var) {
        super(context, xu1Var);
        this.f3 = zu1Var;
    }

    @Override
    public final void b(int[] iArr) {
        zu1 zu1Var = this.f3;
        iArr[0] = ((int) zu1Var.P9) - hl.L(4.0f);
        iArr[1] = uh9.f(3.0f, zu1Var.A0.getPaddingBottom(), zu1Var.A0.getMeasuredHeight());
    }
}
