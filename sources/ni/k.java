package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class k extends MetricAffectingSpan {
    public static final Typeface[] f20630c;
    public final int f20631a;
    public final int f20632b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f20630c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public k(int i7) {
        int i10;
        this.f20632b = i7;
        if ((i7 & 256) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f20631a = i10 | ((i7 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f20630c[this.f20631a]);
    }
}
