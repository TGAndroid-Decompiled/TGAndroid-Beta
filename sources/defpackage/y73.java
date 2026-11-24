package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class y73 extends MetricAffectingSpan {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * 0.1d);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() * 0.1d);
    }
}
