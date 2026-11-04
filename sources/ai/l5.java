package ai;

import android.view.View;
public final class l5 extends org.telegram.ui.ActionBar.y0 {
    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }
}
