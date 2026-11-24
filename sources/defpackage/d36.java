package defpackage;

import android.content.Context;
import android.view.View;
public final class d36 extends hc0 {
    public final eb0 e;

    public d36(eb0 eb0Var, Context context) {
        super(context, false);
        this.e = eb0Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int h;
        int min = Math.min(3, ((f36) this.e.d).x);
        if (min == 0) {
            h = 0;
        } else {
            h = oo1.h(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(h), 1073741824), i2);
    }
}
