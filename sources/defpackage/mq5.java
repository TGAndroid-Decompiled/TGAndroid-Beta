package defpackage;

import android.content.Context;
import android.view.View;
public final class mq5 extends o39 {
    public int f3;
    public final zq5 g3;

    public mq5(zq5 zq5Var, Context context) {
        super(context, null);
        this.g3 = zq5Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        zq5 zq5Var = this.g3;
        mq5 mq5Var = zq5Var.P1;
        if (this.f3 != View.MeasureSpec.getSize(i2)) {
            this.f3 = View.MeasureSpec.getSize(i2);
            zq5Var.U1 = true;
            mq5Var.setPadding(0, 0, 0, 0);
            zq5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f3;
            int i4 = (int) ((i3 / 5.0f) * 2.0f);
            if (i4 < gl.L(60.0f) + (i3 - measuredHeight)) {
                i4 = this.f3 - measuredHeight;
            }
            zq5Var.U1 = true;
            mq5Var.setPadding(0, i4, 0, 0);
            zq5Var.U1 = false;
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
