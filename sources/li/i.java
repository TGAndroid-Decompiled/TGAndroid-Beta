package li;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i extends MetricAffectingSpan {
    public static final Typeface[] f14756c;
    public final int f14757a;
    public final int f14758b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f14756c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public i(int i10) {
        int i11;
        this.f14758b = i10;
        if ((i10 & 256) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.f14757a = i11 | ((i10 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f14756c[this.f14757a]);
    }
}
