package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class f4c extends MetricAffectingSpan {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte d;
    public final vib e;

    public f4c(CharSequence charSequence, int i, int i2, byte b, vib vibVar) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = b;
        this.e = vibVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(gl.L(gba.S0 - 1));
        byte b = this.d;
        if (b == 2) {
            textPaint.setColor(-1);
        } else if (b == 1) {
            textPaint.setColor(bkb.w0(null, bkb.Vc, false));
        } else {
            textPaint.setColor(bkb.w0(null, bkb.Uc, false));
        }
        vib vibVar = this.e;
        if (vibVar != null) {
            vibVar.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(gl.L(gba.S0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        vib vibVar = this.e;
        if (vibVar != null) {
            vibVar.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
