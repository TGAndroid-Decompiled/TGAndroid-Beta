package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class mw5 extends e34 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final q88 w;

    public mw5(q88 q88Var, Context context, gi3 gi3Var) {
        super(context, gi3Var);
        this.w = q88Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        q88 q88Var = this.w;
        l34 l34Var = q88Var.I0;
        if (l34Var != null && !l34Var.r && l34Var.n) {
            i = l34Var.getStickyX();
            i2 = q88Var.I0.getStickyY();
        } else {
            i = 0;
            i2 = 0;
        }
        float f = this.r;
        if (i != 0) {
            if (f != 1.0f) {
                this.r = ls6.z((float) min, 150.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.r = oo1.x((float) min, 150.0f, f, 0.0f);
            invalidate();
        }
        float f2 = this.s;
        if (i2 != 0) {
            if (f2 != 1.0f) {
                this.s = ls6.z((float) min, 150.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.s = oo1.x((float) min, 150.0f, f2, 0.0f);
            invalidate();
        }
        float f3 = this.s;
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        Paint paint = this.h;
        if (i3 != 0) {
            paint.setAlpha((int) (f3 * 255.0f));
            float measuredHeight = getMeasuredHeight() / 2.0f;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
        } else {
            canvas2 = canvas;
        }
        float f4 = this.r;
        if (f4 != 0.0f) {
            paint.setAlpha((int) (f4 * 255.0f));
            float measuredWidth = getMeasuredWidth() / 2.0f;
            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
        }
    }
}
