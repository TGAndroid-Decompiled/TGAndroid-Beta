package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class g1 extends nh.d {
    public final RectF f5999d0;
    public boolean f6000e0;
    public float f6001f0;
    public final org.telegram.ui.Components.voip.h f6002g0;

    public g1(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f5999d0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f6002g0 = hVar;
        hVar.f33727n = 1.2f;
        hVar.f33724k = false;
        hVar.f33726m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f6000e0) {
            float f9 = this.f6001f0 + 0.016f;
            this.f6001f0 = f9;
            if (f9 > 3.0f) {
                this.f6000e0 = false;
            }
        } else {
            float f10 = this.f6001f0 - 0.016f;
            this.f6001f0 = f10;
            if (f10 < 1.0f) {
                this.f6000e0 = true;
            }
        }
        RectF rectF = this.f5999d0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        cg.s1.d().f((-getMeasuredWidth()) * 0.1f * this.f6001f0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), cg.s1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f6002g0;
        hVar.f33720f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
