package defpackage;

import android.content.Context;
import android.view.View;
public final class unc extends soc {
    public final goc m0;

    public unc(goc gocVar, Context context) {
        super(context);
        this.m0 = gocVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        goc gocVar = this.m0;
        if (gocVar.r > 0 && getMeasuredHeight() > gocVar.r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, gocVar.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), 0);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        goc gocVar = this.m0;
        gocVar.Z0(gocVar.A0);
        gocVar.a1(fArr);
    }
}
