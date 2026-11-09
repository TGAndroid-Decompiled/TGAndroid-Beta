package di;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class l0 extends CharacterStyle {
    public final float f9303a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f9303a * textPaint.getAlpha()));
    }
}
