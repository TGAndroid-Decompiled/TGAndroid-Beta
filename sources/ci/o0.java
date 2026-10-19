package ci;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class o0 extends CharacterStyle {
    public final float f5681a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f5681a * textPaint.getAlpha()));
    }
}
