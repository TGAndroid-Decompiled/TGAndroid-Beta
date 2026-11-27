package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class zw7 extends a44 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final vab y;

    public zw7(vab vabVar, Context context, v34 v34Var) {
        super(context, v34Var);
        this.y = vabVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.y.a2) {
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
        vab vabVar = this.y;
        h44 h44Var = vabVar.t0;
        if (h44Var != null && !h44Var.r && h44Var.n) {
            i = h44Var.getStickyX();
            i2 = vabVar.t0.getStickyY();
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
                this.r = qu6.z((float) min, 150.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.r = bp1.x((float) min, 150.0f, f, 0.0f);
            invalidate();
        }
        float f2 = this.s;
        if (i2 != 0) {
            if (f2 != 1.0f) {
                this.s = qu6.z((float) min, 150.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.s = bp1.x((float) min, 150.0f, f2, 0.0f);
            invalidate();
        }
        float f3 = this.s;
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        Paint paint = this.h;
        if (i3 != 0) {
            paint.setAlpha((int) (f3 * 255.0f));
            int i4 = this.x;
            if (i4 == 1) {
                measuredHeight = hl.L(64.0f);
            } else if (i4 == 2) {
                measuredHeight2 = getMeasuredHeight() / 2.0f;
                float f4 = measuredHeight2;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, getMeasuredWidth(), f4, paint);
            } else {
                measuredHeight = getMeasuredHeight() - hl.L(64.0f);
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
                measuredWidth = hl.L(8.0f);
            } else if (i5 == 2) {
                measuredWidth2 = getMeasuredWidth() / 2.0f;
                float f6 = measuredWidth2;
                canvas2.drawLine(f6, 0.0f, f6, getMeasuredHeight(), paint);
            } else {
                measuredWidth = getMeasuredWidth() - hl.L(8.0f);
            }
            measuredWidth2 = measuredWidth;
            float f62 = measuredWidth2;
            canvas2.drawLine(f62, 0.0f, f62, getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        vab vabVar = this.y;
        zw7 zw7Var = vabVar.B0;
        if (vabVar.B1 <= 0) {
            vabVar.B1 = zw7Var.getMeasuredWidth();
        }
        if (vabVar.C1 <= 0) {
            vabVar.C1 = zw7Var.getMeasuredHeight();
        }
        vabVar.G0();
    }
}
