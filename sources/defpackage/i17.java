package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class i17 extends CharacterStyle {
    public final byte a;

    public i17(j17 j17Var) {
        this.a = (byte) 0;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(gl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bkb.w0(null, bkb.m6, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(bkb.S2.getColor());
                return;
            case 2:
                textPaint.setColor(bkb.n2.linkColor);
                return;
            case 3:
                return;
            default:
                textPaint.setAlpha(128);
                return;
        }
    }

    public i17(byte b) {
        this.a = b;
    }

    private final void a(TextPaint textPaint) {
    }
}
