package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class i15 extends c51 {
    public final RectF m0;
    public boolean n0;
    public float o0;
    public final fe1 p0;

    public i15(Context context, vnb vnbVar) {
        super(vnbVar, context, true);
        this.m0 = new RectF();
        fe1 fe1Var = new fe1();
        this.p0 = fe1Var;
        fe1Var.n = 1.2f;
        fe1Var.k = false;
        fe1Var.m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z = this.n0;
        float f = this.o0;
        if (z) {
            float f2 = f + 0.016f;
            this.o0 = f2;
            if (f2 > 3.0f) {
                this.n0 = false;
            }
        } else {
            float f3 = f - 0.016f;
            this.o0 = f3;
            if (f3 < 1.0f) {
                this.n0 = true;
            }
        }
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        bl8.d().f((-getMeasuredWidth()) * 0.1f * this.o0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), bl8.d().e());
        int measuredWidth = getMeasuredWidth();
        fe1 fe1Var = this.p0;
        fe1Var.f = measuredWidth;
        fe1Var.a(hl.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
