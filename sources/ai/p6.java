package ai;

import android.content.Context;
import android.view.View;
public final class p6 extends g7 {
    public final l7 X2;

    public p6(l7 l7Var, Context context, d dVar) {
        super(l7Var, context, dVar, 0);
        this.X2 = l7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.X2.f1339n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
