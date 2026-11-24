package defpackage;

import android.content.Context;
import android.view.View;
public final class q1a extends r59 implements o4b {
    public final i2a f3;
    public final i2a g3;

    public q1a(i2a i2aVar, Context context, r63 r63Var) {
        super(context, r63Var);
        this.g3 = i2aVar;
        this.f3 = i2aVar;
    }

    @Override
    public final void b(int[] iArr) {
        iArr[0] = gm.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.g3.n = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }
}
