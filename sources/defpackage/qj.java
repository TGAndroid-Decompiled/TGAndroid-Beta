package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class qj extends LinearLayout {
    public final byte a;
    public boolean b;
    public final lp7 c;

    public qj(Context context, lp7 lp7Var, byte b) {
        super(context);
        this.a = b;
        this.c = lp7Var;
        this.b = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        int i3 = 5;
        lp7 lp7Var = this.c;
        switch (b) {
            case 0:
                pj pjVar = (pj) lp7Var;
                this.b = true;
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                pjVar.setItemCount(i3);
                pjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                vj vjVar = (vj) lp7Var;
                this.b = true;
                Point point2 = gm.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                vjVar.setItemCount(i3);
                vjVar.getLayoutParams().height = gm.L(42.0f) * i3;
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
