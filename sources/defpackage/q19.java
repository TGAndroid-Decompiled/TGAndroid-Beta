package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
public final class q19 extends MetricAffectingSpan implements LineHeightSpan {
    public r19 a;

    @Override
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        r19 r19Var = this.a;
        if (r19Var.b) {
            int i7 = 2;
            if (r19Var.f) {
                i5 = 7;
            } else {
                i5 = 2;
            }
            if (i <= r19Var.c) {
                int i8 = fontMetricsInt.ascent;
                if (r19Var.n) {
                    i6 = 2;
                } else {
                    i6 = 0;
                }
                fontMetricsInt.ascent = i8 - hl.L(i6 + i5);
                int i9 = fontMetricsInt.top;
                if (!this.a.n) {
                    i7 = 0;
                }
                fontMetricsInt.top = i9 - hl.L(i7 + i5);
            }
            if (i2 >= this.a.d) {
                float f = i5;
                fontMetricsInt.descent = hl.L(f) + fontMetricsInt.descent;
                fontMetricsInt.bottom = hl.L(f) + fontMetricsInt.bottom;
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
            f = xea.S0 - 2;
        }
        textPaint.setTextSize(hl.L(f));
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float f;
        float f2;
        if (this.a.a) {
            f = 16.0f;
        } else {
            f = xea.S0 - 2;
        }
        textPaint.setTextSize(hl.L(f));
        if (this.a.a) {
            f2 = 1.1f;
        } else {
            f2 = 1.0f;
        }
        textPaint.setTextScaleX(f2);
    }
}
