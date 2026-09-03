package dh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;
public final class n extends g61 {
    public final int c3;

    public n(p2 p2Var, m mVar, int i10) {
        super(p2Var, mVar, null, null);
        this.c3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(k7.n.b(this.c3, 1, 5) * 48), 1073741824));
    }
}
