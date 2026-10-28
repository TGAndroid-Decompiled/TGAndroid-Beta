package di;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class o0 extends CharacterStyle {
    public final float f8855a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f8855a * textPaint.getAlpha()));
    }
}
