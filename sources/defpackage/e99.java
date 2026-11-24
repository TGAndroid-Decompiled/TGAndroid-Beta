package defpackage;

import android.view.View;
public final class e99 extends a8 {
    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }
}
