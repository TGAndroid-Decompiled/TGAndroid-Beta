package jh;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class l0 extends CharacterStyle {

    public final float f13607a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f13607a * textPaint.getAlpha()));
    }
}
