package defpackage;

import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.a;
public final class uw0 extends a {
    @Override
    public final void onMeasure(int i, int i2) {
        if (hl.O1() && !hl.E && !hl.N1()) {
            Point point = hl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
