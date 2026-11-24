package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class e3b extends CharacterStyle {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (textPaint.getAlpha() * 0.66f));
    }
}
