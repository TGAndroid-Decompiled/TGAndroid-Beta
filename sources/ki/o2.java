package ki;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
public final class o2 extends t {
    public final s2 f18836s;

    public o2(s2 s2Var, Context context, h6 h6Var) {
        super(context, h6Var);
        this.f18836s = s2Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.f18836s.f18938f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.f24146q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
