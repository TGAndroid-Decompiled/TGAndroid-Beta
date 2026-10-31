package di;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class j extends MetricAffectingSpan {
    public static final Typeface[] f5968c;
    public final int f5969a;
    public final int f5970b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f5968c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public j(int i10) {
        int i11;
        this.f5970b = i10;
        if ((i10 & 256) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.f5969a = i11 | ((i10 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f5968c[this.f5969a]);
    }
}
