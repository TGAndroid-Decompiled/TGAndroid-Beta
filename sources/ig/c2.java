package ig;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i8;
public final class c2 extends i8 {
    public final int O;

    public c2(int i10, Context context, u6 u6Var, boolean z10) {
        super(context, u6Var, z10);
        this.O = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.O) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
        }
    }
}
