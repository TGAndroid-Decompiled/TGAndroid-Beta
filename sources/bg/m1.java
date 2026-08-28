package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
public final class m1 extends kh.d {
    public final RectF f1875d0;
    public boolean f1876e0;
    public float f1877f0;
    public final org.telegram.ui.Components.voip.h f1878g0;

    public m1(Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.f1875d0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f1878g0 = hVar;
        hVar.f33548n = 1.2f;
        hVar.f33545k = false;
        hVar.f33547m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f1876e0) {
            float f10 = this.f1877f0 + 0.016f;
            this.f1877f0 = f10;
            if (f10 > 3.0f) {
                this.f1876e0 = false;
            }
        } else {
            float f11 = this.f1877f0 - 0.016f;
            this.f1877f0 = f11;
            if (f11 < 1.0f) {
                this.f1876e0 = true;
            }
        }
        RectF rectF = this.f1875d0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        zf.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f1877f0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), zf.a1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f1878g0;
        hVar.f33541f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
