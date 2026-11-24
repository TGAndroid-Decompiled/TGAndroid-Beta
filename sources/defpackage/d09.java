package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class d09 extends k34 {
    public final byte n;
    public RectF r;

    public d09(am9 am9Var, Context context) {
        super(am9Var, context);
        this.n = (byte) 1;
        this.r = new RectF();
    }

    @Override
    public final int a(float f, float f2) {
        float measuredWidth;
        float measuredWidth2;
        float measuredWidth3;
        switch (this.n) {
            case 0:
                float L = gl.L(19.5f);
                float L2 = gl.L(1.0f) + L;
                float f3 = L2 * 2.0f;
                float z = oo1.z(getMeasuredHeight(), f3, 2.0f, L2);
                if (f > L2 - L && f2 > z - L && f < L2 + L && f2 < z + L) {
                    return 1;
                }
                if (f > ((getMeasuredWidth() - f3) + L2) - L && f2 > z - L && f < (getMeasuredWidth() - f3) + L2 + L && f2 < z + L) {
                    return 2;
                }
                if (Math.pow(f2 - measuredWidth, 2.0d) + Math.pow(f - measuredWidth, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            case 1:
                float L3 = gl.L(19.5f);
                float L4 = gl.L(1.0f) + L3;
                float f4 = L4 * 2.0f;
                float z2 = oo1.z(getMeasuredHeight(), f4, 2.0f, L4);
                if (f > L4 - L3 && f2 > z2 - L3 && f < L4 + L3 && f2 < z2 + L3) {
                    return 1;
                }
                if (f > ((getMeasuredWidth() - f4) + L4) - L3 && f2 > z2 - L3 && f < (getMeasuredWidth() - f4) + L4 + L3 && f2 < z2 + L3) {
                    return 2;
                }
                if (Math.pow(f2 - measuredWidth2, 2.0d) + Math.pow(f - measuredWidth2, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            default:
                float L5 = gl.L(19.5f);
                float L6 = gl.L(1.0f) + L5;
                float f5 = L6 * 2.0f;
                float z3 = oo1.z(getMeasuredHeight(), f5, 2.0f, L6);
                if (f > L6 - L5 && f2 > z3 - L5 && f < L6 + L5 && f2 < z3 + L5) {
                    return 1;
                }
                if (f > ((getMeasuredWidth() - f5) + L6) - L5 && f2 > z3 - L5 && f < (getMeasuredWidth() - f5) + L6 + L5 && f2 < z3 + L5) {
                    return 2;
                }
                if (Math.pow(f2 - measuredWidth3, 2.0d) + Math.pow(f - measuredWidth3, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.n;
        Paint paint = this.c;
        Paint paint2 = this.b;
        switch (b) {
            case 0:
                RectF rectF = this.r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float N = gl.N(5.66f);
                    float L = gl.L(1.0f) + N + gl.L(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - L;
                    float f = (2.0f * measuredWidth) + L;
                    rectF.set(L, L, f, f);
                    Paint paint3 = this.a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint3);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint3);
                    float f2 = measuredWidth + L;
                    canvas.drawCircle(L, f2, N, paint);
                    canvas.drawCircle(L, f2, N - gl.L(1.0f), paint2);
                    canvas.drawCircle(f, f2, N, paint);
                    canvas.drawCircle(f, f2, N - gl.L(1.0f), paint2);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            case 1:
                RectF rectF2 = this.r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float N2 = gl.N(5.66f);
                    float L2 = gl.L(1.0f) + N2 + gl.L(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - L2;
                    float f3 = (2.0f * measuredWidth2) + L2;
                    rectF2.set(L2, L2, f3, f3);
                    Paint paint4 = this.a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f4 = measuredWidth2 + L2;
                    canvas.drawCircle(L2, f4, N2, paint);
                    canvas.drawCircle(L2, f4, N2 - gl.L(1.0f), paint2);
                    canvas.drawCircle(f3, f4, N2, paint);
                    canvas.drawCircle(f3, f4, N2 - gl.L(1.0f), paint2);
                    canvas.restoreToCount(saveCount2);
                    return;
                }
                return;
            default:
                RectF rectF3 = this.r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float N3 = gl.N(5.66f);
                    float L3 = gl.L(1.0f) + N3 + gl.L(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - L3;
                    float f5 = (2.0f * measuredWidth3) + L3;
                    rectF3.set(L3, L3, f5, f5);
                    Paint paint5 = this.a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint5);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint5);
                    float f6 = measuredWidth3 + L3;
                    canvas.drawCircle(L3, f6, N3, paint);
                    canvas.drawCircle(L3, f6, N3 - gl.L(1.0f), paint2);
                    canvas.drawCircle(f5, f6, N3, paint);
                    canvas.drawCircle(f5, f6, N3 - gl.L(1.0f), paint2);
                    canvas.restoreToCount(saveCount3);
                    return;
                }
                return;
        }
    }

    public d09(l34 l34Var, Context context, byte b) {
        super(l34Var, context);
        this.n = b;
    }
}
