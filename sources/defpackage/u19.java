package defpackage;

import android.content.Context;
import android.view.View;
public final class u19 extends r59 {
    public final c29 f3;

    public u19(c29 c29Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.f3 = c29Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        c29 c29Var = this.f3;
        j37 j37Var = c29Var.K;
        if (j37Var != null) {
            j37Var.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
        super.onMeasure(i, i2);
        c29Var.f();
    }
}
