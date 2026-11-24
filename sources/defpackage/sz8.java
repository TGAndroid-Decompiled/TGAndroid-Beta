package defpackage;

import android.content.Context;
import android.view.View;
public final class sz8 extends o39 {
    public final a09 f3;

    public sz8(a09 a09Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.f3 = a09Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a09 a09Var = this.f3;
        j17 j17Var = a09Var.K;
        if (j17Var != null) {
            j17Var.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
        super.onMeasure(i, i2);
        a09Var.f();
    }
}
