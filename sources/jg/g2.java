package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class g2 extends i {
    public final int f9981n;
    public RectF f9982r;

    public g2(j jVar, Context context, int i10) {
        super(jVar, context);
        this.f9981n = i10;
    }

    @Override
    public final int a(float f7, float f10) {
        float measuredWidth;
        float measuredWidth2;
        float measuredWidth3;
        switch (this.f9981n) {
            case 0:
                float L = org.telegram.messenger.i0.L(19.5f);
                float L2 = org.telegram.messenger.i0.L(1.0f) + L;
                float f11 = L2 * 2.0f;
                float B = c3.i0.B(getMeasuredHeight(), f11, 2.0f, L2);
                if (f7 > L2 - L && f10 > B - L && f7 < L2 + L && f10 < B + L) {
                    return 1;
                }
                if (f7 > ((getMeasuredWidth() - f11) + L2) - L && f10 > B - L && f7 < (getMeasuredWidth() - f11) + L2 + L && f10 < B + L) {
                    return 2;
                }
                if (Math.pow(f10 - measuredWidth, 2.0d) + Math.pow(f7 - measuredWidth, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            case 1:
                float L3 = org.telegram.messenger.i0.L(19.5f);
                float L4 = org.telegram.messenger.i0.L(1.0f) + L3;
                float f12 = L4 * 2.0f;
                float B2 = c3.i0.B(getMeasuredHeight(), f12, 2.0f, L4);
                if (f7 > L4 - L3 && f10 > B2 - L3 && f7 < L4 + L3 && f10 < B2 + L3) {
                    return 1;
                }
                if (f7 > ((getMeasuredWidth() - f12) + L4) - L3 && f10 > B2 - L3 && f7 < (getMeasuredWidth() - f12) + L4 + L3 && f10 < B2 + L3) {
                    return 2;
                }
                if (Math.pow(f10 - measuredWidth2, 2.0d) + Math.pow(f7 - measuredWidth2, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
            default:
                float L5 = org.telegram.messenger.i0.L(19.5f);
                float L6 = org.telegram.messenger.i0.L(1.0f) + L5;
                float f13 = L6 * 2.0f;
                float B3 = c3.i0.B(getMeasuredHeight(), f13, 2.0f, L6);
                if (f7 > L6 - L5 && f10 > B3 - L5 && f7 < L6 + L5 && f10 < B3 + L5) {
                    return 1;
                }
                if (f7 > ((getMeasuredWidth() - f13) + L6) - L5 && f10 > B3 - L5 && f7 < (getMeasuredWidth() - f13) + L6 + L5 && f10 < B3 + L5) {
                    return 2;
                }
                if (Math.pow(f10 - measuredWidth3, 2.0d) + Math.pow(f7 - measuredWidth3, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                    return 3;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f9981n) {
            case 0:
                RectF rectF = this.f9982r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float N = org.telegram.messenger.i0.N(5.66f);
                    float L = org.telegram.messenger.i0.L(1.0f) + N + org.telegram.messenger.i0.L(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - L;
                    float f7 = (2.0f * measuredWidth) + L;
                    rectF.set(L, L, f7, f7);
                    Paint paint = this.f10011a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f10 = measuredWidth + L;
                    Paint paint2 = this.f10013c;
                    canvas.drawCircle(L, f10, N, paint2);
                    Paint paint3 = this.f10012b;
                    canvas.drawCircle(L, f10, N - org.telegram.messenger.i0.L(1.0f), paint3);
                    canvas.drawCircle(f7, f10, N, paint2);
                    canvas.drawCircle(f7, f10, N - org.telegram.messenger.i0.L(1.0f), paint3);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            case 1:
                RectF rectF2 = this.f9982r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float N2 = org.telegram.messenger.i0.N(5.66f);
                    float L2 = org.telegram.messenger.i0.L(1.0f) + N2 + org.telegram.messenger.i0.L(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - L2;
                    float f11 = (2.0f * measuredWidth2) + L2;
                    rectF2.set(L2, L2, f11, f11);
                    Paint paint4 = this.f10011a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f12 = measuredWidth2 + L2;
                    Paint paint5 = this.f10013c;
                    canvas.drawCircle(L2, f12, N2, paint5);
                    Paint paint6 = this.f10012b;
                    canvas.drawCircle(L2, f12, N2 - org.telegram.messenger.i0.L(1.0f), paint6);
                    canvas.drawCircle(f11, f12, N2, paint5);
                    canvas.drawCircle(f11, f12, N2 - org.telegram.messenger.i0.L(1.0f), paint6);
                    canvas.restoreToCount(saveCount2);
                    return;
                }
                return;
            default:
                RectF rectF3 = this.f9982r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float N3 = org.telegram.messenger.i0.N(5.66f);
                    float L3 = org.telegram.messenger.i0.L(1.0f) + N3 + org.telegram.messenger.i0.L(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - L3;
                    float f13 = (2.0f * measuredWidth3) + L3;
                    rectF3.set(L3, L3, f13, f13);
                    Paint paint7 = this.f10011a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f14 = measuredWidth3 + L3;
                    Paint paint8 = this.f10013c;
                    canvas.drawCircle(L3, f14, N3, paint8);
                    Paint paint9 = this.f10012b;
                    canvas.drawCircle(L3, f14, N3 - org.telegram.messenger.i0.L(1.0f), paint9);
                    canvas.drawCircle(f13, f14, N3, paint8);
                    canvas.drawCircle(f13, f14, N3 - org.telegram.messenger.i0.L(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    return;
                }
                return;
        }
    }

    public g2(i2 i2Var, Context context) {
        super(i2Var, context);
        this.f9981n = 1;
        this.f9982r = new RectF();
    }
}
