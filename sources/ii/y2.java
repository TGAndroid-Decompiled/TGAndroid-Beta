package ii;

import android.graphics.Point;
import android.view.View;
public final class y2 extends w3 {
    @Override
    public final void onMeasure(int i3, int i10) {
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            i3 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i3, i10);
    }
}
