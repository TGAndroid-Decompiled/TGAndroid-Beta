package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class f1 extends ph.d {
    public final RectF f6622e0;
    public boolean f6623f0;
    public float f6624g0;
    public final org.telegram.ui.Components.voip.h f6625h0;

    public f1(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f6622e0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f6625h0 = hVar;
        hVar.f29663n = 1.2f;
        hVar.f29660k = false;
        hVar.f29662m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f6623f0) {
            float f10 = this.f6624g0 + 0.016f;
            this.f6624g0 = f10;
            if (f10 > 3.0f) {
                this.f6623f0 = false;
            }
        } else {
            float f11 = this.f6624g0 - 0.016f;
            this.f6624g0 = f11;
            if (f11 < 1.0f) {
                this.f6623f0 = true;
            }
        }
        RectF rectF = this.f6622e0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        eg.r1.d().f((-getMeasuredWidth()) * 0.1f * this.f6624g0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), eg.r1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f6625h0;
        hVar.f29656f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
