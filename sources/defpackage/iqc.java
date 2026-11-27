package defpackage;

import android.content.Context;
import android.view.View;
public final class iqc extends frc {
    public final uqc m0;

    public iqc(uqc uqcVar, Context context) {
        super(context);
        this.m0 = uqcVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        uqc uqcVar = this.m0;
        if (uqcVar.r > 0 && getMeasuredHeight() > uqcVar.r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, uqcVar.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), 0);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        uqc uqcVar = this.m0;
        uqcVar.Y0(uqcVar.A0);
        uqcVar.Z0(fArr);
    }
}
