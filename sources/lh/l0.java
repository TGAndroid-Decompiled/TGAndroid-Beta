package lh;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class l0 extends CharacterStyle {
    public final float f15871a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f15871a * textPaint.getAlpha()));
    }
}
