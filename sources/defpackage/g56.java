package defpackage;

import android.content.Context;
import android.view.View;
public final class g56 extends jc0 {
    public final gb0 e;

    public g56(gb0 gb0Var, Context context) {
        super(context, false);
        this.e = gb0Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int h;
        int min = Math.min(3, ((i56) this.e.d).x);
        if (min == 0) {
            h = 0;
        } else {
            h = bp1.h(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(h), 1073741824), i2);
    }
}
