package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class ha2 extends FrameLayout {
    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }
}
