package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;
public final class f6 extends ImageSpan {
    public Paint.FontMetricsInt f22452a;
    public float f22453b;
    public int f22454c;
    public String d;
    public boolean f22455e;
    public int f22456f;
    public boolean h;
    public float f22457n;
    public float f22458r;

    public static void a(Paint.FontMetricsInt fontMetricsInt, int i3) {
        int i10 = fontMetricsInt.descent;
        int i11 = fontMetricsInt.ascent;
        int i12 = i10 - i11;
        if (i3 <= i12) {
            return;
        }
        int i13 = i3 - i12;
        int i14 = (i13 + 1) / 2;
        int i15 = i11 - i14;
        fontMetricsInt.ascent = i15;
        fontMetricsInt.descent = i10 + (i13 - i14);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i15);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10;
        this.f22457n = a1.g.e(this.f22453b, this.f22454c, 2.0f, f10);
        this.f22458r = ((i13 - i11) / 2.0f) + i11;
        boolean z11 = true;
        this.h = true;
        if (paint.getAlpha() != 255 && i6.f23457n) {
            getDrawable().setAlpha(paint.getAlpha());
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = i6.f23456m;
        int i14 = this.f22454c;
        float f12 = f11 - ((i14 - (this.f22453b * i14)) / 2.0f);
        if (f12 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f12);
        } else {
            z11 = false;
        }
        super.draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
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
        if (obj != null && f6.class == obj.getClass()) {
            f6 f6Var = (f6) obj;
            if (Float.compare(this.f22453b, f6Var.f22453b) == 0 && this.f22454c == f6Var.f22454c && Objects.equals(this.d, f6Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.f22455e && fontMetricsInt2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = fontMetricsInt2.top;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = fontMetricsInt2.ascent;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = fontMetricsInt2.descent;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = fontMetricsInt2.bottom;
        } else {
            i14 = 0;
        }
        if (z10) {
            i15 = fontMetricsInt2.leading;
        } else {
            i15 = 0;
        }
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
        int i16 = (int) (this.f22453b * this.f22454c);
        Paint.FontMetricsInt fontMetricsInt4 = this.f22452a;
        if (fontMetricsInt4 == null) {
            int size = super.getSize(paint, charSequence, i3, i10, fontMetricsInt3);
            int L = g0.L(8.0f);
            int L2 = g0.L(10.0f);
            int i17 = (-L2) - L;
            fontMetricsInt3.top = i17;
            int i18 = L2 - L;
            fontMetricsInt3.bottom = i18;
            fontMetricsInt3.ascent = i17;
            fontMetricsInt3.leading = 0;
            fontMetricsInt3.descent = i18;
            if (z10) {
                fontMetricsInt3.top = i11;
                fontMetricsInt3.ascent = i12;
                fontMetricsInt3.descent = i13;
                fontMetricsInt3.bottom = i14;
                fontMetricsInt3.leading = i15;
                a(fontMetricsInt3, this.f22456f);
            }
            return size;
        }
        fontMetricsInt3.ascent = fontMetricsInt4.ascent;
        fontMetricsInt3.descent = fontMetricsInt4.descent;
        fontMetricsInt3.top = fontMetricsInt4.top;
        fontMetricsInt3.bottom = fontMetricsInt4.bottom;
        if (getDrawable() != null) {
            getDrawable().setBounds(0, 0, i16, i16);
        }
        if (z10) {
            fontMetricsInt3.top = i11;
            fontMetricsInt3.ascent = i12;
            fontMetricsInt3.descent = i13;
            fontMetricsInt3.bottom = i14;
            fontMetricsInt3.leading = i15;
            a(fontMetricsInt3, this.f22456f);
        }
        return i16;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof e6) {
            ((e6) getDrawable()).f22320b = 285212671 & textPaint.getColor();
        }
        super.updateDrawState(textPaint);
    }
}
