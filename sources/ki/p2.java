package ki;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
public final class p2 extends u {
    public final t2 f18826s;

    public p2(t2 t2Var, Context context, i6 i6Var) {
        super(context, i6Var);
        this.f18826s = t2Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.f18826s.f18928f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f24118q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
