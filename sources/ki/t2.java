package ki;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
public final class t2 extends v {
    public final x2 f18568s;

    public t2(x2 x2Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f18568s = x2Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.f18568s.f18662f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f23609q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
