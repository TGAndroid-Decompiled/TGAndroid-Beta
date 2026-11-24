package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class i37 extends CharacterStyle {
    public final byte a;

    public i37(j37 j37Var) {
        this.a = (byte) 0;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(gm.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(cmb.w0(null, cmb.m6, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(cmb.S2.getColor());
                return;
            case 2:
                textPaint.setColor(cmb.n2.linkColor);
                return;
            case 3:
                return;
            default:
                textPaint.setAlpha(128);
                return;
        }
    }

    public i37(byte b) {
        this.a = b;
    }

    private final void a(TextPaint textPaint) {
    }
}
