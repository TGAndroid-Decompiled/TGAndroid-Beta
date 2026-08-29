package bh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.u51;
public final class n extends u51 {
    public final int f2691b3;

    public n(o2 o2Var, m mVar, int i10) {
        super(o2Var, mVar, null, null);
        this.f2691b3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i7.w.b(this.f2691b3, 1, 5) * 48), 1073741824));
    }
}
