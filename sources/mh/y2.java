package mh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
public final class y2 extends w {
    public final c3 f18231s;

    public y2(c3 c3Var, Context context, b6 b6Var) {
        super(context, b6Var);
        this.f18231s = c3Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (!this.f18231s.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i9 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i9, i10);
    }
}
