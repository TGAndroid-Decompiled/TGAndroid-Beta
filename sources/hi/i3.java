package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class i3 extends d0 {
    public final m3 f13033s;

    public i3(m3 m3Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.f13033s = m3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f13033s.f13108e0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
