package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;
public final class h6 extends ImageSpan {
    public Paint.FontMetricsInt f15838a;
    public float f15839b;
    public int f15840c;
    public String d;
    public boolean e;
    public int f15841f;
    public boolean h;
    public float f15842n;
    public float f15843r;

    public static void a(Paint.FontMetricsInt fontMetricsInt, int i10) {
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        int i13 = i11 - i12;
        if (i10 <= i13) {
            return;
        }
        int i14 = i10 - i13;
        int i15 = (i14 + 1) / 2;
        int i16 = i12 - i15;
        fontMetricsInt.ascent = i16;
        fontMetricsInt.descent = i11 + (i14 - i15);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i16);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10;
        this.f15842n = a1.g.A(this.f15839b, this.f15840c, 2.0f, f7);
        this.f15843r = ((i14 - i12) / 2.0f) + i12;
        boolean z11 = true;
        this.h = true;
        if (paint.getAlpha() != 255 && k6.f16540n) {
            getDrawable().setAlpha(paint.getAlpha());
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = k6.f16539m;
        int i15 = this.f15840c;
        float f11 = f10 - ((i15 - (this.f15839b * i15)) / 2.0f);
        if (f11 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f11);
        } else {
            z11 = false;
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        if (z11) {
            canvas.restore();
        }
        if (z10) {
            getDrawable().setAlpha(255);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h6.class == obj.getClass()) {
            h6 h6Var = (h6) obj;
            if (Float.compare(this.f15839b, h6Var.f15839b) == 0 && this.f15840c == h6Var.f15840c && Objects.equals(this.d, h6Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.e && fontMetricsInt2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = fontMetricsInt2.top;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = fontMetricsInt2.ascent;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = fontMetricsInt2.descent;
        } else {
            i14 = 0;
        }
        if (z10) {
            i15 = fontMetricsInt2.bottom;
        } else {
            i15 = 0;
        }
        if (z10) {
            i16 = fontMetricsInt2.leading;
        } else {
            i16 = 0;
        }
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
        int i17 = (int) (this.f15839b * this.f15840c);
        Paint.FontMetricsInt fontMetricsInt4 = this.f15838a;
        if (fontMetricsInt4 == null) {
            int size = super.getSize(paint, charSequence, i10, i11, fontMetricsInt3);
            int L = i0.L(8.0f);
            int L2 = i0.L(10.0f);
            int i18 = (-L2) - L;
            fontMetricsInt3.top = i18;
            int i19 = L2 - L;
            fontMetricsInt3.bottom = i19;
            fontMetricsInt3.ascent = i18;
            fontMetricsInt3.leading = 0;
            fontMetricsInt3.descent = i19;
            if (z10) {
                fontMetricsInt3.top = i12;
                fontMetricsInt3.ascent = i13;
                fontMetricsInt3.descent = i14;
                fontMetricsInt3.bottom = i15;
                fontMetricsInt3.leading = i16;
                a(fontMetricsInt3, this.f15841f);
            }
            return size;
        }
        fontMetricsInt3.ascent = fontMetricsInt4.ascent;
        fontMetricsInt3.descent = fontMetricsInt4.descent;
        fontMetricsInt3.top = fontMetricsInt4.top;
        fontMetricsInt3.bottom = fontMetricsInt4.bottom;
        if (getDrawable() != null) {
            getDrawable().setBounds(0, 0, i17, i17);
        }
        if (z10) {
            fontMetricsInt3.top = i12;
            fontMetricsInt3.ascent = i13;
            fontMetricsInt3.descent = i14;
            fontMetricsInt3.bottom = i15;
            fontMetricsInt3.leading = i16;
            a(fontMetricsInt3, this.f15841f);
        }
        return i17;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof g6) {
            ((g6) getDrawable()).f15679b = 285212671 & textPaint.getColor();
        }
        super.updateDrawState(textPaint);
    }
}
