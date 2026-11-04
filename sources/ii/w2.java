package ii;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
public final class w2 extends v {
    public final a3 f15304s;

    public w2(a3 a3Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f15304s = a3Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (!this.f15304s.f14803f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            i3 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i3, i10);
    }
}
