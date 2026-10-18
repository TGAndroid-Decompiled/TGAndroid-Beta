package ci;

import android.content.Context;
import android.view.View;
public final class y4 extends p5 {
    public final t5 X2;

    public y4(t5 t5Var, Context context, b bVar) {
        super(t5Var, context, bVar, 0);
        this.X2 = t5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.X2.f5951n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
