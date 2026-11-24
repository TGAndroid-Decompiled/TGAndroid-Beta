package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class st7 extends e34 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final x6b y;

    public st7(x6b x6bVar, Context context, s34 s34Var) {
        super(context, s34Var);
        this.y = x6bVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.y.g2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        int measuredWidth;
        float measuredWidth2;
        int measuredHeight;
        float measuredHeight2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        x6b x6bVar = this.y;
        l34 l34Var = x6bVar.z0;
        if (l34Var != null && !l34Var.r && l34Var.n) {
            i = l34Var.getStickyX();
            i2 = x6bVar.z0.getStickyY();
        } else {
            i = 0;
            i2 = 0;
        }
        if (i != 0) {
            this.w = i;
        }
        if (i2 != 0) {
            this.x = i2;
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
            int i4 = this.x;
            if (i4 == 1) {
                measuredHeight = gl.L(64.0f);
            } else if (i4 == 2) {
                measuredHeight2 = getMeasuredHeight() / 2.0f;
                float f4 = measuredHeight2;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, getMeasuredWidth(), f4, paint);
            } else {
                measuredHeight = getMeasuredHeight() - gl.L(64.0f);
            }
            measuredHeight2 = measuredHeight;
            float f42 = measuredHeight2;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f42, getMeasuredWidth(), f42, paint);
        } else {
            canvas2 = canvas;
        }
        float f5 = this.r;
        if (f5 != 0.0f) {
            paint.setAlpha((int) (f5 * 255.0f));
            int i5 = this.w;
            if (i5 == 1) {
                measuredWidth = gl.L(8.0f);
            } else if (i5 == 2) {
                measuredWidth2 = getMeasuredWidth() / 2.0f;
                float f6 = measuredWidth2;
                canvas2.drawLine(f6, 0.0f, f6, getMeasuredHeight(), paint);
            } else {
                measuredWidth = getMeasuredWidth() - gl.L(8.0f);
            }
            measuredWidth2 = measuredWidth;
            float f62 = measuredWidth2;
            canvas2.drawLine(f62, 0.0f, f62, getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        x6b x6bVar = this.y;
        st7 st7Var = x6bVar.H0;
        if (x6bVar.H1 <= 0) {
            x6bVar.H1 = st7Var.getMeasuredWidth();
        }
        if (x6bVar.I1 <= 0) {
            x6bVar.I1 = st7Var.getMeasuredHeight();
        }
        x6bVar.H0();
    }
}
