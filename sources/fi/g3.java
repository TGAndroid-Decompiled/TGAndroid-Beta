package fi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class g3 extends w {
    public final k3 f9293s;

    public g3(k3 k3Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f9293s = k3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f9293s.f9360d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
