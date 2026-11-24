package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class qi extends LinearLayout {
    public final byte a;
    public boolean b;
    public final hn7 c;

    public qi(Context context, hn7 hn7Var, byte b) {
        super(context);
        this.a = b;
        this.c = hn7Var;
        this.b = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        int i3 = 5;
        hn7 hn7Var = this.c;
        switch (b) {
            case 0:
                pi piVar = (pi) hn7Var;
                this.b = true;
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                piVar.setItemCount(i3);
                piVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                vi viVar = (vi) hn7Var;
                this.b = true;
                Point point2 = gl.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                viVar.setItemCount(i3);
                viVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
