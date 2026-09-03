package nh;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class m0 extends CharacterStyle {
    public final float f15580a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f15580a * textPaint.getAlpha()));
    }
}
