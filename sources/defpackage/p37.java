package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class p37 extends CharacterStyle {
    public final byte a;

    public p37(q37 q37Var) {
        this.a = (byte) 0;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(hl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(aob.w0(null, aob.n6, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(aob.T2.getColor());
                return;
            case 2:
                textPaint.setColor(aob.o2.linkColor);
                return;
            case 3:
                return;
            default:
                textPaint.setAlpha(128);
                return;
        }
    }

    public p37(byte b) {
        this.a = b;
    }

    private final void a(TextPaint textPaint) {
    }
}
