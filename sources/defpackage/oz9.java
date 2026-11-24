package defpackage;

import android.content.Context;
import android.view.View;
public final class oz9 extends o39 implements n2b {
    public final g0a f3;
    public final g0a g3;

    public oz9(g0a g0aVar, Context context, f53 f53Var) {
        super(context, f53Var);
        this.g3 = g0aVar;
        this.f3 = g0aVar;
    }

    @Override
    public final void b(int[] iArr) {
        iArr[0] = gl.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.g3.n = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }
}
