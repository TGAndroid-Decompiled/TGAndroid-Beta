package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class f6c extends MetricAffectingSpan {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte d;
    public final wkb e;

    public f6c(CharSequence charSequence, int i, int i2, byte b, wkb wkbVar) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = b;
        this.e = wkbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(gm.L(gda.S0 - 1));
        byte b = this.d;
        if (b == 2) {
            textPaint.setColor(-1);
        } else if (b == 1) {
            textPaint.setColor(cmb.w0(null, cmb.Vc, false));
        } else {
            textPaint.setColor(cmb.w0(null, cmb.Uc, false));
        }
        wkb wkbVar = this.e;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(gm.L(gda.S0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        wkb wkbVar = this.e;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
