package defpackage;

import android.graphics.Point;
import android.view.View;
public final class ux0 extends x22 {
    @Override
    public final void onMeasure(int i, int i2) {
        if (gm.O1() && !gm.E && !gm.N1()) {
            Point point = gm.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
