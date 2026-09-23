package ai;

import android.content.Context;
import android.view.View;
public final class o6 extends f7 {
    public final k7 Z2;

    public o6(k7 k7Var, Context context, d dVar) {
        super(k7Var, context, dVar, 0);
        this.Z2 = k7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.Z2.f1132n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
