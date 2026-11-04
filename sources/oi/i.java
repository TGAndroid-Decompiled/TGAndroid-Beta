package oi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i extends MetricAffectingSpan {
    public static final Typeface[] f21144c;
    public final int f21145a;
    public final int f21146b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f21144c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public i(int i3) {
        int i10;
        this.f21146b = i3;
        if ((i3 & 256) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f21145a = i10 | ((i3 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f21144c[this.f21145a]);
    }
}
