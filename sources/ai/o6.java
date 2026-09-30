package ai;

import android.content.Context;
import android.view.View;
public final class o6 extends f7 {
    public final k7 f1355g3;

    public o6(k7 k7Var, Context context, d dVar) {
        super(k7Var, context, dVar, 0);
        this.f1355g3 = k7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f1355g3.f1134n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
