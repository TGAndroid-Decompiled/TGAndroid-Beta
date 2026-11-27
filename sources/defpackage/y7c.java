package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class y7c extends MetricAffectingSpan {
    public Typeface a;
    public int b;
    public int c;

    public y7c() {
        Typeface typeface = Typeface.DEFAULT;
        this.c = -1;
        this.a = typeface;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.c;
        if (i >= 0) {
            this.b = aob.w0(null, i, false);
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

    public y7c(Typeface typeface) {
        this.c = -1;
        this.a = typeface;
    }

    public y7c(Typeface typeface, int i) {
        this.c = -1;
        this.a = typeface;
        this.b = i;
    }
}
