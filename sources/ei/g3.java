package ei;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class g3 extends x {
    public final k3 f8365s;

    public g3(k3 k3Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f8365s = k3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f8365s.f8431d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
