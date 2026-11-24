package defpackage;

import android.content.Context;
import android.view.View;
public final class d56 extends hd0 {
    public final ec0 e;

    public d56(ec0 ec0Var, Context context) {
        super(context, false);
        this.e = ec0Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int h;
        int min = Math.min(3, ((f56) this.e.d).x);
        if (min == 0) {
            h = 0;
        } else {
            h = aq1.h(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(h), 1073741824), i2);
    }
}
