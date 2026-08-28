package fh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d5 extends org.telegram.ui.ActionBar.g1 {
    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }
}
