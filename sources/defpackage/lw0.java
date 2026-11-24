package defpackage;

import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.a;
public final class lw0 extends a {
    @Override
    public final void onMeasure(int i, int i2) {
        if (gl.O1() && !gl.E && !gl.N1()) {
            Point point = gl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
