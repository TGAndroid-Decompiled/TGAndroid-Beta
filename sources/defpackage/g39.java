package defpackage;

import android.content.Context;
import android.view.View;
public final class g39 extends d79 {
    public final o39 f3;

    public g39(o39 o39Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.f3 = o39Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        o39 o39Var = this.f3;
        q37 q37Var = o39Var.K;
        if (q37Var != null) {
            q37Var.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
        super.onMeasure(i, i2);
        o39Var.f();
    }
}
