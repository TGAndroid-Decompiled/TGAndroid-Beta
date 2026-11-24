package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class shb extends MetricAffectingSpan {
    public TextPaint a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        textPaint.setColor(textPaint2.getColor());
        textPaint.setTypeface(textPaint2.getTypeface());
        textPaint.setFlags(textPaint2.getFlags());
        textPaint.setTextSize(textPaint2.getTextSize());
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        textPaint.setColor(textPaint2.getColor());
        textPaint.setTypeface(textPaint2.getTypeface());
        textPaint.setFlags(textPaint2.getFlags());
        textPaint.setTextSize(textPaint2.getTextSize());
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }
}
