package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class f1 extends qh.d {
    public final RectF f7466e0;
    public boolean f7467f0;
    public float f7468g0;
    public final org.telegram.ui.Components.voip.h f7469h0;

    public f1(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f7466e0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f7469h0 = hVar;
        hVar.f32062n = 1.2f;
        hVar.f32059k = false;
        hVar.f32061m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f7467f0) {
            float f10 = this.f7468g0 + 0.016f;
            this.f7468g0 = f10;
            if (f10 > 3.0f) {
                this.f7467f0 = false;
            }
        } else {
            float f11 = this.f7468g0 - 0.016f;
            this.f7468g0 = f11;
            if (f11 < 1.0f) {
                this.f7467f0 = true;
            }
        }
        RectF rectF = this.f7466e0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        fg.q1.d().f((-getMeasuredWidth()) * 0.1f * this.f7468g0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), fg.q1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f7469h0;
        hVar.f32055f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
