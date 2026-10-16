package bi;

import android.content.Context;
import android.view.View;
public final class a6 extends r6 {
    public final w6 X2;

    public a6(w6 w6Var, Context context, b bVar) {
        super(w6Var, context, bVar, 0);
        this.X2 = w6Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.X2.f3908n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
