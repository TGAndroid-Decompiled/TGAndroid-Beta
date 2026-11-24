package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
public final class dy8 extends MetricAffectingSpan implements LineHeightSpan {
    public ey8 a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        ey8 ey8Var = this.a;
        if (ey8Var.b) {
            int i7 = 2;
            if (ey8Var.f) {
                i5 = 7;
            } else {
                i5 = 2;
            }
            if (i <= ey8Var.c) {
                int i8 = fontMetricsInt.ascent;
                if (ey8Var.n) {
                    i6 = 2;
                } else {
                    i6 = 0;
                }
                fontMetricsInt.ascent = i8 - gl.L(i6 + i5);
                int i9 = fontMetricsInt.top;
                if (!this.a.n) {
                    i7 = 0;
                }
                fontMetricsInt.top = i9 - gl.L(i7 + i5);
            }
            if (i2 >= this.a.d) {
                float f = i5;
                fontMetricsInt.descent = gl.L(f) + fontMetricsInt.descent;
                fontMetricsInt.bottom = gl.L(f) + fontMetricsInt.bottom;
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float f;
        if (textPaint == null) {
            return;
        }
        if (this.a.a) {
            f = 16.0f;
        } else {
            f = gba.S0 - 2;
        }
        textPaint.setTextSize(gl.L(f));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f;
        float f2;
        if (this.a.a) {
            f = 16.0f;
        } else {
            f = gba.S0 - 2;
        }
        textPaint.setTextSize(gl.L(f));
        if (this.a.a) {
            f2 = 1.1f;
        } else {
            f2 = 1.0f;
        }
        textPaint.setTextScaleX(f2);
    }
}
