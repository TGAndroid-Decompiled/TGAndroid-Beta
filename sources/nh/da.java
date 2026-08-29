package nh;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class da extends CharacterStyle {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(128);
    }
}
