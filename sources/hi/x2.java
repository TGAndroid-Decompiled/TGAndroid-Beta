package hi;

import android.graphics.Point;
import android.view.View;
public final class x2 extends org.telegram.ui.ActionBar.l {
    @Override
    public final void onMeasure(int i7, int i10) {
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f22567q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
