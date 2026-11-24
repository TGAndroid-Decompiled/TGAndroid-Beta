package defpackage;

import android.text.TextPaint;
public final class ed1 implements roc {
    public final byte a;
    public final TextPaint b;

    public ed1(TextPaint textPaint, byte b) {
        this.a = b;
        this.b = textPaint;
    }

    @Override
    public final void a(float f, float f2, int i) {
        this.b.setShadowLayer(f, 0.0f, f2, i);
    }

    public final float b(CharSequence charSequence) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        switch (b) {
            case 0:
                return textPaint.measureText(charSequence, 0, charSequence.length());
            default:
                return textPaint.measureText(charSequence, 0, charSequence.length());
        }
    }
}
