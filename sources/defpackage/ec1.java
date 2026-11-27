package defpackage;

import android.text.TextPaint;
public final class ec1 implements erc {
    public final byte a;
    public final TextPaint b;

    public ec1(TextPaint textPaint, byte b) {
        this.a = b;
        this.b = textPaint;
    }

    public final float a(CharSequence charSequence) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        switch (b) {
            case 0:
                return textPaint.measureText(charSequence, 0, charSequence.length());
            default:
                return textPaint.measureText(charSequence, 0, charSequence.length());
        }
    }

    @Override
    public final void b(float f, float f2, int i) {
        this.b.setShadowLayer(f, 0.0f, f2, i);
    }
}
