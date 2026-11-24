package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class qv8 extends LinearLayout {
    public boolean a;
    public final tv8 b;

    public qv8(tv8 tv8Var, Activity activity) {
        super(activity);
        this.b = tv8Var;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        tv8 tv8Var = this.b;
        lp7 lp7Var = tv8Var.I;
        lp7 lp7Var2 = tv8Var.H;
        this.a = true;
        Point point = gm.q;
        if (point.x > point.y) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        lp7Var2.setItemCount(i3);
        lp7Var.setItemCount(i3);
        lp7Var2.getLayoutParams().height = gm.L(54.0f) * i3;
        lp7Var.getLayoutParams().height = gm.L(54.0f) * i3;
        this.a = false;
        int size = View.MeasureSpec.getSize(i);
        tv8Var.O = size;
        if (size != 0) {
            tv8Var.c(false);
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
