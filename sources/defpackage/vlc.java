package defpackage;

import android.content.Context;
import android.view.View;
public final class vlc extends smc {
    public final hmc m0;

    public vlc(hmc hmcVar, Context context) {
        super(context);
        this.m0 = hmcVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        hmc hmcVar = this.m0;
        if (hmcVar.r > 0 && getMeasuredHeight() > hmcVar.r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, hmcVar.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), 0);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        hmc hmcVar = this.m0;
        hmcVar.Y0(hmcVar.A0);
        hmcVar.Z0(fArr);
    }
}
