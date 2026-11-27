package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class kk2 extends MetricAffectingSpan {
    public static final Typeface[] c;
    public final int a;
    public final int b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public kk2(int i) {
        int i2;
        this.b = i;
        if ((i & 256) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.a = i2 | ((i & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(c[this.a]);
    }
}
