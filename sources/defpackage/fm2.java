package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class fm2 extends CharacterStyle {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (textPaint.getAlpha() * 0.65f));
    }
}
