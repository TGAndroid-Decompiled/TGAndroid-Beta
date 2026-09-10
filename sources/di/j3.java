package di;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class j3 extends a0 {
    public final n3 f6702s;

    public j3(n3 n3Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f6702s = n3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f6702s.f6788d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
