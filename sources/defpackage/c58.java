package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class c58 extends FrameLayout {
    public static final float O = gl.L(20.0f);
    public static final float P = gl.L(30.0f);
    public static final float Q = gl.L(30.0f);
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public Paint J;
    public Paint K;
    public boolean L;
    public b58 M;
    public int N;
    public PointF a;
    public float b;
    public float c;
    public via d;
    public PointF e;
    public float f;
    public float h;
    public float n;
    public RectF r;
    public float s;
    public float w;
    public float x;
    public float y;

    public static float a(float f) {
        return (f * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = x - motionEvent.getX(1);
        float y2 = y - motionEvent.getY(1);
        return (float) Math.sqrt((y2 * y2) + (x2 * x2));
    }

    private PointF getActualCenterPoint() {
        int i;
        via viaVar = this.d;
        float f = viaVar.a;
        float width = (this.e.x * f) + ((getWidth() - f) / 2.0f);
        if (!this.L) {
            i = gl.m;
        } else {
            i = 0;
        }
        float height = getHeight();
        float f2 = viaVar.b;
        float z = oo1.z(height, f2, 2.0f, i);
        float f3 = viaVar.a;
        return new PointF(width, (this.e.y * f3) + tb4.x(f3, f2, 2.0f, z));
    }

    private float getActualInnerRadius() {
        via viaVar = this.d;
        return Math.min(viaVar.a, viaVar.b) * this.f;
    }

    private float getActualOuterRadius() {
        via viaVar = this.d;
        return Math.min(viaVar.a, viaVar.b) * this.h;
    }

    public final void c(int r22, android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c58.c(int, android.view.MotionEvent):void");
    }

    public final void d(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    this.N = 1;
                    return;
                }
                return;
            }
        } else {
            this.x = b(motionEvent);
            this.y = 1.0f;
            this.N = 5;
        }
        float b = b(motionEvent);
        float A = b00.A(b - this.x, gl.p, 0.01f, this.y);
        this.y = A;
        float max = Math.max(0.1f, this.f * A);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.y);
        this.y = 1.0f;
        this.x = b;
        invalidate();
        b58 b58Var = this.M;
        if (b58Var != null) {
            PointF pointF = this.e;
            float f = this.f;
            float f2 = this.h;
            l58 l58Var = ((f58) b58Var).a;
            l58Var.b0 = f2;
            l58Var.c0 = pointF;
            l58Var.d0 = f;
            l58Var.e0 = a(this.n) + 1.5707964f;
            td4 td4Var = l58Var.m0;
            if (td4Var != null) {
                td4Var.b(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.K;
        RectF rectF = this.r;
        Paint paint3 = paint2;
        Paint paint4 = this.J;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i = this.I;
        int i2 = 0;
        if (i == 0) {
            canvas2.rotate(this.n);
            float L = gl.L(6.0f);
            float L2 = gl.L(12.0f);
            float L3 = gl.L(1.5f);
            int i3 = 0;
            while (i3 < 30) {
                float f = L2 + L;
                float f2 = i3 * f;
                float f3 = -actualInnerRadius;
                float f4 = f2 + L2;
                float f5 = L3 - actualInnerRadius;
                canvas2.drawRect(f2, f3, f4, f5, paint4);
                float f6 = ((-i3) * f) - L;
                float f7 = f6 - L2;
                canvas.drawRect(f7, f3, f6, f5, paint4);
                float f8 = L3 + actualInnerRadius;
                float f9 = actualInnerRadius;
                canvas.drawRect(f2, f9, f4, f8, paint4);
                canvas.drawRect(f7, f9, f6, f8, paint4);
                i3++;
                canvas2 = canvas;
                actualInnerRadius = f9;
            }
            float L4 = gl.L(6.0f);
            while (i2 < 64) {
                float f10 = L4 + L;
                float f11 = i2 * f10;
                float f12 = -actualOuterRadius;
                float f13 = L4 + f11;
                float f14 = L3 - actualOuterRadius;
                canvas.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i2) * f10) - L;
                float f16 = f15 - L4;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = L3 + actualOuterRadius;
                float f18 = actualOuterRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i2++;
                actualOuterRadius = f18;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i == 1) {
                float f19 = -actualInnerRadius;
                rectF.set(f19, f19, actualInnerRadius, actualInnerRadius);
                int i4 = 0;
                while (i4 < 22) {
                    Paint paint5 = paint3;
                    RectF rectF2 = rectF;
                    canvas.drawArc(rectF2, i4 * 16.35f, 10.2f, false, paint5);
                    i4++;
                    rectF = rectF2;
                    paint3 = paint5;
                }
                RectF rectF3 = rectF;
                Paint paint6 = paint3;
                float f20 = -actualOuterRadius;
                rectF3.set(f20, f20, actualOuterRadius, actualOuterRadius);
                while (i2 < 64) {
                    canvas.drawArc(rectF3, 5.62f * i2, 3.6f, false, paint6);
                    i2++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, gl.L(8.0f), paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c58.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(b58 b58Var) {
        this.M = b58Var;
    }

    public void setType(int i) {
        this.I = i;
        invalidate();
    }
}
