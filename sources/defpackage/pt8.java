package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class pt8 extends LinearLayout {
    public boolean a;
    public final st8 b;

    public pt8(st8 st8Var, Activity activity) {
        super(activity);
        this.b = st8Var;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        st8 st8Var = this.b;
        hn7 hn7Var = st8Var.I;
        hn7 hn7Var2 = st8Var.H;
        this.a = true;
        Point point = gl.q;
        if (point.x > point.y) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hn7Var2.setItemCount(i3);
        hn7Var.setItemCount(i3);
        hn7Var2.getLayoutParams().height = gl.L(54.0f) * i3;
        hn7Var.getLayoutParams().height = gl.L(54.0f) * i3;
        this.a = false;
        int size = View.MeasureSpec.getSize(i);
        st8Var.O = size;
        if (size != 0) {
            st8Var.c(false);
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
