package defpackage;

import android.view.View;
public final class ix extends d32 {
    public boolean d0;

    @Override
    public final void onMeasure(int i, int i2) {
        this.d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i2) * 0.4f);
        this.d0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - gm.L(56.0f)) - gm.m, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.d0) {
            super.requestLayout();
        }
    }
}
