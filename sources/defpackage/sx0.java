package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class sx0 extends zp0 {
    public final wx0 s;

    public sx0(wx0 wx0Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.s = wx0Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.s.f0 && gm.O1() && !gm.E && !gm.N1()) {
            Point point = gm.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
