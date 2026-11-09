package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
public final class w2 extends t {
    public final a3 f15021s;

    public w2(a3 a3Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f15021s = a3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.f15021s.f14518e0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f22563q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
