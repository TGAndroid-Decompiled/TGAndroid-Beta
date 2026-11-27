package defpackage;

import android.view.View;
public final class c95 extends r95 {
    @Override
    public final void onMeasure(int i, int i2) {
        if (hl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(420.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
