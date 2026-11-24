package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class hj extends LinearLayout {
    public boolean a;
    public final lp7 b;
    public final lp7 c;
    public final lp7 d;

    public hj(Context context, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
        super(context);
        this.b = lp7Var;
        this.c = lp7Var2;
        this.d = lp7Var3;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        this.a = true;
        Point point = gm.q;
        if (point.x > point.y) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        lp7 lp7Var = this.b;
        lp7Var.setItemCount(i3);
        lp7 lp7Var2 = this.c;
        lp7Var2.setItemCount(i3);
        lp7 lp7Var3 = this.d;
        lp7Var3.setItemCount(i3);
        lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
        lp7Var2.getLayoutParams().height = gm.L(42.0f) * i3;
        lp7Var3.getLayoutParams().height = gm.L(42.0f) * i3;
        this.a = false;
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
