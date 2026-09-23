package ei;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class g3 extends x {
    public final k3 f8349s;

    public g3(k3 k3Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.f8349s = k3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f8349s.f8415d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
