package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;
public final class g6 extends ImageSpan {
    public Paint.FontMetricsInt f23695a;
    public float f23696b;
    public int f23697c;
    public String d;
    public boolean f23698e;
    public int f23699f;
    public boolean h;
    public float f23700n;
    public float f23701r;

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
        boolean z10;
        this.f23700n = a8.p0.f(this.f23696b, this.f23697c, 2.0f, f10);
        this.f23701r = ((i13 - i11) / 2.0f) + i11;
        boolean z11 = true;
        this.h = true;
        if (paint.getAlpha() != 255 && j6.f24536n) {
            getDrawable().setAlpha(paint.getAlpha());
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = j6.f24535m;
        int i14 = this.f23697c;
        float f12 = f11 - ((i14 - (this.f23696b * i14)) / 2.0f);
        if (f12 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f12);
        } else {
            z11 = false;
        }
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
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
        if (obj != null && g6.class == obj.getClass()) {
            g6 g6Var = (g6) obj;
            if (Float.compare(this.f23696b, g6Var.f23696b) == 0 && this.f23697c == g6Var.f23697c && Objects.equals(this.d, g6Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.f23698e && fontMetricsInt2 != null) {
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
        int i16 = (int) (this.f23696b * this.f23697c);
        Paint.FontMetricsInt fontMetricsInt4 = this.f23695a;
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
            if (z10) {
                fontMetricsInt3.top = i11;
                fontMetricsInt3.ascent = i12;
                fontMetricsInt3.descent = i13;
                fontMetricsInt3.bottom = i14;
                fontMetricsInt3.leading = i15;
                a(fontMetricsInt3, this.f23699f);
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
            a(fontMetricsInt3, this.f23699f);
        }
        return i16;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof f6) {
            ((f6) getDrawable()).f23450b = 285212671 & textPaint.getColor();
        }
        super.updateDrawState(textPaint);
    }
}
