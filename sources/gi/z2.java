package gi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class z2 extends w {
    public final d3 f11607s;

    public z2(d3 d3Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f11607s = d3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f11607s.f11163e0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
