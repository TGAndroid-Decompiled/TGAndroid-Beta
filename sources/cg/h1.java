package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;

public final class h1 extends lh.d {

    public final RectF f2697d0;

    public boolean f2698e0;

    public float f2699f0;

    public final org.telegram.ui.Components.voip.h f2700g0;

    public h1(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f2697d0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f2700g0 = hVar;
        hVar.f33598n = 1.2f;
        hVar.f33595k = false;
        hVar.f33597m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f2698e0) {
            float f10 = this.f2699f0 + 0.016f;
            this.f2699f0 = f10;
            if (f10 > 3.0f) {
                this.f2698e0 = false;
            }
        } else {
            float f11 = this.f2699f0 - 0.016f;
            this.f2699f0 = f11;
            if (f11 < 1.0f) {
                this.f2698e0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.f2697d0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        ag.j2.d().f((-getMeasuredWidth()) * 0.1f * this.f2699f0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), ag.j2.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f2700g0;
        hVar.f33591f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
