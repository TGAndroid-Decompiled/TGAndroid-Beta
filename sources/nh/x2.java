package nh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;

public final class x2 extends v {

    public final b3 f19047s;

    public x2(b3 b3Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f19047s = b3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f19047s.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
