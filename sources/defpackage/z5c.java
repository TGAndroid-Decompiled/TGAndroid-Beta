package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class z5c extends MetricAffectingSpan {
    public Typeface a;
    public int b;
    public int c;

    public z5c() {
        Typeface typeface = Typeface.DEFAULT;
        this.c = -1;
        this.a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.c;
        if (i >= 0) {
            this.b = cmb.w0(null, i, false);
        }
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i2 = this.b;
        if (i2 != 0) {
            textPaint.setColor(i2);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public z5c(Typeface typeface) {
        this.c = -1;
        this.a = typeface;
    }

    public z5c(Typeface typeface, int i) {
        this.c = -1;
        this.a = typeface;
        this.b = i;
    }
}
