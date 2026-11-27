package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class ri extends LinearLayout {
    public final byte a;
    public boolean b;
    public final hq7 c;

    public ri(Context context, hq7 hq7Var, byte b) {
        super(context);
        this.a = b;
        this.c = hq7Var;
        this.b = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        int i3 = 5;
        hq7 hq7Var = this.c;
        switch (b) {
            case 0:
                qi qiVar = (qi) hq7Var;
                this.b = true;
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                qiVar.setItemCount(i3);
                qiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                wi wiVar = (wi) hq7Var;
                this.b = true;
                Point point2 = hl.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                wiVar.setItemCount(i3);
                wiVar.getLayoutParams().height = hl.L(42.0f) * i3;
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
