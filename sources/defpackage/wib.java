package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class wib extends MetricAffectingSpan {
    public final int a;
    public final vib b;

    public wib(vib vibVar, int i) {
        this.b = vibVar;
        if (i > 0) {
            this.a = i;
        }
    }

    public final void a(TextPaint textPaint) {
        vib vibVar = this.b;
        if (fod.a(vibVar.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (fod.a(vibVar.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (fod.a(vibVar.a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final boolean b() {
        if ((this.b.a & 256) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.a;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.a;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }
}
