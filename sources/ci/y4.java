package ci;

import android.content.Context;
import android.view.View;
public final class y4 extends p5 {
    public final t5 f6157a3;

    public y4(t5 t5Var, Context context, b bVar) {
        super(t5Var, context, bVar, 0);
        this.f6157a3 = t5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f6157a3.f5957n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
