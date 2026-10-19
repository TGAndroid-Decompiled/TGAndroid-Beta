package ci;

import android.content.Context;
import android.view.View;
public final class z4 extends q5 {
    public final u5 X2;

    public z4(u5 u5Var, Context context, b bVar) {
        super(u5Var, context, bVar, 0);
        this.X2 = u5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.X2.f6050n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
