package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class tw0 extends zo0 {
    public final xw0 s;

    public tw0(xw0 xw0Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.s = xw0Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.s.f0 && hl.O1() && !hl.E && !hl.N1()) {
            Point point = hl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
