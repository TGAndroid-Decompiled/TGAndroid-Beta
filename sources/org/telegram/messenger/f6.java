package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;
public final class f6 extends ImageSpan {
    public Paint.FontMetricsInt f22369a;
    public float f22370b;
    public int f22371c;
    public String d;
    public boolean f22372e;
    public int f22373f;
    public boolean h;
    public float f22374n;
    public float f22375r;

    public static void a(Paint.FontMetricsInt fontMetricsInt, int i7) {
        int i10 = fontMetricsInt.descent;
        int i11 = fontMetricsInt.ascent;
        int i12 = i10 - i11;
        if (i7 <= i12) {
            return;
        }
        int i13 = i7 - i12;
        int i14 = (i13 + 1) / 2;
        int i15 = i11 - i14;
        fontMetricsInt.ascent = i15;
        fontMetricsInt.descent = i10 + (i13 - i14);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i15);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z9;
        this.f22374n = a8.p0.f(this.f22370b, this.f22371c, 2.0f, f10);
        this.f22375r = ((i13 - i11) / 2.0f) + i11;
        boolean z10 = true;
        this.h = true;
        if (paint.getAlpha() != 255 && i6.f23063n) {
            getDrawable().setAlpha(paint.getAlpha());
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = i6.f23062m;
        int i14 = this.f22371c;
        float f12 = f11 - ((i14 - (this.f22370b * i14)) / 2.0f);
        if (f12 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f12);
        } else {
            z10 = false;
        }
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        if (z10) {
            canvas.restore();
        }
        if (z9) {
            getDrawable().setAlpha(255);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f6.class == obj.getClass()) {
            f6 f6Var = (f6) obj;
            if (Float.compare(this.f22370b, f6Var.f22370b) == 0 && this.f22371c == f6Var.f22371c && Objects.equals(this.d, f6Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.f22372e && fontMetricsInt2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i11 = fontMetricsInt2.top;
        } else {
            i11 = 0;
        }
        if (z9) {
            i12 = fontMetricsInt2.ascent;
        } else {
            i12 = 0;
        }
        if (z9) {
            i13 = fontMetricsInt2.descent;
        } else {
            i13 = 0;
        }
        if (z9) {
            i14 = fontMetricsInt2.bottom;
        } else {
            i14 = 0;
        }
        if (z9) {
            i15 = fontMetricsInt2.leading;
        } else {
            i15 = 0;
        }
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
        int i16 = (int) (this.f22370b * this.f22371c);
        Paint.FontMetricsInt fontMetricsInt4 = this.f22369a;
        if (fontMetricsInt4 == null) {
            int size = super.getSize(paint, charSequence, i7, i10, fontMetricsInt3);
            int L = g0.L(8.0f);
            int L2 = g0.L(10.0f);
            int i17 = (-L2) - L;
            fontMetricsInt3.top = i17;
            int i18 = L2 - L;
            fontMetricsInt3.bottom = i18;
            fontMetricsInt3.ascent = i17;
            fontMetricsInt3.leading = 0;
            fontMetricsInt3.descent = i18;
            if (z9) {
                fontMetricsInt3.top = i11;
                fontMetricsInt3.ascent = i12;
                fontMetricsInt3.descent = i13;
                fontMetricsInt3.bottom = i14;
                fontMetricsInt3.leading = i15;
                a(fontMetricsInt3, this.f22373f);
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
        if (z9) {
            fontMetricsInt3.top = i11;
            fontMetricsInt3.ascent = i12;
            fontMetricsInt3.descent = i13;
            fontMetricsInt3.bottom = i14;
            fontMetricsInt3.leading = i15;
            a(fontMetricsInt3, this.f22373f);
        }
        return i16;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof e6) {
            ((e6) getDrawable()).f22192b = 285212671 & textPaint.getColor();
        }
        super.updateDrawState(textPaint);
    }
}
