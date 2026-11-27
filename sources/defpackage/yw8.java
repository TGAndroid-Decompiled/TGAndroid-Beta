package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class yw8 extends LinearLayout {
    public boolean a;
    public final bx8 b;

    public yw8(bx8 bx8Var, Activity activity) {
        super(activity);
        this.b = bx8Var;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        bx8 bx8Var = this.b;
        hq7 hq7Var = bx8Var.I;
        hq7 hq7Var2 = bx8Var.H;
        this.a = true;
        Point point = hl.q;
        if (point.x > point.y) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hq7Var2.setItemCount(i3);
        hq7Var.setItemCount(i3);
        hq7Var2.getLayoutParams().height = hl.L(54.0f) * i3;
        hq7Var.getLayoutParams().height = hl.L(54.0f) * i3;
        this.a = false;
        int size = View.MeasureSpec.getSize(i);
        bx8Var.O = size;
        if (size != 0) {
            bx8Var.c(false);
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
