package defpackage;

import android.content.Context;
import android.view.View;
public final class i3a extends d79 implements j6b {
    public final z3a f3;
    public final z3a g3;

    public i3a(z3a z3aVar, Context context, x53 x53Var) {
        super(context, x53Var);
        this.g3 = z3aVar;
        this.f3 = z3aVar;
    }

    @Override
    public final void b(int[] iArr) {
        iArr[0] = hl.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.g3.n = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }
}
