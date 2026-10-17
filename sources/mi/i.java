package mi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class i extends MetricAffectingSpan {
    public static final Typeface[] f16950c;
    public final int f16951a;
    public final int f16952b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f16950c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public i(int i10) {
        int i11;
        this.f16952b = i10;
        if ((i10 & 256) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.f16951a = i11 | ((i10 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f16950c[this.f16951a]);
    }
}
