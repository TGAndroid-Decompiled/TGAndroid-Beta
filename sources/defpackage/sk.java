package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class sk extends CharacterStyle {
    public final byte a;
    public int b;

    public sk() {
        this.a = (byte) 2;
        this.b = 0;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(hl.o());
                textPaint.setColor(this.b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(aob.p1(textPaint.getAlpha() / 255.0f, this.b));
                return;
        }
    }

    public sk(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public sk(byte b, int i, boolean z) {
        this.a = b;
        this.b = i;
    }
}
