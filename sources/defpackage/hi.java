package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class hi extends LinearLayout {
    public boolean a;
    public final hn7 b;
    public final hn7 c;
    public final hn7 d;

    public hi(Context context, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
        super(context);
        this.b = hn7Var;
        this.c = hn7Var2;
        this.d = hn7Var3;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        this.a = true;
        Point point = gl.q;
        if (point.x > point.y) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hn7 hn7Var = this.b;
        hn7Var.setItemCount(i3);
        hn7 hn7Var2 = this.c;
        hn7Var2.setItemCount(i3);
        hn7 hn7Var3 = this.d;
        hn7Var3.setItemCount(i3);
        hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
        hn7Var2.getLayoutParams().height = gl.L(42.0f) * i3;
        hn7Var3.getLayoutParams().height = gl.L(42.0f) * i3;
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
