package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class ez4 extends u41 {
    public final RectF m0;
    public boolean n0;
    public float o0;
    public final wd1 p0;

    public ez4(Context context, wjb wjbVar) {
        super(wjbVar, context, true);
        this.m0 = new RectF();
        wd1 wd1Var = new wd1();
        this.p0 = wd1Var;
        wd1Var.n = 1.2f;
        wd1Var.k = false;
        wd1Var.m = 4.0f;
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
        nh8.d().f((-getMeasuredWidth()) * 0.1f * this.o0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), nh8.d().e());
        int measuredWidth = getMeasuredWidth();
        wd1 wd1Var = this.p0;
        wd1Var.f = measuredWidth;
        wd1Var.a(gl.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
