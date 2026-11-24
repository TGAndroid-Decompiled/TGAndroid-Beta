package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class tv7 extends p44 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final z8b y;

    public tv7(z8b z8bVar, Context context, fk3 fk3Var) {
        super(context, fk3Var);
        this.y = z8bVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(gm.L(2.0f));
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
        z8b z8bVar = this.y;
        w44 w44Var = z8bVar.z0;
        if (w44Var != null && !w44Var.r && w44Var.n) {
            i = w44Var.getStickyX();
            i2 = z8bVar.z0.getStickyY();
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
                this.r = kt6.A((float) min, 150.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.r = aq1.x((float) min, 150.0f, f, 0.0f);
            invalidate();
        }
        float f2 = this.s;
        if (i2 != 0) {
            if (f2 != 1.0f) {
                this.s = kt6.A((float) min, 150.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.s = aq1.x((float) min, 150.0f, f2, 0.0f);
            invalidate();
        }
        float f3 = this.s;
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        Paint paint = this.h;
        if (i3 != 0) {
            paint.setAlpha((int) (f3 * 255.0f));
            int i4 = this.x;
            if (i4 == 1) {
                measuredHeight = gm.L(64.0f);
            } else if (i4 == 2) {
                measuredHeight2 = getMeasuredHeight() / 2.0f;
                float f4 = measuredHeight2;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, getMeasuredWidth(), f4, paint);
            } else {
                measuredHeight = getMeasuredHeight() - gm.L(64.0f);
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
                measuredWidth = gm.L(8.0f);
            } else if (i5 == 2) {
                measuredWidth2 = getMeasuredWidth() / 2.0f;
                float f6 = measuredWidth2;
                canvas2.drawLine(f6, 0.0f, f6, getMeasuredHeight(), paint);
            } else {
                measuredWidth = getMeasuredWidth() - gm.L(8.0f);
            }
            measuredWidth2 = measuredWidth;
            float f62 = measuredWidth2;
            canvas2.drawLine(f62, 0.0f, f62, getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        z8b z8bVar = this.y;
        tv7 tv7Var = z8bVar.H0;
        if (z8bVar.H1 <= 0) {
            z8bVar.H1 = tv7Var.getMeasuredWidth();
        }
        if (z8bVar.I1 <= 0) {
            z8bVar.I1 = tv7Var.getMeasuredHeight();
        }
        z8bVar.H0();
    }
}
