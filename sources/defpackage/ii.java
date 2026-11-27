package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class ii extends LinearLayout {
    public boolean a;
    public final hq7 b;
    public final hq7 c;
    public final hq7 d;

    public ii(Context context, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
        super(context);
        this.b = hq7Var;
        this.c = hq7Var2;
        this.d = hq7Var3;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        this.a = true;
        Point point = hl.q;
        if (point.x > point.y) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hq7 hq7Var = this.b;
        hq7Var.setItemCount(i3);
        hq7 hq7Var2 = this.c;
        hq7Var2.setItemCount(i3);
        hq7 hq7Var3 = this.d;
        hq7Var3.setItemCount(i3);
        hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
        hq7Var2.getLayoutParams().height = hl.L(42.0f) * i3;
        hq7Var3.getLayoutParams().height = hl.L(42.0f) * i3;
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
