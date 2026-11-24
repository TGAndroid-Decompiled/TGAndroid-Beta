package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class kw0 extends zo0 {
    public final ow0 s;

    public kw0(ow0 ow0Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.s = ow0Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.s.f0 && gl.O1() && !gl.E && !gl.N1()) {
            Point point = gl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
