package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class k extends MetricAffectingSpan {
    public static final Typeface[] f20635c;
    public final int f20636a;
    public final int f20637b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f20635c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public k(int i7) {
        int i10;
        this.f20637b = i7;
        if ((i7 & 256) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f20636a = i10 | ((i7 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f20635c[this.f20636a]);
    }
}
