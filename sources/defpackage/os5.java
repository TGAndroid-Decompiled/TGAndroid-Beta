package defpackage;

import android.content.Context;
import android.view.View;
public final class os5 extends d79 {
    public int f3;
    public final bt5 g3;

    public os5(bt5 bt5Var, Context context) {
        super(context, null);
        this.g3 = bt5Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        bt5 bt5Var = this.g3;
        os5 os5Var = bt5Var.P1;
        if (this.f3 != View.MeasureSpec.getSize(i2)) {
            this.f3 = View.MeasureSpec.getSize(i2);
            bt5Var.U1 = true;
            os5Var.setPadding(0, 0, 0, 0);
            bt5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f3;
            int i4 = (int) ((i3 / 5.0f) * 2.0f);
            if (i4 < hl.L(60.0f) + (i3 - measuredHeight)) {
                i4 = this.f3 - measuredHeight;
            }
            bt5Var.U1 = true;
            os5Var.setPadding(0, i4, 0, 0);
            bt5Var.U1 = false;
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
