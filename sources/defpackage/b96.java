package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b96 extends CharacterStyle {
    public final float a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.a * textPaint.getAlpha()));
    }
}
