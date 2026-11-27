package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class e8c extends MetricAffectingSpan {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte d;
    public final rmb e;

    public e8c(CharSequence charSequence, int i, int i2, byte b, rmb rmbVar) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = b;
        this.e = rmbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(hl.L(xea.S0 - 1));
        byte b = this.d;
        if (b == 2) {
            textPaint.setColor(-1);
        } else if (b == 1) {
            textPaint.setColor(aob.w0(null, aob.Wc, false));
        } else {
            textPaint.setColor(aob.w0(null, aob.Vc, false));
        }
        rmb rmbVar = this.e;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(hl.L(xea.S0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        rmb rmbVar = this.e;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
