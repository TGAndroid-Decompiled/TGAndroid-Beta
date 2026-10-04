package ei;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class h3 extends y {
    public final l3 f9083s;

    public h3(l3 l3Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.f9083s = l3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f9083s.f9155d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
