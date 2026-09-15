package ai;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class f1 extends CharacterStyle {
    public final float f781a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f781a * textPaint.getAlpha()));
    }
}
