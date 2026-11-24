package defpackage;

import android.content.Context;
import android.view.View;
public final class ks5 extends r59 {
    public int f3;
    public final xs5 g3;

    public ks5(xs5 xs5Var, Context context) {
        super(context, null);
        this.g3 = xs5Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        xs5 xs5Var = this.g3;
        ks5 ks5Var = xs5Var.P1;
        if (this.f3 != View.MeasureSpec.getSize(i2)) {
            this.f3 = View.MeasureSpec.getSize(i2);
            xs5Var.U1 = true;
            ks5Var.setPadding(0, 0, 0, 0);
            xs5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f3;
            int i4 = (int) ((i3 / 5.0f) * 2.0f);
            if (i4 < gm.L(60.0f) + (i3 - measuredHeight)) {
                i4 = this.f3 - measuredHeight;
            }
            xs5Var.U1 = true;
            ks5Var.setPadding(0, i4, 0, 0);
            xs5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.g3.U1) {
            return;
        }
        super.requestLayout();
    }
}
