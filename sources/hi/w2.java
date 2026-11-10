package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
public final class w2 extends t {
    public final a3 f15023s;

    public w2(a3 a3Var, Context context, h6 h6Var) {
        super(context, h6Var);
        this.f15023s = a3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.f15023s.f14520e0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f22567q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
